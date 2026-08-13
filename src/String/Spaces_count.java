package String;

public class Spaces_count {

	public static void main(String[] args) {
	String s="Java is Easy Lang";
			int space=0;
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				
				if(ch==' ')
					space++;
			}
			System.out.println("Space: "+space);

	}

}
