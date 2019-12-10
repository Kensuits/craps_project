package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlaceNine  implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place9;
	
	public void check() {
		if (Roll.call == 9) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place9 = (place9 / 5) * 7;
		if(PlaceNine.place9 > 0) {
			System.out.println("Place nine wins = $" + place9);
			Bankroll.balance =Bankroll.balance + place9;
		}
		//CrapsLog.update();
		place9 = (place9 / 7) * 5;
		return place9;
	}

	@Override
	public int betLose() {
		if(PlaceNine.place9 > 0) {
			System.out.println("Place nine loses.");
		}
		place9 = 0;
		return place9;
	}


}
