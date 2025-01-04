package hello;

public class Activity5 {
	
	public static void main(String args[]) {
		MyBook newNovel= new MyBook();
		
	
		String title = "Happy Path";
		newNovel.setTitle(title);
		
		System.out.println("The book title is : "+newNovel.getTitle());
		
	}

}
