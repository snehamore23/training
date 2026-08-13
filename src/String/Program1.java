package String;

public class Program1 {

	public static void main(String[] args) {
		String s="java";
		String t="teacher";
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.substring(1));
		System.out.println(s.substring(0));
		System.out.println(s.equals(s));
		System.out.println(s.equalsIgnoreCase(t));
		System.out.println(s.compareTo(s));
		System.out.println(s.compareToIgnoreCase("v"));
		System.out.println(s.contains("v"));
		System.out.println(s.startsWith("j"));
		System.out.println(s.endsWith("p"));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(t.trim());
		

	}

}
