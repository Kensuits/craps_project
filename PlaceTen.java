package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlaceTen implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place10;
	
	public void check() {
		if (Roll.call == 10) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		int pl10 = place10;
		int vig = (int) (place10 * .05);
		
		if(place10 < 20) {
			place10 = (place10 / 5) * 9;
			Bankroll.balance = Bankroll.balance + place10;
		}else if(place10 >= 20) {
			place10 = place10 * 2 - vig;
			Bankroll.balance = Bankroll.balance + place10;
		}
		if(PlaceTen.place10 > 0) {
			System.out.println("Place 10 wins = $" + place10);
		}
		//CrapsLog.update();
		place10 = pl10;
		return place10;
	}

	@Override
	public int betLose() {
		if(PlaceTen.place10 > 0) {
			System.out.println("Place Ten loses.");
		}
		place10 = 0;
		return place10;
	}

}
