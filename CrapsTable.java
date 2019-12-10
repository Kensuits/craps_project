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
	HornHYo hYo = new HornHYo();
	HornHAd hAd = new HornHAd();
	HornHAces hAce = new HornHAces();
	Twelve tw = new Twelve();
	YoEleven yo = new YoEleven();
	AceDuece aD = new AceDuece();
	Aces ace = new Aces();
	HardFour hard4 = new HardFour();
	HardTen hard10 = new HardTen();
	HardSix hard6 = new HardSix();
	HardEight hard8 = new HardEight();
	PlaceFour place4 = new PlaceFour();
	PlaceFive place5 = new PlaceFive();
	PlaceSix place6 = new PlaceSix();
	PlaceEight place8 = new PlaceEight();
	PlaceNine place9 = new PlaceNine();
	PlaceTen place10 = new PlaceTen();
	Come cb = new Come();
	ComeFour cb4 = new ComeFour();
	ComeFive cb5 = new ComeFive();
	ComeSix cb6 = new ComeSix();
	ComeEight cb8 = new ComeEight();
	ComeNine cb9 = new ComeNine();
	ComeTen cb10 = new ComeTen();
	DontCome dc = new DontCome();
	DontComeFour dc4 = new DontComeFour();
	DontComeFive dc5 = new DontComeFive();
	DontComeSix dc6 = new DontComeSix();
	DontComeEight dc8 = new DontComeEight();
	DontComeNine dc9 = new DontComeNine();
	DontComeTen dc10 = new DontComeTen();
	Lay lay = new Lay();
	Odds odds = new Odds();

	
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
			//winners
			hb.betWin(); h12.betWin(); hYo.betWin(); hAd.betWin(); hAce.betWin(); aC.betWin(); ace.betWin(); field.betDouble();
			//losers
			tw.betLose(); yo.betLose(); aD.betLose(); h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
		case 3:
			//winners
			hb.betWin(); h12.betWin(); hYo.betWin(); hAd.betWin(); hAce.betWin(); aC.betWin(); aD.betWin(); dont.betWin(); field.betWin();
			//losers
			tw.betLose(); yo.betLose(); ace.betLose(); h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose(); pass.betLose();
			break;
		case 7:
			odds.saveOdds();
			lay.winLay4();
			lay.winLay5();
			lay.winLay6();
			lay.winLay8();
			lay.winLay9();
			lay.winLay10();
			dc4.dontCome4();
			dc5.dontCome5();
			dc6.dontCome6();
			dc8.dontCome8();
			dc9.dontCome9();
			dc10.dontCome10();
			cb4.betLose();
			cb5.betLose();
			cb6.betLose();
			cb8.betLose();
			cb9.betLose();
			cb10.betLose();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
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
			hYo.betWin();
			hAd.betWin();
			hAce.betWin();
			aC.betLose();
			tw.betLose();
			yo.betWin();
			aD.betLose();
			ace.betLose();
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
			hYo.betWin();
			hAd.betWin();
			hAce.betWin();
			aC.betWin();
			tw.betWin();
			yo.betLose();
			aD.betLose();
			ace.betLose();
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
			lay.loseLay4();
			dc4.dontCome4();
			cb4.come4();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betWin();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betWin();
		case 5:
			lay.loseLay5();
			dc5.dontCome5();
			cb5.come5();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betWin();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 6:
			lay.loseLay6();
			dc6.dontCome6();
			cb6.come6();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betWin();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 8:
			lay.loseLay8();
			dc8.dontCome8();
			cb8.come8();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betWin();
			h9.betLose();
			h10.betLose();
			field.betLose();
		case 9:
			lay.loseLay9();
			dc9.dontCome9();
			cb9.come9();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betWin();
			h10.betLose();
		case 10:
			lay.loseLay10();
			dc10.dontCome10();
			cb10.come10();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betWin();
			newPoint.pointIs();
			System.out.println("      'The point is " + Point.pnt + "'\n");
			dont.pointLay();
			pass.pointOdds();
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
			hard4.checkHard4();
			hard6.checkHard6();
			hard8.checkHard8();
			hard10.checkHard10();
			place4.check();
			place5.check();
			place6.check();
			place8.check();
			place9.check();
			place10.check();
			cb.moveTo();
			dc.moveTo();
			
			
			if(Roll.call == 4 || Roll.call == 9 || Roll.call == 10) {
				field.betWin();
			}
			if(Roll.call == 5 || Roll.call == 6 || Roll.call == 8) {
				field.betLose();
			}
			if(Roll.call == 4) {
				odds.winOdds4();
			}
			if(Roll.call == 5) {
				odds.winOdds5();
			}
			if(Roll.call == 6) {
				odds.winOdds6();
			}
			if(Roll.call == 8) {
				odds.winOdds8();
			}
			if(Roll.call == 9) {
				odds.winOdds9();
			}
			if(Roll.call == 10) {
				odds.winOdds10();
			}

			Point.pnt = 0;
			opt.coMenu();
			
		}
		if(Roll.call == 7) {
			System.out.println("  'Seven out! Line Away!'\n");
			pass.betLose();
			dont.betWin();
			hard4.betLose();
			hard6.betLose();
			hard8.betLose();
			hard10.betLose();
			place4.betLose();
			place5.betLose();
			place6.betLose();
			place8.betLose();
			place9.betLose();
			place10.betLose();
			cb.betWin();
			cb4.betLose();
			cb5.betLose();
			cb6.betLose();
			cb8.betLose();
			cb9.betLose();
			cb10.betLose();
			dc.betLose();
			dc4.dontCome4();
			dc5.dontCome5();
			dc6.dontCome6();
			dc8.dontCome8();
			dc9.dontCome9();
			dc10.dontCome10();
			lay.winLay4();
			lay.winLay5();
			lay.winLay6();
			lay.winLay8();
			lay.winLay9();
			lay.winLay10();
			odds.loseOdds4();
			odds.loseOdds5();
			odds.loseOdds6();
			odds.loseOdds8();
			odds.loseOdds9();
			odds.loseOdds10();
			Point.pnt = 0;
			opt.coMenu();
		}
		switch(Roll.call) {
		case 2:
			dc.betWin();
			cb.betLose();
			hb.betWin();
			h12.betWin();
			hYo.betWin();
			hAd.betWin();
			hAce.betWin();
			aC.betWin();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betWin();
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
			dc.betWin();
			cb.betLose();
			hb.betWin();
			h12.betWin();
			hYo.betWin();
			hAd.betWin();
			hAce.betWin();
			aC.betWin();
			tw.betLose();
			yo.betLose();
			aD.betWin();
			ace.betLose();
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
			odds.winOdds4();
			lay.loseLay4();
			dc4.dontCome4(); dc.moveTo();
			cb4.come4();cb.moveTo();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			hard4.checkHard4();
			place4.check();
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
			odds.winOdds5();
			lay.loseLay5();
			dc5.dontCome5(); dc.moveTo();
			cb5.come5();cb.moveTo();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betWin();
			place5.check();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
			break;
		case 6:
			odds.winOdds6();
			lay.loseLay6();
			dc6.dontCome6(); dc.moveTo();
			cb6.come6();cb.moveTo();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betWin();
			place6.check();
			hard6.checkHard6();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betLose();
			field.betLose();
			break;
		case 8:
			odds.winOdds8();
			lay.loseLay8();
			dc8.dontCome8(); dc.moveTo();
			cb8.come8();cb.moveTo();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betWin();
			place8.check();
			hard8.checkHard8();
			h9.betLose();
			h10.betLose();
			field.betLose();
			break;
		case 9:
			odds.winOdds9();
			lay.loseLay9();
			dc9.dontCome9(); dc.moveTo();
			cb9.come9();cb.moveTo();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betWin();
			place9.check();
			h10.betLose();
			field.betWin();
			break;
		case 10:
			odds.winOdds10();
			lay.loseLay10();
			dc10.dontCome10(); dc.moveTo();
			cb10.come10();cb.moveTo();
			hb.betLose();
			h12.betLose();
			hYo.betLose();
			hAd.betLose();
			hAce.betLose();
			aC.betLose();
			tw.betLose();
			yo.betLose();
			aD.betLose();
			ace.betLose();
			h4.betLose();
			h5.betLose();
			h6.betLose();
			h7.betLose();
			h8.betLose();
			h9.betLose();
			h10.betWin();
			hard10.checkHard10();
			place10.check();
			field.betWin();
			break;
		case 11:
			dc.betLose();
			cb.betWin();
			hb.betWin();
			h12.betWin();
			hYo.betWin();
			hAd.betWin();
			hAce.betWin();
			aC.betLose();
			tw.betLose();
			yo.betWin();
			aD.betLose();
			ace.betLose();
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
			dc.moveTo();
			cb.betLose();
			hb.betWin();
			h12.betWin();
			hYo.betWin();
			hAd.betWin();
			hAce.betWin();
			aC.betWin();
			tw.betWin();
			yo.betLose();
			aD.betLose();
			ace.betLose();
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
