package Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class NormalQueue {

	public static void main(String[] args) {
		Queue nq=new ArrayDeque<>();
		
		
		nq.add(10);
		nq.add(20);
		nq.add(30);
		nq.add(40);
		nq.offer(50);
		nq.offer(60);
		nq.offer(70);
		
		System.out.println(nq);

		System.out.println(nq.remove());
		System.out.println(nq.remove());
		System.out.println(nq.poll());
		System.out.println(nq.poll());
		System.out.println(nq);
		
		//iterating queue

		while(!nq.isEmpty()) {
			System.out.println(nq.poll());
		}
		System.out.println(nq);
		
		Queue nql=new LinkedList<>();


	}

}
