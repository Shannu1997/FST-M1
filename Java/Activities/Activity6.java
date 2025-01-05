package hello;

public class Activity6 {
	public static void main(String args[]) throws InterruptedException {
		Plane flight1 = new Plane(10);
		flight1.onboard("shan");
		flight1.onboard("prini");
		flight1.onboard("karsh");
		System.out.println("Plane is taking off ; "+flight1.takeOff());
		System.out.println("The passengers in flight:" +flight1.getPassesngers());
		Thread.sleep(5000);
		flight1.land();
		System.out.println("The Landing time is :"+flight1.getLastTimeLanded());
		
	}

}
