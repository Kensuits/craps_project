package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YoEleven implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int eleven;
	
	public void eleven() {
		
		try {
			System.out.print("How Much? = $");
			eleven = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= eleven || eleven <= 1000) {
				Bankroll.balance = Bankroll.balance - eleven;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 11) {
			eleven = eleven * 15 + eleven;
			Bankroll.balance = Bankroll.balance + eleven;
		}
		if(YoEleven.eleven > 0) {
			System.out.println("Yo Eleven wins = $" + eleven);
		}
		//CrapsLog.update();
		eleven = 0;
		return eleven;
	}

	@Override
	public int betLose() {
		if(YoEleven.eleven > 0) {
			System.out.println("Yo Eleven loses.\n");
		}
		eleven = 0;
		//CrapsLog.update();
		return eleven;
	}
	
}