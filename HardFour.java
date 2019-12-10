package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardFour implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard4;
	
	public void hard4() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard4 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard4 && hard4 <= 2142) {
				Bankroll.balance = Bankroll.balance - hard4;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard4() {
		if(Roll.d1 == Roll.d2 && Roll.call == 4) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 4){
			betLose();
		}
		
	}
	
	@Override
	public int betWin() {
		hard4 = hard4 * 7;
		Bankroll.balance = Bankroll.balance + hard4;
		if(HardFour.hard4 > 0) {
			System.out.println("Hard 4 Wins = $" + hard4);
		}
		//CrapsLog.update();
		hard4 = hard4 / 7;
		return hard4;
	}

	@Override
	public int betLose() {
		if(HardFour.hard4 > 0) {
			System.out.println("Hard Four Loses.");
		}
		hard4 = 0;
		return hard4;
	}
	
	

}
