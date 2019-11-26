package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HornH12 implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int horn12;
	public static int remainHorn12;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			horn12 = Integer.parseInt(br.readLine());
			remainHorn12 = horn12 % 5;
			Bankroll.balance = Bankroll.balance + remainHorn12;
			if(Bankroll.balance >= horn12 || horn12 <= 1250) {
				Bankroll.balance = Bankroll.balance - horn12;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 12) {
			horn12 = (horn12 /5) * 30 * 2 + (horn12 / 5);
			Bankroll.balance = Bankroll.balance + horn12;
		}
		if(Roll.d1 == Roll.d2){
			horn12 = (horn12 / 5) * 30 + (horn12 / 5);
			Bankroll.balance = Bankroll.balance + horn12;
		}else {
		
			horn12 = (horn12 / 4 ) * 15 + (horn12 / 4);
			Bankroll.balance = Bankroll.balance + horn12;
		}
		if(HornH12.horn12 > 0) {
			System.out.println("Horn High 12 Wins! = $" + horn12);
		}
		CrapsLog.update();
		horn12 = 0;
		return horn12;
	}

	@Override
	public int betLose() {
		if(HornH12.horn12 > 0) {
			System.out.println("Horn High 12 loses.\n");
		}
		horn12 = 0;
		//CrapsLog.update();
		return horn12;
	}
	
}
