package Collection;

import java.util.PriorityQueue;

public class PrioritySorting implements Comparable<PrioritySorting> {
	int age;
	String name;
	int height;
	
	
	public PrioritySorting(int age, String name, int height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}

	@Override
	public String toString() {
		return "PrioritySorting [age=" + age + ", name=" + name + ", height=" + height + "]";
	}

	@Override
	public int compareTo(PrioritySorting o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue<>();
		
		pq.offer(new PrioritySorting(20,"Sneha",6));
		pq.offer(new PrioritySorting(20,"Vaish",5));
		pq.offer(new PrioritySorting(20,"Sakshi",7));
		pq.offer(new PrioritySorting(20,"Bhag",5));
		
		System.out.println(pq);
	}
}
