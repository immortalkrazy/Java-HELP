public class Person{
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String membertype;
  private String gotping;
  public Person(){

  }
  public Person(String firstName, String lastName, String address, String phoneNumber,String membertype){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.membertype = membertype;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  public void setMemberType(String membertype){
    this.membertype = membertype;
  }
  public void setgotping(String gotping){
    this.gotping = gotping;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public String getAddress(){
    return address;
  }

  public String getPhoneNumber(){
    return phoneNumber;
  }
  public String getMemberType(){
    return membertype;
  }
  public String getgotping(){
    return gotping;
  }


  public String toString(){
    return "first name: " + firstName + "\nlast name: " + lastName + "\naddress: " + address + "\nphoneNumber: " + phoneNumber + "\nmembertype: " + membertype;
  }
}
