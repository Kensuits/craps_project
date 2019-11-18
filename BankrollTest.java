package craps_project;

//import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class BankrollTest {
		//create initial balance
		public static int balance;
		public static int moreMoney;
	    static InputStreamReader ir = new InputStreamReader(System.in);
	    static BufferedReader br = new BufferedReader(ir);
		
	    @Test
		public void Bankroll() {
		}
		
		public static int balance() {

			try {
				System.out.print("Enter Buy-in = $");
				balance = Integer.parseInt(br.readLine());
			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
			return balance;
		}
		
		public static int rebuy() {
			try {
				System.out.print("Add = $");
				moreMoney = Integer.parseInt(br.readLine());
				balance = balance + moreMoney;
			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
			return balance;
		}
}
