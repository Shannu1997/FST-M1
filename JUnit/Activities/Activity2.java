package session1;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Activity2 {
	

	@Test
	void notEnoughFunds() {
		BankAccount sb1 = new BankAccount(5);
		assertDoesNotThrow(() -> sb1.withdraw(10), "Balance must be greater than amount of withdrawl ");
	}
	
	@Test
	void enoughFunds() {
		BankAccount sb = new BankAccount(100);
		assertThrows(NotEnoughFundsException.class, () -> sb.withdraw(100), "Balance failure");
		
	}
	
	
}
