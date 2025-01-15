package session1;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

	static ArrayList<String> names = new ArrayList<String>();
	
	@BeforeAll
	public static void setUp() {
		// Initialize a new ArrayList
		//names = new ArrayList<String>();

		// Add values to the list
		names.add("alpha"); // at index 0
		names.add("beta"); // at index 1
	}
	
	@Test
public void insertTest() {
	assertEquals(2, names.size(), "Wrong size");
	names.add(2,"Gamma");
	assertEquals(3, names.size(), "Wrong size");
	assertEquals("alpha", names.get(0), "Wrong Element");
	assertEquals("beta", names.get(1), "Wrong Element");
	assertEquals("Gamma", names.get(2), "Wrong Element");
}
	
@Test
public void replaceTest() {
	names.set(1, "beta");
	assertEquals(2, names.size(), "Wrong size");

	assertEquals(3, names.size(), "Wrong size");
	//names.set(1, "Charlie");
	assertEquals("alpha", names.get(0), "Wrong Element");
	assertEquals("Charlie", names.get(1), "Wrong Element");
	assertEquals("Gamma", names.get(2), "Wrong Element");
	
	
}
	
	
}
