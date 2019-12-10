package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Outside {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
    public Outside() {
    	
    }
    
    public void outside() throws NumberFormatException, IOException {
		int outside;
		int each;
		
		switch(Point.pnt) {
		case 6:
		case 8:
			System.out.println("Bet in increments of 4.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 4;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceNine.place9 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 4:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFive.place5 = each;
			PlaceNine.place9 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 5:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFour.place4 = each;
			PlaceNine.place9 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 9:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 10:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
			default:
				break;
		}
    }

}
