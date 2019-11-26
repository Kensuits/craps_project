package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopFour implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop4;
	public static int remain4;
	
	public void hopFour() {
		System.out.println("There are two variations of a 4.");
		
		try {
			System.out.print("How Much? = $");
			hop4 = Integer.parseInt(br.readLine());
			remain4 = hop4 % 2;
			Bankroll.balance = Bankroll.balance + remain4;
			if(Bankroll.balance >= hop4 || hop4 <= 1000) {
				Bankroll.balance = Bankroll.balance - hop4;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop4 = (hop4 / 2) * 30 + (hop4 / 2);
			Bankroll.balance = Bankroll.balance + hop4;
		}else {
			hop4 = (hop4 / 2 ) * 15 + (hop4 / 2);
			Bankroll.balance = Bankroll.balance + hop4;
		}
		if(HopFour.hop4 > 0) {
			System.out.println("Hop Fours Wins! = $" + hop4);
		}
		CrapsLog.update();
		hop4 = 0;
		return hop4;
	}

	@Override
	public int betLose() {
		if(HopFour.hop4 > 0) {
			System.out.println("Hop Fours loses.\n");
		}
		hop4 = 0;
		//CrapsLog.update();
		return hop4;
	}
	
}
