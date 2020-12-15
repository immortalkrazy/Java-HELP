public class IndustryMentor extends Faculty {
  private String student;
  private String pingStudent;

  public IndustryMentor(String firstName,String lastName,String address,String phoneNumber,String membertype,String student, String pingStudent)
  {
      super(firstName,lastName,address,phoneNumber, membertype,student,pingStudent) ;
      this.pingStudent = pingStudent;
  }

  public String toString(){
    return super.toString();
  }
  public String getpingStudent(){
    return pingStudent;
  }
  public void setpingStudent(String pingStudent){
  this.pingStudent = pingStudent;
}
}
