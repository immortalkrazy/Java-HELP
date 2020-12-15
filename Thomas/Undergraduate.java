public class Undergraduate extends Student {
    private String major = "";
    private String minor = "";
    private String mentor;
    private String gotping;



    public Undergraduate(String firstName,String lastName,String address,String phoneNumber,String membertype,String mentor,String major,String minor, String gotping)
    {
        super(firstName,lastName,address,phoneNumber,membertype,mentor,major,minor, gotping);
        // this.major = major;
        // this.minor = minor;
    }

    // public String getMajor(){
    //   return major;
    // }
    //
    // public String getMinor(){
    //   return minor;
    // }
    //
    // public void setMajor(String major){
    //   this.major = major;
    // }
    //
    // public void setMinor(String minor){
    //   this.minor = minor;
    // }
    // public String toString(){
    //   return super.toString()+"\nmajor: "+major +"\nminor: "+minor;
    // }

    // public void setMentor(String mentor){
    //   this.mentor = mentor;
    // }
    //
    // public String getMentor(){
    //   return mentor;
    // }
    //

}
