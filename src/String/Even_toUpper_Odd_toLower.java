package String;

public class Even_toUpper_Odd_toLower {

	public static void main(String[] args) {
	String s="sneha";
	String v=" ";
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		
		if(i%2==0) {
			 v=v+Character.toUpperCase(ch); 
		}else {
			 v=v+Character.toLowerCase(ch); 
		}
	}
System.out.println(v);
	}

}
