package Multilevel_Inheritance;

public class College {

	int collegeName;
    String location;
    
    public void collegeInfo() {
    	System.out.println("CollegeName: " +collegeName);
System.out.println("Location: " +location);    
}
    public College(String collegeName, String location);{
    this.collegeName=collegeName;
    this.location=location;
    }
    
	public static void main(String[] args) {
		College c= new College();
		
		// TODO Auto-generated method stub

	}

}
