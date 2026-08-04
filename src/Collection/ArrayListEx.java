package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al.toString());
		System.out.println("adding the heterogenous type of data");
		
		//heterogenous type of data
		al.add(30.0);
		al.add('a');
		al.add(true);
		al.add(new ArrayListEx());
		al.add("arraylist");
		System.out.println(al);
		
		al.add(1,false);
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		System.out.println(al1);
		al1.addAll(al);
		System.out.println(al1);
		
		System.out.println(al.get(2));
		System.out.println(al1.set(0,100));
		System.out.println(al1.remove(3));
		System.out.println(al1.remove(true));
		//System.out.println(al1.clear());
		System.out.println(al1.contains(false));
		System.out.println(al1.indexOf(4));
		System.out.println(al1.lastIndexOf(7));
		
		int size = al1.size();
		System.out.println(size);
		
		boolean empty = al1.isEmpty();
		System.out.println(empty);
		
		System.out.println(al1.toArray());
		System.out.println(al1.clone());
		
		
//		for(int i=0;i<al.size()-1;i++) {
//			System.out.println(al.get(i));
//		}
//		System.out.println("using the for each");
//		for(Object object :al) {
//			System.out.println(object);
//		}
		
//		Iterator itr=al.iterator();
//		while(itr.hasNext());
//		System.out.println(itr.next());

		ListIterator ltr=al.listIterator(al.size());
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		}
}
