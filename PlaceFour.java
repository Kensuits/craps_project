package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlaceFour implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place4;
	
	public void check() {
		if (Roll.call == 4) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		int pl4 = place4;
		int vig = (int) (place4 * .05);
		
		if(place4 < 20) {
			place4 = (place4 / 5) * 9;
			Bankroll.balance = Bankroll.balance + place4;
		}else if(place4 >= 20) {
			place4 = place4 * 2 - vig;
			Bankroll.balance = Bankroll.balance + place4;
		}
		if(PlaceFour.place4 > 0) {
			System.out.println("Place 4 wins = $" + place4);
		}
		//CrapsLog.update();
		place4 = pl4;
		return place4;
	}

	@Override
	public int betLose() {
		if(PlaceFour.place4 > 0) {
			System.out.println("Place Four loses.");
		}
		place4 = 0;
		return place4;
	}

}
