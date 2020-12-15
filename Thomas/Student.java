public abstract class Student extends Person{
  private String mentor;
  private String major;
  private String minor;
  private String gotping;

  public Student(String firstName,String lastName,String address, String phoneNumber,String membertype,String mentor,String major,String minor, String gotping){
    super(firstName,lastName,address,phoneNumber,membertype);
    this.mentor=mentor;
    this.major=major;
    this.minor=minor;
    this.gotping=gotping;
  }

  public void setMentor(String mentor){
    this.mentor = mentor;
  }

  public String getMentor(){
    return mentor;
  }
  public String getMajor(){
    return major;
  }

  public String getMinor(){
    return minor;
  }
public String getgotping(){
  return gotping;
}
  public void setMajor(String major){
    this.major = major;
  }

  public void setMinor(String minor){
    this.minor = minor;
  }
  public void setgotping(String gotping){
    this.gotping = gotping;
  }

  public  String toString(){
    if (gotping.equalsIgnoreCase("Yes")) {
      return super.toString()+"\nmajor: "+major +"\nminor: "+minor + "\n" + gotping + " I have Been Ping By My Mentor";
  }
  if (gotping.equalsIgnoreCase("No")) {
    return super.toString()+"\nmajor: "+major +"\nminor: "+minor + "\n" + gotping + " I have Not Been Ping By My Mentor";
  }
  else {
    return super.toString()+"\nmajor: "+major +"\nminor: "+minor + "\n" + gotping;
  }
}
}
