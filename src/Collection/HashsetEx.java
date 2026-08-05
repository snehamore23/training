package Collection;

import java.util.HashSet;

public class HashsetEx {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(null);
		h.add(50);
		h.add(40);
		System.out.println(h);
		
		System.out.println(h.remove(40));
		System.out.println(h.contains(20));
		System.out.println(h.size());
		//System.out.println(h.clean());
		System.out.println(h.iterator());
		System.out.println(h.addAll(h));
//		System.out.println(h.removeAll(h);
//		System.out.println(h.retainAll(h));
         h.containsAll(h);
                  System.out.println(h);
         h.clone();
                 System.out.println(h);

		System.out.println(h);
		
//		h.toArray();
//		h.forEachEach());
		

	}

}
