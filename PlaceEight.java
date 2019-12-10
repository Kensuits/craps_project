package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlaceEight implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place8;
	
	public void check() {
		if (Roll.call == 8) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place8 = (place8 / 6) * 7;
		if(PlaceEight.place8 > 0) {
			System.out.println("Place eight wins = $" + place8);
			Bankroll.balance =Bankroll.balance + place8;
		}
		//CrapsLog.update();
		place8 = (place8 / 7) * 6;
		return place8;
	}

	@Override
	public int betLose() {
		if(PlaceEight.place8 > 0) {
			System.out.println("Place eight loses.");
		}
		place8 = 0;
		return place8;
	}
}
