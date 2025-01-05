package hello;

public class MountainBike extends Bicycle{
	int seatHeight;
	
	public MountainBike(int seatHeight, int gears, int currentSpeed) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
		
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	@Override
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed + "\nHeight of Seat is :" +seatHeight);
	}
	
}
