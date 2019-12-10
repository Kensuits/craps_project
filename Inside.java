package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inside {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
	public Inside() {
		
	}
	
	public void inside() throws NumberFormatException, IOException {
		int inside;
		int each;
		int cap;
		
		switch(Point.pnt) {
		case 4:
		case 10:
			System.out.println("Bet should be in $22 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 20;
			each = (inside - cap) / 4;
			PlaceFive.place5 = each;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceEight.place8 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 5:
			System.out.println("Bet should be in $17 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceEight.place8 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 6:
			System.out.println("Bet should be in $16 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceFive.place5 = each;
			PlaceEight.place8 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 8:
			System.out.println("Bet should be in $16 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceFive.place5 = each;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 9:
			System.out.println("Bet should be in $17 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceFive.place5 = each;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceEight.place8 = (cap / 2) + each;
			Bankroll.balance = Bankroll.balance - inside;
			default:
				break;
		}
	}
	
}
