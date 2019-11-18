package craps_project;

//import static org.junit.Assert.*;
//import static org.junit.Assume.assumeNoException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class PlayerTest {
    public static String name;
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
	@Test
	public void Player() {
	}
	
	public static String playerId() {
		try {
			System.out.print("Enter Player Id = ");
			name = br.readLine();
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return name;
		
	}

}
