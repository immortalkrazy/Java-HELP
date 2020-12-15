public class Graduate extends Student {
      //public String degree = "";
      private String major="";
      private String minor="";
      private String mentor;
      private String gotping;
      public Graduate(String firstName,String lastName,String address,String phoneNumber,String membertype,String mentor,String major,String minor,String gotping)
      {
  		super(firstName,lastName,address,phoneNumber,membertype,mentor,major,minor, gotping);
      // this.major = major;
      // this.minor = minor;
      //this.degree = degree;
  	}


  //  public void setDegree(String degree){
    //  this.degree = degree;
    //}

    //public String getDegree(){
    //  return degree;
    //}
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
    //   return super.toString() +"\nmajor: "+major +"\nminor: "+minor;
    // }

}
