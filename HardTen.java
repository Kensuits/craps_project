package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardTen implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard10;
	
	public void hard10() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard10 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard10 && hard10 <= 2142) {
				Bankroll.balance = Bankroll.balance - hard10;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard10() {
		if(Roll.d1 == Roll.d2 && Roll.call == 10) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 10){
			betLose();
		}
		
	}
	
	@Override
	public int betWin() {
		hard10 = hard10 * 7;
		Bankroll.balance = Bankroll.balance + hard10;
		if(HardTen.hard10 > 0) {
			System.out.println("Hard 10 Wins = $" + hard10);
		}
		//CrapsLog.update();
		hard10 = hard10 / 7;
		return hard10;
	}

	@Override
	public int betLose() {
		if(HardTen.hard10 > 0) {
			System.out.println("Hard Ten Loses.");
		}
		hard10 = 0;
		return hard10;
	}
	
	

}
