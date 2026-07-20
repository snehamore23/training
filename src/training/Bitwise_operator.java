package training;

public class Bitwise_operator {
  
	public static void main(String[] args) {
		
		System.out.println("----bitwise&--------");
		System.out.println(5&3);// 
		System.out.println(8&4);
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(false&true);
		System.out.println(false&false);
		System.out.println('A'&'A');
		System.out.println('a'&'a');
		
		//System.out.println('20.0'&'0.20');
		//System.out.println("String"&"String");
		
		
		
		System.out.println("----bitwise||------");
		System.out.println(5|3);// 
		System.out.println(8|4);
		System.out.println(true|true);
		System.out.println(true|false);
		System.out.println(false|true);
		System.out.println(false|false);
		System.out.println('A'|'A');
		System.out.println('a'|'a');
		
		//System.out.println('20.0'&'0.20');
		//System.out.println("String"&"String");
		
		
		System.out.println("----bitwise XOR ^------");
		System.out.println(12^14);// 
		System.out.println(8^4);
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		System.out.println('A'^'A');
		System.out.println('a'^'a');
		
		
		System.out.println("----bitwise left shift << ------");
		System.out.println(5<<1);// 
		System.out.println(10<<2);
		System.out.println('a'<<1);
		System.out.println('a'<<2);
		
		
		
		System.out.println("----bitwise right shift >>------");
		System.out.println(5>>1);// 
		System.out.println(10>>2);
		System.out.println(10>>3);
		System.out.println('a'>>1);
		System.out.println('A'>>2);
		
		
		
	
		
	}
		

}
