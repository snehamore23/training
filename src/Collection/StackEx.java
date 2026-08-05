package Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println(s);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		s.push(60);
		System.out.println(s);
		
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);

	        System.out.println("Top element: " + s.peek());

	        System.out.println("Position of 30: " + s.search(30));

	        System.out.println("Is Stack Empty? " + s.empty());

	        System.out.println("----------------------");

		System.out.println("-----------------------------");
		s.add(50);
		System.out.println(s);
		
		s.remove(Integer.valueOf(30));
		System.out.println(s);
		
		s.contains(60);
		System.out.println(s);
		
		s.size();
		System.out.println(s);
		
		System.out.println(s.get(20));
//		s.firstElement();
//		s.getFirst();
//		s.getLast();
//		System.out.println(s);
	}

}
