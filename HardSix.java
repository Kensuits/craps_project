package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardSix implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard6;
	
	public void hard6() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard6 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard6 && hard6 <= 1666) {
				Bankroll.balance = Bankroll.balance - hard6;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard6() {
		if(Roll.d1 == Roll.d2 && Roll.call == 6) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 6){
			betLose();
		}
		
	}
	@Override
	public int betWin() {
		hard6 = hard6 * 9;
		Bankroll.balance = Bankroll.balance + hard6;
		if(HardSix.hard6 > 0) {
			System.out.println("Hard 6 Wins = $" + hard6);
		}
		//CrapsLog.update();
		hard6 = hard6 / 9;
		return hard6;
	}

	@Override
	public int betLose() {
		if(HardSix.hard6 > 0) {
			System.out.println("Hard Six Loses.");
		}
		hard6 = 0;
		return hard6;
	}
	
	

}
