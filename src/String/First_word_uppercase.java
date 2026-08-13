package String;

import java.util.Arrays;

public class First_word_uppercase {

	public static void main(String[] args) {
		String s="Java is easy lang";
		String res[]=s.split(" ");
		System.out.println(Arrays.toString(res));
		String value="";
		for(int i=0;i<res.length;i++) {
			String r=res[i];
			value+=Character.toUpperCase(r.charAt(0))+r.substring(1)+ " ";
		}
			System.out.println(value);
			

	}

}
