package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopSix implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop6;
	public static int remain6;
	
	public void hopSix() {
		System.out.println("There are three variations of a 6.");
		
		try {
			System.out.print("How Much? = $");
			hop6 = Integer.parseInt(br.readLine());
			remain6 = hop6 % 3;
			Bankroll.balance = Bankroll.balance + remain6;
			if(Bankroll.balance >= hop6 || hop6 <= 1500) {
				Bankroll.balance = Bankroll.balance - hop6;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop6 = (hop6 / 3) * 30 + (hop6 / 3);
			Bankroll.balance = Bankroll.balance + hop6;
		}else {
			hop6 = (hop6 / 3 ) * 15 + (hop6 / 3);
			Bankroll.balance = Bankroll.balance + hop6;
		}
		if(HopSix.hop6 > 0) {
			System.out.println("Hop Sixes Wins! = $" + hop6);
		}
		CrapsLog.update();
		hop6 = 0;
		return hop6;
	}

	@Override
	public int betLose() {
		if(HopSix.hop6 > 0) {
			System.out.println("Hop Sixes loses.\n");
		}
		hop6 = 0;
		//CrapsLog.update();
		return hop6;
	}
	
}
