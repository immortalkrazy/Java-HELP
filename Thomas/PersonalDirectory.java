import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.io.FileNotFoundException;


public class PersonalDirectory {
  public static void main(String []args)throws FileNotFoundException{
    File sourceFile = new File(args[0]);
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(sourceFile);
    ArrayList<Person> people = new ArrayList<Person>();
    if (!sourceFile.exists()) {
     System.out.println("Source file " + args[0] + " does not exist");
  }else if (!sourceFile.canRead()) {
    System.out.println("The directory " + args[0] + " isn't readable.");
  }
  String info;
  String[] infos = new String[100];

  while(input.hasNext()){
    info = input.nextLine();
    infos = info.split("/");
    people.add(createObject(infos));
  }

  while(true){
    System.out.println("Finding personal address book:"+ "\nEnter 1 using first name" + "\nEnter 2 using last name" + "\nEnter 3 using member type"+ "\nEnter 4 using mentor's name "+
    "\nEnter 5 using addEntry"+"\nEnter 6 using editEntry"+"\nEnter 7 using deleteEntry"+ "\nEnter 8 using list entries" + "\nEnter 0 to quit");
    int x = sc.nextInt();
    if (x==0){
      System.exit(0);
    }
    else if (x==1){
      findFirstName(people);

    }
    else if (x==2){
      findLastName(people);

    }
    else if (x==3){
      findMemberType(people);

    }
    else if (x==4){
      findMentor(people);

    }
    else if(x == 5){
      addEntry(people,args[0]);

    }
    else if(x == 6){
      editEntry(people,args[0]);
    }
    else if(x == 7){
      deleteEntry(people,args[0]);
    }
    else if(x == 8){
      listingEntries(people);
    }


    else{
      System.out.println("there is no such command");
    }
  }
  }
  public static void findFirstName(ArrayList<Person> people){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first name");
    String firstNameToFind = sc.nextLine();
    int matches =0;
    for (Person person:people){
      try{
      if (person.getFirstName().equalsIgnoreCase(firstNameToFind)){
        System.out.println("------------------------------");
        System.out.println(person.toString());
        matches++;
      }
    } catch(NullPointerException e){

    }
  }
    if (matches <=0)
      System.out.println("there is no such person");

  }
  public static void findLastName(ArrayList<Person> people){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter last name");
    String lastNameToFind = sc.nextLine();
    int matches =0;
    for (Person person:people){
      try{
      if (person.getLastName().equalsIgnoreCase(lastNameToFind)){
        System.out.println("------------------------------");
        System.out.println(person.toString());
        matches++;
      }
    }catch(NullPointerException e){

    }
  }
    if (matches <=0)
      System.out.println("there is no such person");

  }
  public static void findMemberType(ArrayList<Person> people){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter membertype");
    String memberTypetoFind = sc.nextLine();
    int matches =0;
    for (Person person:people){
      try{
      if (person.getMemberType().equalsIgnoreCase(memberTypetoFind)){
        System.out.println("------------------------------");
        System.out.println(person.toString());
        matches++;
      }
    }catch(NullPointerException e){

    }
  }
    if (matches <=0)
      System.out.println("there is no such person");

  }
  public static void findMentor(ArrayList<Person> people){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first name and last name of the mentor");
    String mentorToFind = sc.nextLine();
    int matches =0;
    for (Person person:people){
      try{
      if(person.getMemberType().equalsIgnoreCase("Undergraduate")||person.getMemberType().equalsIgnoreCase("Graduate")){
        if (((Student)person).getMentor().equalsIgnoreCase(mentorToFind)){
          System.out.println("------------------------------");
          System.out.println(person.toString());
          matches++;
        }
      }
    }catch(NullPointerException e){

    }
  }
    if (matches <=0)
      System.out.println("there is no such person");
  }

