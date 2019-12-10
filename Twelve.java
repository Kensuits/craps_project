package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Twelve implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int twelve;
	
	public void twelve() {
		
		try {
			System.out.print("How Much? = $");
			twelve = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= twelve || twelve <= 500) {
				Bankroll.balance = Bankroll.balance - twelve;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 12) {
			twelve = twelve * 30 + twelve;
			Bankroll.balance = Bankroll.balance + twelve;
		}
		if(Twelve.twelve > 0) {
			System.out.println("Twelve wins = $" + twelve);
		}
		//CrapsLog.update();
		twelve = 0;
		return twelve;
	}

	@Override
	public int betLose() {
		if(Twelve.twelve > 0) {
			System.out.println("Twelve loses.\n");
		}
		twelve = 0;
		//CrapsLog.update();
		return twelve;
	}
	
}
