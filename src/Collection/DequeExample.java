package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		//double ended queue created
		Deque deq=new ArrayDeque<>();
		
		deq.addFirst(10);
		deq.addFirst(20);
		deq.addFirst(30);
		deq.addFirst(40);
		System.out.println(deq);
		deq.addLast(50);
		deq.addLast(60);
		deq.addLast(70);
		System.out.println(deq);
		
		deq.offerFirst(400);
		deq.offerFirst(300);
		deq.offerLast(200);
		deq.offerLast(500);
		System.out.println(deq);
		
		System.out.println(deq.getFirst());
		System.out.println(deq.getLast());
		
		System.out.println(deq.peekFirst());
		System.out.println(deq.peekLast());
		
		System.out.println(deq.removeFirst());
		System.out.println(deq.removeLast());
		System.out.println(deq);
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollLast());
		System.out.println(deq);
	}

}
