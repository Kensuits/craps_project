package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DontPass implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int dontBet;
	
	public void dontBet() {
		System.out.print("Dont Pass Bet = $");
		
		try {
		dontBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= dontBet && dontBet <= 2500 && dontBet >= 5) {
			Bankroll.balance = Bankroll.balance - dontBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}

	@Override
	public int betWin() {	
		dontBet = dontBet * 2;
		Bankroll.balance = Bankroll.balance + dontBet;
		CrapsLog.update();
		if(DontPass.dontBet > 0) {
			System.out.println("Don't Pass Wins = $" + DontPass.dontBet + "\n");
		}
		dontBet = 0;
		return dontBet;
	}

	@Override
	public int betLose() {
		if(DontPass.dontBet > 0) {
			System.out.println("Don't Pass loses.\n");
		}
		dontBet = dontBet * 0;
		//CrapsLog.update();
		return dontBet;
	}
}
