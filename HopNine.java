package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopNine implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop9;
	public static int remain9;
	
	public void hopNine() {
		System.out.println("There are two variations of a 9.");
		
		try {
			System.out.print("How Much? = $");
			hop9 = Integer.parseInt(br.readLine());
			remain9 = hop9 % 2;
			Bankroll.balance = Bankroll.balance + remain9;
			if(Bankroll.balance >= hop9 || hop9 <= 2000) {
				Bankroll.balance = Bankroll.balance - hop9;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		hop9 = (hop9 / 2) * 15 + (hop9 / 2);
		Bankroll.balance = Bankroll.balance + hop9;
		if(HopNine.hop9 > 0) {
			System.out.println("Hop Nines Wins! = $" + hop9);
		}
		CrapsLog.update();
		hop9 = 0;
		return hop9;
	}

	@Override
	public int betLose() {
		if(HopNine.hop9 > 0) {
			System.out.println("Hop Nines loses.\n");
		}
		hop9 = 0;
		//CrapsLog.update();
		return hop9;
	}
}
