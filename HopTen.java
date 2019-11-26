package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HopTen implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop10;
	public static int remain10;
	
	public void hopTen() {
		System.out.println("There are two variations of a 10.");
		
		try {
			System.out.print("How Much? = $");
			hop10 = Integer.parseInt(br.readLine());
			remain10 = hop10 % 2;
			Bankroll.balance = Bankroll.balance + remain10;
			if(Bankroll.balance >= hop10 || hop10 <= 1000) {
				Bankroll.balance = Bankroll.balance - hop10;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop10 = (hop10 / 2) * 30 + (hop10 / 2);
			Bankroll.balance = Bankroll.balance + hop10;
		}else {
			hop10 = (hop10 / 2 ) * 15 + (hop10 / 2);
			Bankroll.balance = Bankroll.balance + hop10;
		}
		if(HopTen.hop10 > 0) {
			System.out.println("Hop Tens Wins! = $" + hop10);
		}
		CrapsLog.update();
		hop10 = 0;
		return hop10;
	}

	@Override
	public int betLose() {
		if(HopTen.hop10 > 0) {
			System.out.println("Hop Tens loses.\n");
		}
		hop10 = 0;
		//CrapsLog.update();
		return hop10;
	}
	
}