  public static Person createObject(String [] infos){
    Person person = new Person();
    if(infos[4].equalsIgnoreCase("Undergraduate"))
      person = new Undergraduate(infos[0],infos[1],infos[2],infos[3],infos[4],infos[5],infos[6],infos[7],infos[8]);
    if(infos[4].equalsIgnoreCase("Graduate"))
      person = new Graduate(infos[0],infos[1],infos[2],infos[3],infos[4],infos[5],infos[6],infos[7], infos[8]);
    if(infos[4].equalsIgnoreCase("Advisor"))
       person = new Advisor(infos[0],infos[1],infos[2],infos[3],infos[4],infos[5],infos[6]);
    if(infos[4].equalsIgnoreCase("IndustryMentor"))
       person = new IndustryMentor(infos[0],infos[1],infos[2],infos[3],infos[4],infos[5],infos[6]);
    return person;
  }

  public static void addEntry(ArrayList<Person> people, String fileName){
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter person address book entry by following format");
  System.out.println("Undergraduate: first-name/last-name/address/phoneNumber/memberType/mentor-name/major/minor/Do you know If Your Mentor Pinged you? (Yes or No)");
  System.out.println("Graduate: first-name/last-name/address/phoneNumber/memberType/mentor-name/major/minor/Do you Know If Your Mentor Pinged you? (Yes or No) ");
  System.out.println("IndustryMentor: first-name/last-name/address/phoneNumber/memberType/student-name/Do you want to ping Your Student? (Yes or No) ");
  System.out.println("Advisor: first-name/last-name/address/phoneNumber/memberType/student-name/Do you want to ping Your Student? (Yes or No) ");
  System.out.println("Use / split each of infomation");
  String info = sc.nextLine();
  String infos[] = info.split("/");
  people.add(createObject(infos));
  addEntryToFile(people,fileName);
  if(infos[6].equalsIgnoreCase("Yes")) {
    System.out.println("Enter Your Student First Name you are trying to ping");
    String PingFirst = sc.nextLine();
    System.out.println("Enter Your Student Last Name you are trying to ping");
    String PingLast = sc.nextLine();
    int matches =0;
    Person entry = new Person();
    for (Person person:people){
    if (infos[4].equalsIgnoreCase("Advisor")) {
        if (person.getFirstName().equalsIgnoreCase(PingFirst)){
          if(person.getLastName().equalsIgnoreCase(PingLast)){
          System.out.println("------------------------------");
          System.out.println(person.toString());
          matches++;
          System.out.println("You Have Pinged: " + PingFirst + " " + PingLast);
          for(int i = 0; i < people.size(); i++){
            if(people.get(i).getFirstName().equalsIgnoreCase(PingFirst)){
              entry = people.get(i);
              entry.setgotping("Your Advisor Mentor:" + infos[0] + " " + infos[1] + " Has Pinged You");
            }
          }

  }
}
}
  if(infos[4].equalsIgnoreCase("IndustryMentor")) {
      if (person.getFirstName().equalsIgnoreCase(PingFirst)){
        if(person.getLastName().equalsIgnoreCase(PingLast)){
        System.out.println("------------------------------");
        System.out.println(person.toString());
        matches++;
        System.out.println("You Have Pinged: " + PingFirst + " " + PingLast);
        for(int i = 0; i < people.size(); i++){
          if(people.get(i).getFirstName().equalsIgnoreCase(PingFirst)){
            entry = people.get(i);
            entry.setgotping("Your Industry Mentor:" + infos[0] + " " + infos[1] + " Has Pinged You");
          }
        }
    }
  }
}
}
if (matches <=0){
  System.out.println("This Person Does not Exist");
  System.out.println("Please Press 5 to make an Entry For:" + PingFirst + " " + PingLast);
  matches++;
}
}
}

