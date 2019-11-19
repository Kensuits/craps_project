package craps_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void playerTest() {
		
		String actual = Player.name;
		String expected = "Kenny";
		assertNotNull(actual, expected);
	}

}
