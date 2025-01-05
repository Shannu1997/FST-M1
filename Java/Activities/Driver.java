package hello;

public class Driver {
	
	public static void main(String arg[]) {
	
		MountainBike bike1 = new MountainBike(25,3,0);
		System.out.println(bike1.bicycleDesc());
		bike1.speedUp(20);
		bike1.applyBrake(5);
	}

}
