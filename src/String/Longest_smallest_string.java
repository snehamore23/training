package String;

public class Longest_smallest_string {

	public static void main(String[] args) {
     String s= "The PVGCOE Student are very smart enough";
     String a[]=s.split(" ");
     String lword=a[0];
     
     for(int i=1; i<a.length;i++) {
    	 if(a[i].length()>lword.length())
    		 lword=a[i];
     }
     System.out.println("Longest: "+ lword);
	
     for(int i=1; i<a.length;i++) {
    	 if(a[i].length()<lword.length())
    		 lword=a[i];
     }
System.out.println("Smallest: "+ lword);

	}

}
