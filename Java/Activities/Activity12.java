package hello;

public class Activity12 {
	
	public static void main(String arg[]) {
		
		Addable adj = (num1, num2)->(num1+num2);
		System.out.println(adj.add(3, 6));
		
		Addable adj1 = (num1,num2)->{
			return (num1+num2);
		};
		
		System.out.println(adj1.add(10, 12));
	}

}
