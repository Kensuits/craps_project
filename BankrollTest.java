package craps_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankrollTest {

	@Test
	public void bankTest() {

		int actual = Bankroll.balance;
		int expected = 0;
		assertEquals(expected, actual);
	}

}
