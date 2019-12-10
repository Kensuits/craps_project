package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AceDuece implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int three;
	
	public void aceDuece() {
		
		try {
			System.out.print("How Much? = $");
			three = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= three || three <= 1000) {
				Bankroll.balance = Bankroll.balance - three;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 3) {
			three = three * 15 + three;
			Bankroll.balance = Bankroll.balance + three;
		}
		if(AceDuece.three > 0) {
			System.out.println("Ace Duece wins = $" + three);
		}
		three = 0;
		return three;
	}

	@Override
	public int betLose() {
		if(AceDuece.three > 0) {
			System.out.println("Ace Duece loses.\n");
		}
		three = 0;
		return three;
	}
	
}
