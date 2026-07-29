package Polymorphism;

public class Vehicle {
	String brand;
	int speed;
	String fueltype;
	
	public void start() {
		System.out.println("Vehical start with the help of power button");
	}
	
	public void stop() {
		System.out.println("Vehical stop with the help of brakes");
	}

	public void display() {
			System.out.println("Brand: "+brand );
			System.out.println("Speed: "+speed);
			System.out.println("FuelType: "+fueltype);
		}
	}
		// TODO Auto-generated method stub
		
//	public void display() {
//		System.out.println("Brand: "+brand );
//		System.out.println("Speed: "+speed);
//		System.out.println("FuelType: "+fueltype);
//	}
//	
//	public Vehicle(String brand, int speed, String fueltype) {
//		this.brand=brand;
//		this.speed=speed;
//		this.fueltype=fueltype;
//	}
//
//	public static void main(String[] args) {
//	Vehicle v=new Vehicle("BMW", 80, "Diesel");
//	v.display();
//	v.start();
//	v.stop();
//
//	}
//
//}
