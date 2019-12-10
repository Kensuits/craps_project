package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlaceFive implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place5;
	
	public void check() {
		if (Roll.call == 5) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place5 = (place5 / 5) * 7;
		if(PlaceFive.place5 > 0) {
			System.out.println("Place five wins = $" + place5);
			Bankroll.balance =Bankroll.balance + place5;
		}
		//CrapsLog.update();
		place5 = (place5 / 7) * 5;
		return place5;
	}

	@Override
	public int betLose() {
		if(PlaceFive.place5 > 0) {
			System.out.println("Place five loses.");
		}
		place5 = 0;
		return place5;
	}
}
