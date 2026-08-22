package LinkedList;

public class MyQueue {
int a[];
int front;
int rear;
int sizeofelement;

//constructor
public MyQueue() {
	a=new int [10];
	this.front=-1;
	this.rear=-1;
	sizeofelement=0;
}
public MyQueue(int size) {
	a=new int [size];
	this.front=-1;
	this.rear=-1;
	sizeofelement=0;
}

public boolean isFull() {
return rear==a.length-1;	
}

public void clear() {
	front=-1;
	rear=-1;
	sizeofelement=0;
}
public void enqueue(int value) {
	if(isFull()){
		int newarr[]=new int[a.length*2];
		for(int i=0;i<a.length;i++) {
			newarr[i]=a[i];
		}
		a=newarr;
		}
	if(front==-1)front=0;
	a[++rear]=value;
	sizeofelement++;
	}
public void dequeue() {
	if(isEmpty()) {
		System.out.println("the queue is empty");
		return;
	}
	int removedelement=a[front];
	front++;
	sizeofelement--;
	}
public void display() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		return;
	}
	for(int i=front;i<=rear;i++) {
		System.out.println(a[i]+ "");
	}
	System.out.println();
}
public void peek() {
	if(isEmpty()) {
		System.out.println("the queue is empty");
		return;
	}
	System.out.println(a[front]);
	}
}

	
