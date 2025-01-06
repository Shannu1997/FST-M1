package hello;

public class Activity8 {
	
	public void exceptionTest(String msg) throws CustomException  {
		if (msg ==null) {
				throw new CustomException("The String is null");
		}
		else {
			System.out.println(msg);
		}
	}
	public static void main (String args[])  {
		
		Activity8 exceptionactivity = new Activity8();
		try {
			exceptionactivity.exceptionTest("Will print to console");
			exceptionactivity.exceptionTest(null);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
