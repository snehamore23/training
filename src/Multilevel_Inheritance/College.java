package Multilevel_Inheritance;

public class College {

	String collegeName;
    String location;
    
    public void collegeInfo() {
    	System.out.println("CollegeName: " +collegeName);
System.out.println("Location: " +location);    
}
    public College(String collegeName, String location){
    this.collegeName=collegeName;
    this.location=location;
    }
    
	public static void main(String[] args) {
		College c= new College("pvg","nashik");
		c.collegeInfo();
		
		
		// TODO Auto-generated method stub

	}

}
