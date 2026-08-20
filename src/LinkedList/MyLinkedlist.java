package LinkedList;

public class MyLinkedlist {

Node head;
Node tail;
int sizeofelement;
public class Node{
int data;
int value;
boolean value1;
Node next;

public Node(int data) {
	this.data=data;
}
public Node(int data,Node next) {
	this.data=data;
	this.next=next;
}

}
public void add(int value) {
	Node node=new Node(value);
	if(head==null&&tail==null) {
		head=node;
		tail=node;
		sizeofelement++;
		return;
	}
	tail.next=node;
	tail=node;
	sizeofelement++;
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
		public void delete(int key) {
			if(head==null) {
				System.out.println("List is empty");
				return;
			}	
				//delete first node
				if(head.value==key) {
					head=head.next;
					//if list become empty
					if(head==null) {
						tail=null;
			}
					return;
		}
				Node temp=head;
				Node prev=null;
				while(temp!=null) {
					if(temp.value==key) {
						prev.next=temp.next;
						
						//if last node deleted
                if(temp==tail) {
	              tail=prev;
                   }
                   return;
					}
					prev=temp;
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
}
