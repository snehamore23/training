package String;

public class Reverse_each_word {

	public static String reverse(String s) {
		String res="";

		for(int i=0;i<s.length();i++) { 
			char ch=s.charAt(i);
			res=ch+res;
		}
		return res;
	}
public static void main(String args[]) {
	String s="Java is easy lang";
	String res[]=s.split(" ");
	String temp="";
	
	for(int i=0;i<res.length;i++) {
		String r=res[i];
		temp=temp+reverse(r)+" ";
	}
	System.out.println(temp);
}
}
