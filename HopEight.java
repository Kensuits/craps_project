package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopEight implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop8;
	public static int remain8;
	
	public void hopEight() {
		System.out.println("There are three variations of an 8.");
		
		try {
			System.out.print("How Much? = $");
			hop8 = Integer.parseInt(br.readLine());
			remain8 = hop8 % 3;
			Bankroll.balance = Bankroll.balance + remain8;
			if(Bankroll.balance >= hop8 || hop8 <= 1500) {
				Bankroll.balance = Bankroll.balance - hop8;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop8 = (hop8 / 3) * 30 + (hop8 / 3);
			Bankroll.balance = Bankroll.balance + hop8;
		}else {
			hop8 = (hop8 / 3 ) * 15 + (hop8 / 3);
			Bankroll.balance = Bankroll.balance + hop8;
		}
		if(HopEight.hop8 > 0) {
			System.out.println("Hop Eights Wins! = $" + hop8);
		}
		CrapsLog.update();
		hop8 = 0;
		return hop8;
	}

	@Override
	public int betLose() {
		if(HopEight.hop8 > 0) {
			System.out.println("Hop Eights loses.\n");
		}
		hop8 = 0;
		//CrapsLog.update();
		return hop8;
	}
	
}
