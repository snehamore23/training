package Polymorphism;

public class Bike extends Vehicle{
	
	public void start() {
		System.out.println("Vehical start ");
	}
	
	public void stop() {
		System.out.println("Vehical stop ");
	}
		
		
		public Bike(String brand, int speed, String fueltype) {
			this.brand=brand;
			this.speed=speed;
			this.fueltype=fueltype;
		}

		public static void main(String[] args) {
		Vehicle v=new Bike("Honda", 60, "Petrol");
		v.display();
		v.start();
		v.stop();

		}

	}

