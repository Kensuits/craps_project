package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlaceBets {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    CrapsTable ct = new CrapsTable();
    Inside in = new Inside();
    Outside out = new Outside();
    Across acr = new Across();
    public static int remain;
    
    public PlaceBets() {
    	
    }
    
    public void placeMenu() {
    	Options opt = new Options();
    	
    	try {
    		System.out.println("___________________________");
    		System.out.println("[1]Four     [7]Inside");
    		System.out.println("[2]Five     [8]Outside");
    		System.out.println("[3]Six      [9]Across");
    		System.out.println("[4]Eight    [10]Return");
    		System.out.println("[5]Nine     [0]Roll");
    		System.out.println("[6]Ten");
    		System.out.println("___________________________");
    		
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					Four();
					break;
				case 2:
					Five();
					break;
				case 3:
					Six();
					break;
				case 4:
					Eight();
					break;
				case 5:
					Nine();
					break;
				case 6:
					Ten();
					break;
				case 7:
					in.inside();
					break;
				case 8:
					out.outside();
					break;
				case 9:
					acr.across();
					break;
				case 10:
					opt.peMenu();
					break;
				case 0:
					ct.pointOn();
					break;
					default:
						break;
				}
			}
    	}catch(Exception e) {
			System.out.println("Invalid Entry");
    	}
    }
    
    
    
    public void Four()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
    	
    	try {
    		int place4 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place4 && place4 <= 2500) {
        		remain = place4 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
    			Bankroll.balance = Bankroll.balance - place4;
    			PlaceFour.place4 = place4;
    		}else if(place4 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place4 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place4 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    }



    
    
    public void Five()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place5 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place5 && place5 <= 2500) {
        		remain = place5 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
    			Bankroll.balance = Bankroll.balance - place5;
    			PlaceFive.place5 = place5;
    		}
    		else if(place5 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place5 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place5 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Six()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		
    		int place6 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place6 && place6 <= 3000 && place6 >= 6) {
        		remain = place6 % 6;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
        		
    			Bankroll.balance = Bankroll.balance - place6;
    			PlaceSix.place6 = place6;
    			System.out.println("$" + (PlaceSix.place6 - remain) + " on the six.");
    		
    		}else if(place6 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place6 < 6) {
    			System.out.println("$6 is the minimum bet.");
    		}else if(place6 > 3000) {
    			System.out.println("$3000 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Eight()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place8 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place8 && place8 <= 3000) {
        		remain = place8 % 6;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
        		
    			Bankroll.balance = Bankroll.balance - place8;
    			PlaceEight.place8 = place8;
    		}else if(place8 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place8 < 6) {
    			System.out.println("$6 is the minimum bet.");
    		}else if(place8 > 3000) {
    			System.out.println("$3000 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Nine()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place9 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place9 && place9 <= 2500) {
        		remain = place9 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
        		
    			Bankroll.balance = Bankroll.balance - place9;
    			PlaceNine.place9 = place9;
    		}else if(place9 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place9 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place9 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Ten()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place10 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place10 && place10 <= 2500) {
        		remain = place10 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
    			Bankroll.balance = Bankroll.balance - place10;
    			PlaceTen.place10 = place10;
    		}else if(place10 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place10 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place10 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    


}
