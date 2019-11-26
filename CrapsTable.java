package craps_project;
import java.io.IOException;


public class CrapsTable implements GameState{
	Roll roll = new Roll();
	Point newPoint = new Point();
	Passline pass = new Passline();
	DontPass dont = new DontPass();
	Field field = new Field();
	HopFour h4 = new HopFour();
	HopFive h5 = new HopFive();
	HopSix h6 = new HopSix();
	HopSeven h7 = new HopSeven();
	HopEight h8 = new HopEight();
	HopNine h9 = new HopNine();
	HopTen h10 = new HopTen();
	AnyCrap aC = new AnyCrap();
	Horn hb = new Horn();
	HornH12 h12 = new HornH12();
	
	public void firstRoll() {

	}
	
	@Override
	public boolean pointOff() throws IOException {
		
		Options opt = new Options();
		roll.die1();
		roll.die2();
		roll.call();
		switch(Roll.call) {
		case 2:
			hb.betWin();
			h12.betWin();
			aC.betWin();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betDouble();
		case 3:
			hb.betWin();
			h12.betWin();
			aC.betWin();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			pass.betLose();
			dont.betWin();
			field.betWin();
			break;
		case 7:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betWin();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 11:
			hb.betWin();
			h12.betWin();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betWin();
			pass.betWin();
			dont.betLose();
			break;
		case 12:
			hb.betWin();
			h12.betWin();
			aC.betWin();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betDouble();
			pass.betLose();
			break;
		case 4:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betWin();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betWin();
		case 5:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betWin();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 6:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betWin();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 8:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betWin();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 9:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betWin();
			h10.betLose();
		case 10:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betWin();
			newPoint.pointIs();
			System.out.println("      'The point is " + Point.pnt + "'\n");
			field.betWin();
			opt.peMenu();
			break;
			default:
				break;
		}
		return false;
	}

	@Override
	public boolean pointOn() throws IOException {
		
		Options opt = new Options();
		roll.die1();
		roll.die2();
		roll.call();
		
		if(Roll.call == Point.pnt) {
			System.out.println("    'Frontline Winner!'\n");
			pass.betWin();
			dont.betLose();
			if(Roll.call == 4 || Roll.call == 9 || Roll.call == 10) {
				field.betWin();
			}
			if(Roll.call == 5 || Roll.call == 6 || Roll.call == 8) {
				field.betLose();
			}

			Point.pnt = 0;
			opt.coMenu();
			
		}
		if(Roll.call == 7) {
			System.out.println("  'Seven out! Line Away!'\n");
			pass.betLose();
			dont.betWin();
			Point.pnt = 0;
			opt.coMenu();
		}
		switch(Roll.call) {
		case 2:
			hb.betWin();
			h12.betWin();
			aC.betWin();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betDouble();
			break;
		case 3:
			hb.betWin();
			h12.betWin();
			aC.betWin();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betWin();
			break;
		case 4:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betWin();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betWin();
			break;
		case 5:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betWin();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
			break;
		case 6:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betWin();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
			break;
		case 8:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betWin();
			h9.betLose();
			h10.betLose();
			field.betLose();
			break;
		case 9:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betWin();
			h10.betLose();
			field.betWin();
			break;
		case 10:
			hb.betLose();
			h12.betLose();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betWin();
			field.betWin();
			break;
		case 11:
			hb.betWin();
			h12.betWin();
			aC.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betWin();
			break;
		case 12:
			hb.betWin();
			h12.betWin();
			aC.betWin();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betDouble();
			break;
			default:
				break;
		}
		return false;

	}

}
