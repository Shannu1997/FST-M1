package hello;

public class Activity1 {
public static void main (String args[]) {
	//	public Car(String color, String transmission, int make, int tyres, int doors)
	Car car1 = new Car("Black", "Manual", 2023);
	car1.displayCharacteristics();
	car1.accelarate();
	car1.brake();
}
}
