package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HornHYo implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hornHYo;
	public static int remainHornYo;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			hornHYo = Integer.parseInt(br.readLine());
			remainHornYo = hornHYo % 5;
			Bankroll.balance = Bankroll.balance + remainHornYo;
			if(Bankroll.balance >= hornHYo || hornHYo <= 2500) {
				Bankroll.balance = Bankroll.balance - hornHYo;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 11) {
			hornHYo = (hornHYo /5) * 15 * 2 + (hornHYo / 5 * 2);
			Bankroll.balance = Bankroll.balance + hornHYo;
		}
		else if(Roll.d1 == Roll.d2){
			hornHYo = (hornHYo / 5) * 30 + (hornHYo / 5);
			Bankroll.balance = Bankroll.balance + hornHYo;
		}else {
		
			hornHYo = (hornHYo / 4 ) * 15 + (hornHYo / 4);
			Bankroll.balance = Bankroll.balance + hornHYo;
		}
		if(HornHYo.hornHYo > 0) {
			System.out.println("Horn High Yo Wins! = $" + hornHYo);
		}
		//CrapsLog.update();
		hornHYo = 0;
		return hornHYo;
	}

	@Override
	public int betLose() {
		if(HornHYo.hornHYo > 0) {
			System.out.println("Horn High Yo loses.\n");
		}
		hornHYo = 0;
		//CrapsLog.update();
		return hornHYo;
	}
	
}
