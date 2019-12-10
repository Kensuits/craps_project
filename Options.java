package craps_project;
import java.io.*;

public class Options {
	String player = Player.name;
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    Roll roll = new Roll();
    CrapsTable ct = new CrapsTable();
    Passline pass = new Passline();
    DontPass dont = new DontPass();
    Field field = new Field();
    PropBet prop = new PropBet();
    Horn hb = new Horn();
    HornMenu hm = new HornMenu();
    Hardways hw = new Hardways();
    PlaceBets pb = new PlaceBets();
    Come cb = new Come();
    DontCome dc = new DontCome();
    Lay lay = new Lay();

	
	public Options() {
	}
	
	public void coMenu() throws IOException {
		
		
		System.out.print("\n  ---- " + player + " - $" + Bankroll.balance + " ----\n");
		System.out.println("     THE COME OUT ROLL   ");
		System.out.println("___________________________\n");
		System.out.println("[1]Passline   [5]Bets Work");
		System.out.println("[2]Don't Pass [6]Cashout");
		System.out.println("[3]Field Bet  [7]Rebuy");
		System.out.println("[4]Prop Bet   [0]Roll Dice");
		System.out.println("___________________________");
		
		while(true) {
		int select = Integer.parseInt(br.readLine());
		
		switch(select) {
		case 1:
			pass.passBet();
			break;
		case 2:
			dont.dontBet();
			break;
		case 3:
			field.fieldBet();
			break;
		case 4:
			prop.coPropMenu();
			break;
		case 5:
			peMenu();
		case 6:
			CrapsLog.cashout();
			System.out.println("$" + Bankroll.balance);
			break;
		case 7:
			CrapsLog.rebuy();
			System.out.println("$" + Bankroll.balance);
			break;
		case 0:
			ct.pointOff();
			break;
			default:
				break;
		}
		
		}
	}
	
	public void peMenu() throws IOException {
		
		
		System.out.print("  ---- " + player + " - $" + Bankroll.balance + " ----\n");
		System.out.println("    The Point is = " + Point.pnt);
		System.out.println("____________________________\n");
		System.out.println("[1]Passline   [8]Prop Bet");
		System.out.println("[2]Come Bet   [9]Horn Bet");
		System.out.println("[3]Don't Come [10]Bets Off");
		System.out.println("[4]Field Bet  [11]Cashout");
		System.out.println("[5]Place Bet  [12]Rebuy");
		System.out.println("[6]Hardway    [0]Roll Dice");
		System.out.println("[7]Lay Bet");
		System.out.println("____________________________");
		while(true) {
		int select = Integer.parseInt(br.readLine());
		
		switch(select) {
		
		case 1:
			pass.passBet();
			System.out.println(Passline.passBet);		
			break;
		case 2:
			cb.comeBet();
			break;
		case 3:
			dc.dontComeBet();
			break;
		case 4:
			field.fieldBet();
			break;
		case 5:
			pb.placeMenu();
			break;
		case 6:
			hw.hardMenu();
			break;
		case 7:
			lay.lay();
			break;
		case 8:
			prop.pePropMenu();
			break;
		case 9:
			hm.peHornMenu();
			//hb.horn();
			break;
		case 10:
		case 11:
			CrapsLog.cashout();
			System.out.println("$" + Bankroll.balance);
			break;
		case 12:
			CrapsLog.rebuy();
			System.out.println("$" + Bankroll.balance);
			break;
		case 0:
			ct.pointOn();
			break;
			default:
			break;
		}
		
	}
	}

}
