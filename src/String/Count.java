package String;

public class Count {

	public static void main(String[] args) {
		String s="aeiou @!+- xyz 12345";
		int vowel=0;
		int cons=0;
		int special=0;
		int number=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&& ch<='z')) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
				vowel++;
				else
					cons++;
			}
				else if(ch>='0'&&ch<='9')
						number++;
				else special++;
			
		}
		
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonant: "+cons);
		System.out.println("Special char: "+special);
		System.out.println("Numbers: "+number);
		
		
		}
	}
