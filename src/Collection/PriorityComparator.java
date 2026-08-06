package Collection;

import java.util.PriorityQueue;

public class PriorityComparator {
		int age;
		String name;
		int height;
		

	public PriorityComparator(int age, String name, int height) {
			super();
			this.age = age;
			this.name = name;
			this.height = height;
		}


	@Override
	public String toString() {
		return "PriorityComparator [age=" + age + ", name=" + name + ", height=" + height + "]";
	}


	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue<>(new AgeComparator());
		
		
		pq.offer(new PriorityComparator(20,"Sneha",6));
		pq.offer(new PriorityComparator(22,"Vaish",5));
		pq.offer(new PriorityComparator(21,"Sakshi",7));
		pq.offer(new PriorityComparator(23,"Bhag",5));
		
      PriorityQueue pq1=new PriorityQueue<>(new nameComparator());
		
		
		pq1.offer(new PriorityComparator(20,"Sneha",6));
		pq1.offer(new PriorityComparator(22,"Vaish",5));
		pq1.offer(new PriorityComparator(21,"Sakshi",7));
		pq1.offer(new PriorityComparator(23,"Bhag",5));
		
PriorityQueue pq2=new PriorityQueue<>(new heightComparator());
		
		
		pq2.offer(new PriorityComparator(20,"Sneha",6));
		pq2.offer(new PriorityComparator(22,"Vaish",5));
		pq2.offer(new PriorityComparator(21,"Sakshi",7));
		pq2.offer(new PriorityComparator(23,"Bhag",5));
		
		
		System.out.println(pq);
		System.out.println(pq1);
		System.out.println(pq2);
		// TODO Auto-generated method stub

	}

}
