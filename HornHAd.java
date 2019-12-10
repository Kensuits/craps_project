package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HornHAd implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hornHAd;
	public static int remainHornAd;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			hornHAd = Integer.parseInt(br.readLine());
			remainHornAd = hornHAd % 5;
			Bankroll.balance = Bankroll.balance + remainHornAd;
			if(Bankroll.balance >= hornHAd || hornHAd <= 2500) {
				Bankroll.balance = Bankroll.balance - hornHAd;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 3) {
			hornHAd = (hornHAd /5) * 15 * 2 + (hornHAd / 5 * 2);
			Bankroll.balance = Bankroll.balance + hornHAd;
		}
		else if(Roll.d1 == Roll.d2){
			hornHAd = (hornHAd / 5) * 30 + (hornHAd / 5);
			Bankroll.balance = Bankroll.balance + hornHAd;
		}else {
		
			hornHAd = (hornHAd / 4 ) * 15 + (hornHAd / 4);
			Bankroll.balance = Bankroll.balance + hornHAd;
		}
		if(HornHAd.hornHAd > 0) {
			System.out.println("Horn High Ace Duece Wins! = $" + hornHAd);
		}
		//CrapsLog.update();
		hornHAd = 0;
		return hornHAd;
	}

	@Override
	public int betLose() {
		if(HornHAd.hornHAd > 0) {
			System.out.println("Horn High Ace Duece loses.\n");
		}
		hornHAd = 0;
		//CrapsLog.update();
		return hornHAd;
	}
	
}
