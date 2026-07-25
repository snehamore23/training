package training;

public class Condistional_operator {

	public static void main(String[] args) {
int a=10;
int b=20;
System.out.println((a>b)?a:b);

int max=(a>b)?a:b;
System.out.println(max);

boolean value=(a>b)?true:false;
System.out.println(value);

char ch=(a>b)? 'a':'b';
System.out.println(ch);

String s=(a>b)?"a is greater":"b is greater";
System.out.println(s);


	}

}
