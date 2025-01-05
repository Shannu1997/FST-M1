package hello;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
	
    Date currentdate = new Date();
    
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String addpassenger) {
		this.passengers.add(addpassenger);
	}
	
	public Date takeOff() {
		this.lastTimeTookOf = new Date(); 
		return lastTimeTookOf;
	}

	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded() {
	return lastTimeLanded;
	}
	
	public List<String> getPassesngers(){
		return passengers;
		
	}
	
}
