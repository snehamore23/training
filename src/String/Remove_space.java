package String;

public class Remove_space {

	public static void main(String[] args) {
		String s="Java is Easy Lang";
		
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch != ' ')
		
		s=s.replace(" " , "");
			System.out.print(s);
		}


	}


