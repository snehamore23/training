package String;

public class Remove_duplicate {

	public static void main(String[] args) {
		String s="Vaisnavi";
		String c="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(!c.contains(ch+"")) {
			c+=ch;
		}
	}
	System.out.println(c);
	}
}