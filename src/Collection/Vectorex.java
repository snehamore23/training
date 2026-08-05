package Collection;

import java.util.Vector;

public class Vectorex {

	public static void main(String[] args) {
		Vector V=new Vector();
		V.add(10);
		V.add(20);
		V.add(30);
		V.add(40);
		
		V.add(0); System.out.println(V);
		//V.insertElementAt(V, 0); 
		System.out.println(V);
		V.removeElement(6); System.out.println(V);
		V.removeElementAt(6); System.out.println(V);
		
		System.out.println(V.firstElement());
		System.out.println(V.lastElement());
		System.out.println(V.elements());
		System.out.println(V.capacity());
          V.trimToSize();
		V.removeAllElements();

//		
//		
		
	}

	

}
