package LinkedList;

import LinkedList.MyLinkedlist.Node;

public class DoublyLinkedlist {
	Node head;
	Node tail;
	int data;
	public class Node{
		public int value;
		public Node prev;
		public Node next;
		public int data;
		
		public Node(int value) {
		this.value = value;
		}
		public Node(int value, Node prev) {
			this.value = value;
			this.prev = prev;
		}
		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
	public void add(int value) {
		Node node=new Node(value);
		if(head==null&&tail==null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.prev=tail;
		tail=node;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null) {
				System.out.print("-->");
			}
		}
		System.out.println();
	}
	public void update(int olddata, int newdata) {
		Node temp=head;
		if(temp==null) {
			System.out.println("List is empty");
			return;
		}
		while(temp!=null) {
			if(temp.data==olddata) {
				temp.data=newdata;
			}
			temp=temp.next;
		}
	}
	public boolean search(int value) {
		Node temp=head;
		while(temp!=null) {
			if(temp.value1) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}

 public void delete(int value) {
	 if (head==null&&tail==null) {
		 System.out.println("list is empty");
		 return;
	 }
	 if(head.value==value) {
	 if(head==tail) {
		 head=null;
		 tail=null;
	 }else {
		 head=head.next;
		 head.prev=null;
	 }
return;
	}
 //delete tail
 if(tail.value==value) {
	 tail=tail.prev;
	 tail.next=null;
	 return;
 }

}

