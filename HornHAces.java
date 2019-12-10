package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HornHAces implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int horn2;
	public static int remainHorn2;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			horn2 = Integer.parseInt(br.readLine());
			remainHorn2 = horn2 % 5;
			Bankroll.balance = Bankroll.balance + remainHorn2;
			if(Bankroll.balance >= horn2 || horn2 <= 1250) {
				Bankroll.balance = Bankroll.balance - horn2;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 12) {
			horn2 = (horn2 /5) * 30 * 2 + (horn2 / 5 * 2);
			Bankroll.balance = Bankroll.balance + horn2;
		}
		else if(Roll.d1 == Roll.d2){
			horn2 = (horn2 / 5) * 30 + (horn2 / 5);
			Bankroll.balance = Bankroll.balance + horn2;
		}else {
		
			horn2 = (horn2 / 4 ) * 15 + (horn2 / 4);
			Bankroll.balance = Bankroll.balance + horn2;
		}
		if(HornHAces.horn2 > 0) {
			System.out.println("Horn High Aces Wins! = $" + horn2);
		}
		//CrapsLog.update();
		horn2 = 0;
		return horn2;
	}

	@Override
	public int betLose() {
		if(HornHAces.horn2 > 0) {
			System.out.println("Horn High Aces loses.\n");
		}
		horn2 = 0;
		//CrapsLog.update();
		return horn2;
	}
	
}
