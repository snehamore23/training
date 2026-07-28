package Non_primitive_typecasting;

public class Child extends Parent{

	public static void main(String[] args) {
		
		Parent p =new Child();
		System.out.println("Upcasting has happened");
		
		Child c=(Child)p;
		System.out.println("Downcasting has happened");
		// TODO Auto-generated method stub

	}

}
