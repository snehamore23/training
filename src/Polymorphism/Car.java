package Polymorphism;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Vehical start with the help of power button");
	}
	
	public void stop() {
		System.out.println("Vehical stop with the help of brakes");
	}
	
		
		public Car(String brand, int speed, String fueltype) {
			this.brand=brand;
			this.speed=speed;
			this.fueltype=fueltype;
		}

		public static void main(String[] args) {
		Vehicle v=new Bike("BMW", 80, "Diesel");
		v.display();
		v.start();
		v.stop();

		}

	}

