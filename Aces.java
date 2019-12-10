package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aces implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int aces;
	
	public void aces() {
		
		try {
			System.out.print("How Much? = $");
			aces = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= aces || aces <= 500) {
				Bankroll.balance = Bankroll.balance - aces;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 2) {
			aces = aces * 30 + aces;
			Bankroll.balance = Bankroll.balance + aces;
		}
		if(Aces.aces > 0) {
			System.out.println("Aces wins = $" + aces);
		}
		aces = 0;
		return aces;
	}

	@Override
	public int betLose() {
		if(Aces.aces > 0) {
			System.out.println("Aces loses.\n");
		}
		aces = 0;
		return aces;
	}
	
}