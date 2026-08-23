package LinkedList;

public class MyStack {
 int arr[];
 int pointer=-1;
 int sizeOfElement=0;
 
 public static int default_size_of_stack=10;
 
 public MyStack() {
	 arr=new int[default_size_of_stack];
 }
public MyStack(int customsize) {
	arr=new int[customsize];
}
public void push(int value) {
	if (isFull()) {
		int newarr[]=new int[arr.length*2];
		newarr=Arrays.copyOf(a,a.length);
		arr=newarr;
	}
	arr[pointer+1]=value;
	pointer++;
	sizeOfElement;
}
public int peek() {
	if(pointer==-1)throw new StackOverflowError();
	return arr[pointer];
}
public int pop() {
	if(pointer==-1)throw new StackOverflowError();
	int removedelment=arr[pointer];
	pointer--;
	sizeOfElement--;
	return removedelement;
}
public boolean isEmpty() {
	if(pointer==arr.length-1)return true;
	else return false;
}
public boolean isFull() {
	if(pointer==arr.length-1)return true;
	else return false;
}
public void display() {
	if(pointer==-1)System.out.println("the stack is empty");
	int temp=pointer;
	while(temp!=-1) {
		System.out.println(arr[temp]);
		temp--;
	}
}
public boolean search(int value) {
	int temp=pointer;
	while(temp!=1) {
		if(arr[temp]==value)return true;
		temp--;
	}
	return false;
}
public void clear() {
	pointer=-1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
