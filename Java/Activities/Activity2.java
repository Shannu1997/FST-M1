package hello;

public class Activity2 {

	public static void main(String args[]) {
		int num[] = {10, 77, 10, 54, -11, 10};
		int sum = 0 ;
		
		for(int i=0;i<6;i++) {
			while (num[i]==10) {
			sum = num[i]+num[i]+num[i];	
			break;
			}
		}
		System.out.println(sum);
	
		


		
	}
}
