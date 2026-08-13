package String;

public class Panagram {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		String uniq="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(!uniq.contains(ch+"")) {
					uniq+=ch;
				}
				}
		}
		if (uniq.length()==26)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}

}
