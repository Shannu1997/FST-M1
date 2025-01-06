package hello;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String arg[]) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Shan");
		mylist.add("Prini");
		mylist.add("Karish");
		mylist.add("Tanu");
		mylist.add("Mohi");
		
		for( String mylists:mylist) {
			System.out.println(mylists);
		}
		
		System.out.println(mylist.get(2));
		System.out.println(mylist.contains("Prini"));
		System.out.println(mylist.size());
		mylist.remove(1);
		System.out.println(mylist.contains("Prini"));
		System.out.println(mylist.size());
		
		
	}
}
