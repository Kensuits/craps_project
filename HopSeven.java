package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopSeven implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop7;
	public static int remain7;
	
	public void hopSeven() {
		System.out.println("There are three variations of a 7.");
		
		try {
			System.out.print("How Much? = $");
			hop7 = Integer.parseInt(br.readLine());
			remain7 = hop7 % 3;
			Bankroll.balance = Bankroll.balance + remain7;
			if(Bankroll.balance >= hop7 || hop7 <= 3000) {
				Bankroll.balance = Bankroll.balance - hop7;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		hop7 = (hop7 / 3) * 15 + (hop7 / 3);
		Bankroll.balance = Bankroll.balance + hop7;
		if(HopSeven.hop7 > 0) {
			System.out.println("Hop Sevens Wins! = $" + hop7);
		}
		CrapsLog.update();
		hop7 = 0;
		return hop7;
	}

	@Override
	public int betLose() {
		if(HopSeven.hop7 > 0) {
			System.out.println("Hop Sevens loses.\n");
		}
		hop7 = 0;
		//CrapsLog.update();
		return hop7;
	}
}
