package hello;

public class Activity3 {
	public static void main (String args[]) {
		double giveseconds = 1000000000;
		
		double earthseconds = 31557600 ;
		double MercuryEarthyears = 0.2408467;
		double VenusEarthyears =0.61519726;
		double MarsEarthyears = 1.8808158;
		double JupiterEarthyears =11.862615;
		double SaturnEarthyears =29.447498;
		double UranusEarthyears =84.016846;
		double NeptuneEarthyears =164.79132; 
		
		System.out.println("Age in earth is " +giveseconds/earthseconds);
		System.out.println("Age in MercuryEarthyears is " +giveseconds/earthseconds/MercuryEarthyears);
		System.out.println("Age in VenusEarthyears is " +giveseconds/earthseconds/VenusEarthyears);
		System.out.println("Age in MarsEarthyears is " +giveseconds/earthseconds/MarsEarthyears);
		System.out.println("Age in JupiterEarthyears is " +giveseconds/earthseconds/JupiterEarthyears);
		System.out.println("Age in SaturnEarthyears is " +giveseconds/earthseconds/SaturnEarthyears);
		System.out.println("Age in UranusEarthyears is " +giveseconds/earthseconds/UranusEarthyears);
		System.out.println("Age in NeptuneEarthyears is " +giveseconds/earthseconds/NeptuneEarthyears);
		
		
	}

}
