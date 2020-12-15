public class Faculty extends Person{
  private String student;
  private String pingStudent;

  public Faculty(String firstName,String lastName,String address,String phoneNumber, String membertype,String student, String pingStudent){
    super(firstName,lastName,address,phoneNumber,membertype);
    this.student=student;
    this.pingStudent = pingStudent;

  }

  public void setStudent(String student){
    this.student=student;
  }
  public String getStudent(){
    return student;
  }
  public String getPing(){
    return pingStudent;
  }

  public void setPing(String pingStudent){
    this.pingStudent = pingStudent;
  }
  public String toString(){
    return super.toString() + "\nstudent: "+student;

}
}
