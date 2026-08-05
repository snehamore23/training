package Collection;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	
	System.out.println(l1);
	
	l1.addFirst(5);
	System.out.println(l1);
	
	l1.addLast(60);
	System.out.println(l1);
	
	System.out.println("First element of LinkedList :"+l1.getFirst());
	System.out.println("Last element of LinkedList :"+l1.getLast());
	System.out.println("Middle element of LinkedList :"+l1.get(4));
	
	System.out.println(l1.get(1));
	System.out.println(l1);
	System.out.println(l1.get(5));
	//out of bouond System.out.println(l1.get(9));
	
	l1.set(0, -10);
	
	System.out.println(l1);
	
	l1.remove();
	System.out.println(l1);
	
	l1.remove(1);
	l1.remove(Integer.valueOf(20));
	l1.removeFirst();
	l1.removeLast();
	System.out.println(l1);
	
	System.out.println(l1.contains(30));
	System.out.println(l1.size());
	System.out.println(l1.isEmpty());
	

	}

}
