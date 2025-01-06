package hello;

import java.util.HashSet;

public class Activity10 {

	public static void main(String arg[]) {
		HashSet <String> hs = new HashSet<String>();
		hs.add("shan");
		hs.add("prini");
		hs.add("karish");
		hs.add("tanu");
		hs.add("mohi");
		hs.add("gujj");
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove("gujj");
		if(hs.remove("justin")) {
			System.out.println("Data removed");
		}
		else {
			System.out.println("Data not removed");
		}
		System.out.println(hs.contains("justin"));
		System.out.println(hs);
	}
	
}
