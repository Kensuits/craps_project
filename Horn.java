package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Horn implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int horn;
	public static int remainHorn;
	
	public void horn() {
		System.out.println("There are four numbers in a horn.");
		
		try {
			System.out.print("How Much? = $");
			horn = Integer.parseInt(br.readLine());
			remainHorn = horn % 4;
			Bankroll.balance = Bankroll.balance + remainHorn;
			if(Bankroll.balance >= horn || horn <= 2000) {
				Bankroll.balance = Bankroll.balance - horn;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			horn = (horn / 4) * 30 + (horn / 4);
			Bankroll.balance = Bankroll.balance + horn;
		}else {
			horn = (horn / 4 ) * 15 + (horn / 4);
			Bankroll.balance = Bankroll.balance + horn;
		}
		if(Horn.horn > 0) {
			System.out.println("Horn Wins! = $" + horn);
		}
		CrapsLog.update();
		horn = 0;
		return horn;
	}

	@Override
	public int betLose() {
		if(Horn.horn > 0) {
			System.out.println("Horn loses.\n");
		}
		horn = 0;
		//CrapsLog.update();
		return horn;
	}
	
}
