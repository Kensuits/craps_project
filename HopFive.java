package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopFive implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop5;
	public static int remain5;
	
	public void hopFive() {
		System.out.println("There are two variations of a 5.");
		
		try {
			System.out.print("How Much? = $");
			hop5 = Integer.parseInt(br.readLine());
			remain5 = hop5 % 2;
			Bankroll.balance = Bankroll.balance + remain5;
			if(Bankroll.balance >= hop5 || hop5 <= 2000) {
				Bankroll.balance = Bankroll.balance - hop5;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		hop5 = (hop5 / 2) * 15 + (hop5 / 2);
		Bankroll.balance = Bankroll.balance + hop5;
		if(HopFive.hop5 > 0) {
			System.out.println("Hop Fives Wins! = $" + hop5);
		}
		CrapsLog.update();
		hop5 = 0;
		return hop5;
	}

	@Override
	public int betLose() {
		if(HopFive.hop5 > 0) {
			System.out.println("Hop Fives loses.\n");
		}
		hop5 = 0;
		//CrapsLog.update();
		return hop5;
	}
}
