package Polymorphism;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Vehical start ");
	}
	
	public void stop() {
		System.out.println("Vehical stop");
	}
	
		
		public Car(String brand, int speed, String fueltype) {
			this.brand=brand;
			this.speed=speed;
			this.fueltype=fueltype;
		}

		public static void main(String[] args) {
			Car c=new Car("BMW", 80, "Diesel");
			c.display();
			c.start();
			c.stop();
			
			
//			system.out.println("********upcasting********");
		Vehicle v=new Bike("BMW", 80, "Diesel");
		v.display();
		v.start();
		v.stop();

		}

	}

