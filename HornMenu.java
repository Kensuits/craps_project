package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HornMenu {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    CrapsTable ct = new CrapsTable();
    Horn hb = new Horn();
    HornH12 hb12 = new HornH12();

	public HornMenu() {
		
	}
	
	public void coHornMenu() {
		Options opt = new Options();
		try {
			System.out.println("_____________________________");
			System.out.println("[1]Horn          [6]Twelve");
			System.out.println("[2]Horn High 12  [7]Eleven");
			System.out.println("[3]Horn High 11  [8]Ace/Duece");
			System.out.println("[4]Horn High 1/2 [9]Aces");
			System.out.println("[5]Horn High 1/1 [10]Return");
			System.out.println("                 [0]Roll");
			System.out.println("_____________________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					hb.horn();
					break;
				case 2:
					hb12.horn();
					break;
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
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
	
	public void peHornMenu() {
		Options opt = new Options();
		try {
			System.out.println("_____________________________");
			System.out.println("[1]Horn          [6]Twelve");
			System.out.println("[2]Horn High 12  [7]Eleven");
			System.out.println("[3]Horn High 11  [8]Ace/Duece");
			System.out.println("[4]Horn High 1/2 [9]Aces");
			System.out.println("[5]Horn High 1/1 [10]Return");
			System.out.println("                 [0]Roll");
			System.out.println("_____________________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					hb.horn();
					break;
				case 2:
					hb12.horn();
					break;
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
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
