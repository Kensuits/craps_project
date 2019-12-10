package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Across {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
    public Across() {
    	
    }
    
    public void across() throws NumberFormatException, IOException {
		int across;
		int each;
		int unit;
		int change;
		
		switch(Point.pnt) {
		case 4:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 5:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFour.place4 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 6:
			System.out.println("Bet in increments of 26.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 26 && across <= 13000) {
			unit = across / 26;
			change = across % 26;
			across = across - change;
			each = (across - unit) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 8:
			System.out.println("Bet in increments of 26.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 26 && across <= 13000) {
			unit = across / 26;
			change = across % 26;
			across = across - change;
			each = (across - unit) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 9:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 10:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
			default:
				break;
		}
		
    }
}
