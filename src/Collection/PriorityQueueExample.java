package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String args[]) {
//min heap
		
		PriorityQueue pq=new PriorityQueue<>();
		pq.offer(90);
		pq.offer(1);
		pq.offer(45);
		pq.offer(22);
		pq.offer(2);
		pq.add(80);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println("-------------------------------------------");
		
		//max heap
		PriorityQueue pq1=new PriorityQueue<>(Comparator.reverseOrder());
		pq1.offer(90);
		pq1.offer(1);
		pq1.offer(45);
		pq1.offer(22);
		pq1.offer(2);
		pq1.offer(40);
		pq1.offer(120);
		pq1.add(80);
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		
		System.out.println(pq1.poll());
		System.out.println(pq1);
		
		System.out.println(pq1.remove());
		System.out.println(pq1);
		
		System.out.println(pq1.peek());
		System.out.println(pq1);
		
		System.out.println(pq1.element());
		System.out.println(pq1);
		}
}