  public static void addEntryToFile(ArrayList<Person> people, String fileName){
    int size = people.size();
    try(PrintWriter output = new PrintWriter(fileName)){
      for(int i = 0; i < size; i++){
        Person person = people.get(i);
        String memberType = person.getMemberType();
        String entry = "";

        if(memberType.equalsIgnoreCase("Undergraduate")){
          entry = person.getFirstName()+"/"+person.getLastName()+"/"+person.getAddress()+"/"+person.getPhoneNumber()+
                  "/"+person.getMemberType()+"/"+((Undergraduate)person).getMentor()+"/"+((Undergraduate)person).getMajor()+
                  "/"+((Undergraduate)person).getMinor() + "/"+((Undergraduate)person).getgotping() ;
        }
        else if(memberType.equalsIgnoreCase("Graduate")){
          entry = person.getFirstName()+"/"+person.getLastName()+"/"+person.getAddress()+"/"+person.getPhoneNumber()+
                "/"+person.getMemberType()+"/"+((Graduate)person).getMentor()+"/"+((Graduate)person).getMajor()+ "/"+((Graduate)person).getMinor()+
                 "/"+((Graduate)person).getgotping();
        }
        else if(memberType.equalsIgnoreCase("IndustryMentor")){
          entry = person.getFirstName()+"/"+person.getLastName()+"/"+person.getAddress()+"/"+person.getPhoneNumber()+
                "/"+person.getMemberType()+"/"+((IndustryMentor)person).getStudent()+"/"+((IndustryMentor)person).getpingStudent();
}
        else if(memberType.equalsIgnoreCase("Advisor")){
          entry = person.getFirstName()+"/"+person.getLastName()+"/"+person.getAddress()+"/"+person.getPhoneNumber()+
                "/"+person.getMemberType()+"/"+((Advisor)person).getStudent()+"/"+((Advisor)person).getpingStudent();
        }
        output.println(entry);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }
  }

  public static void editEntry(ArrayList<Person> people, String fileName){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter entry's first name that you want to edit.");
    String firstName = sc.nextLine();
    Person entry = new Person();

    for(int i = 0; i < people.size(); i++){
      if(people.get(i).getFirstName().equalsIgnoreCase(firstName)){
        entry = people.get(i);
      }
    }
    try{
      if(entry.getFirstName().equals("")){
        System.out.println("Can not find entry by this first name.");
        return;
      }
    }catch(NullPointerException e){

    }

    System.out.println("Enter the property and it's value you want to edit." +
    "\nFor example'first name/Alex' add slash(/) between property and value." +
    "\nIf you want to change entry's menbertype, please use add entry function to create new one, \nand delete entry function to delete old one.");
    String info = sc.nextLine();
    String infos[] = info.split("/");
    if(infos[0].equalsIgnoreCase("first name")){
      entry.setFirstName(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else if(infos[0].equalsIgnoreCase("last name")){
      entry.setLastName(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else if(infos[0].equalsIgnoreCase("address")){
      entry.setAddress(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else if(infos[0].equalsIgnoreCase("phone number")){
      entry.setPhoneNumber(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else if(infos[0].equalsIgnoreCase("student")&& (entry instanceof Faculty)){
      ((Faculty)entry).setStudent(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else if(infos[0].equalsIgnoreCase("major")&& (entry instanceof Student)){
      ((Student)entry).setMajor(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else if(infos[0].equalsIgnoreCase("minor")&& (entry instanceof Student)){
      ((Student)entry).setMinor(infos[1]);
      System.out.println("entry is changed successful.");
    }
    else{
      System.out.println("No such property.");
    }

    addEntryToFile(people,fileName);
  }

  public static void deleteEntry(ArrayList<Person> people, String fileName){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter entry's first name that you want to delete.");
    String firstName = sc.nextLine();
    System.out.println("Enter entry's last name that you want to delete.");
    String lastName= sc.nextLine();
    for(int i = 0; i < people.size(); i++){
      if(people.get(i).getFirstName().equals(firstName) & people.get(i).getLastName().equals(lastName)){
        people.remove(i);
        System.out.println("Entry is deleted successfully.");
      }
    }

    addEntryToFile(people,fileName);
  }

  public static void listingEntries(ArrayList<Person> people){
    Collections.sort(people, new memberComparator());
    TreeMap<String,Person> list = new TreeMap<String,Person>();
    for(Person entry: people){
      list.put(entry.getLastName()+entry.getFirstName(),entry);
    }
    for(String name: list.keySet()){
      System.out.println("------------------------------");
      System.out.println(list.get(name).toString());
    }

  }

}
