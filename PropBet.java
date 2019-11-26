package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PropBet {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    CrapsTable ct = new CrapsTable();
    HopFour h4 = new HopFour();
    HopFive h5 = new HopFive();
    HopSix h6 = new HopSix();
    HopSeven h7 = new HopSeven();
    HopEight h8 = new HopEight();
    HopNine h9 = new HopNine();
    HopTen h10 = new HopTen();
    AnyCrap aC = new AnyCrap();
    Horn hb = new Horn();
    HornMenu hm = new HornMenu();
	
	public PropBet() {
		
	}
	
	public void coPropMenu() {
		Options opt = new Options();
		try {
			System.out.println("______________________");
			System.out.println("[1]Four    [6]Nine");
			System.out.println("[2]Five    [7]Ten");
			System.out.println("[3]Six     [8]Any Crap");
			System.out.println("[4]Seven   [9]Horn Bet");
			System.out.println("[5]Eight   [10]Return");
			System.out.println("           [0]Roll");
			System.out.println("______________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					h4.hopFour();
					break;
				case 2:
					h5.hopFive();
					break;
				case 3:
					h6.hopSix();
					break;
				case 4:
					h7.hopSeven();
					break;
				case 5:
					h8.hopEight();
					break;
				case 6:
					h9.hopNine();
					break;
				case 7:
					h10.hopTen();
					break;
				case 8:
					aC.anyCrap();
					break;
				case 9:
					hm.coHornMenu();
					//hb.horn();
					break;
				case 10:
					opt.coMenu();
					break;
				case 0:
					ct.pointOff();
					break;
					default:
						break;
				}
			}
			
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	public void pePropMenu() {
		Options opt = new Options();
		
		try {
			System.out.println("______________________");
			System.out.println("[1]Four    [6]Nine");
			System.out.println("[2]Five    [7]Ten");
			System.out.println("[3]Six     [8]Any Crap");
			System.out.println("[4]Seven   [9]Horn Bet");
			System.out.println("[5]Eight   [10]Return");
			System.out.println("           [0]Roll");
			System.out.println("______________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					h4.hopFour();
					break;
				case 2:
					h5.hopFive();
					break;
				case 3:
					h6.hopSix();
					break;
				case 4:
					h7.hopSeven();
					break;
				case 5:
					h8.hopEight();
					break;
				case 6:
					h9.hopNine();
					break;
				case 7:
					h10.hopTen();
					break;
				case 8:
					aC.anyCrap();
					break;
				case 9:
					hb.horn();
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

}
