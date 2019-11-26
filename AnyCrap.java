package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnyCrap implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int anyCrap;
	
	public void anyCrap() {
		
		try {
			System.out.print("How Much? = $");
			anyCrap = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= anyCrap || anyCrap <= 2142) {
				Bankroll.balance = Bankroll.balance - anyCrap;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		anyCrap = anyCrap * 7 + anyCrap;
		Bankroll.balance = Bankroll.balance + anyCrap;
		if(AnyCrap.anyCrap > 0) {
			System.out.println("Any Crap = $" + anyCrap);
		}
		CrapsLog.update();
		anyCrap = 0;
		return anyCrap;
	}

	@Override
	public int betLose() {
		if(AnyCrap.anyCrap > 0) {
			System.out.println("Any Crap loses.\n");
		}
		anyCrap = 0;
		//CrapsLog.update();
		return anyCrap;
	}
}
