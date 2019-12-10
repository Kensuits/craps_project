package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlaceSix implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place6;
	
	public void check() {
		if (Roll.call == 6) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place6 = (place6 / 6) * 7;
		if(PlaceSix.place6 > 0) {
			System.out.println("Place six wins = $" + place6);
			Bankroll.balance =Bankroll.balance + place6;
		}
		//CrapsLog.update();
		place6 = (place6 / 7) * 6;
		return place6;
	}

	@Override
	public int betLose() {
		if(PlaceSix.place6 > 0) {
			System.out.println("Place six loses.");
		}
		place6 = 0;
		return place6;
	}
}