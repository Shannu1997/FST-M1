package hello;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	public Car(String color, String transmission, int make)
	{
	
	this.color =color;
	this.transmission =transmission;
	this.make =make;
	this.tyres= 4;
	this.doors =4;
	}
	
	public void displayCharacteristics() {
		System.out.println(color);
		System.out.println(transmission);
		System.out.println(make);
		System.out.println(tyres);
		System.out.println(doors);
	}
	
	
	public void accelarate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
	
}