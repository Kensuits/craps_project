package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardEight implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard8;
	
	public void hard8() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard8 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard8 && hard8 <= 1666) {
				Bankroll.balance = Bankroll.balance - hard8;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard8() {
		if(Roll.d1 == Roll.d2 && Roll.call == 8) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 8){
			betLose();
		}
		}
	
	@Override
	public int betWin() {
	    hard8 = hard8 * 9;
	    Bankroll.balance = Bankroll.balance + hard8;
		if(HardEight.hard8 > 0) {
			System.out.println("Hard 8 Wins = $" + hard8);
		}
		//CrapsLog.update();
		hard8 = hard8 / 9;
		return hard8;
	}

	@Override
	public int betLose() {
		if(HardEight.hard8 > 0) {
			System.out.println("Hard Eight Loses.");
		}
		hard8 = 0;
		return hard8;
	}
	
	

}