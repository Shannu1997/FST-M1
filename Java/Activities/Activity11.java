package hello;

import java.util.HashMap;

public class Activity11 {

	public static void main(String args[]) {
	HashMap<Integer, String> Colors = new HashMap<Integer, String>();
	Colors.put(1,"Red");
	Colors.put(2,"blue");
	Colors.put(3,"violet");
	Colors.put(4,"orange");
	Colors.put(5,"Green");

	System.out.println(Colors);
	
	System.out.println("Before removal :" +Colors.size());
	Colors.remove(4);
	System.out.println(Colors.containsValue("Green"));
	System.out.println(Colors);
	System.out.println("After removal :" +Colors.size());
	
}
}

