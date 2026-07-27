package IsA_relationship_inheritance;

public class Car extends Vehicle {

	String model;
	double price;
	
	public Car(String brand, String speed, String model,double price) {
		super (brand, speed);
		this.model=model;
		this.price=price;
	}
	public void displayCar() {
		System.out.println("brand of the car: "+ brand);
		System.out.println("speed of car: "+ speed);
		System.out.println("model of car: "+ model);
		System.out.println("price of car: "+ price);
	}
	
	public static void main(String[] args) {

		Car c = new Car("Audi", "180", "Aseries", 1200000.0);
		c.displayCar();
		c.Start();
		c.stop();
		

	}

}
