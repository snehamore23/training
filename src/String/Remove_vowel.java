package String;

public class Remove_vowel {

	public static void main(String[] args) {
		String s="Vaisnavi";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if("aeiouAEIOU".indexOf(ch)== -1)
		System.out.print(ch);
		}

	}
}