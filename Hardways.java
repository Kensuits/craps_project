package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hardways {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    CrapsTable ct = new CrapsTable();
    HardFour hard4 = new HardFour();
    HardSix hard6 = new HardSix();
    HardEight hard8 = new HardEight();
    HardTen hard10 = new HardTen();
    
    public Hardways() {
    	
    }
    
    public void hardMenu() {
    	Options opt = new Options();
    	
    	try {
    		System.out.println("___________________________");
    		System.out.println("[1]Hard Four  [6]High Four");
    		System.out.println("[2]Hard Six   [7]High Six");
    		System.out.println("[3]Hard Eight [8]High Eight");
    		System.out.println("[4]Hard Ten   [9]High Ten");
    		System.out.println("[5]All Hards  [10]Return");
    		System.out.println("              [0]Roll");
    		System.out.println("___________________________");
    		
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					hard4.hard4();
					break;
				case 2:
					hard6.hard6();
					break;
				case 3: 
					hard8.hard8();
					break;
				case 4:
					hard10.hard10();
					break;
				case 5:
					allHards();
					break;
				case 6:
					hardHighFour();
					break;
				case 7:
					hardHighSix();
					break;
				case 8:
					hardHighEight();
					break;
				case 9:
					hardHighTen();
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
 
    
    public void allHards() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of four.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 4;
    	if(Bankroll.balance >= allHard && allHard <= 6400) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighFour() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 5357) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each * 2;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighSix() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 4166) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each * 2;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighEight() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 4166) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each * 2;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighTen() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 5357) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each * 2;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
}
