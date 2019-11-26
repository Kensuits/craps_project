package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Passline implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int passBet;
	
	public void passBet() {
		System.out.print("Passline Bet = $");
		
		try {
		passBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= passBet && passBet <= 2500 && passBet >= 5) {
			Bankroll.balance = Bankroll.balance - passBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}

	@Override
	public int betWin() {	
		passBet = passBet * 2;
		Bankroll.balance = Bankroll.balance + passBet;
		CrapsLog.update();
		if(Passline.passBet > 0) {
			System.out.println("Passline Wins = $" + Passline.passBet + "\n");
		}
		passBet = 0;
		return passBet;
	}

	@Override
	public int betLose() {
		if(Passline.passBet > 0) {
			System.out.println("Passline loses\n");
		}
		passBet = passBet * 0;
		//CrapsLog.update();
		return passBet;
	}
	
}
