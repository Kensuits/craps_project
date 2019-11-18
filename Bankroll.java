package craps_project;
import java.io.*;


public class Bankroll {

	//create initial balance
	public static int balance;
	public static int moreMoney;
	public static int cashout;
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	
	public Bankroll() {
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
	
	public static int cashOut() {
		try {
			System.out.println("Cashout?");
			cashout = Integer.parseInt(br.readLine());
			if(cashout == 1) {
				balance = balance * 0;
			}
			else if(cashout == 2){
			return balance;
			}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return balance;
	}
	
}
