package LinkedList;

public class DriverLL {

	public static void main(String[] args) {
		//10 20 30 40 
		MyLinkedlist ll=new MyLinkedlist();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.update(10,100);
		ll.display();
		ll.delete(20);
		ll.add(50);
		ll.display();

	}

}
