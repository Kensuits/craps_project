package craps_project;

public class DontComeFour implements Wager {

	public void dontCome4() {
		if(DontCome.dontFour > 0 && Roll.call == 4) {
			betLose();
		}
		if(DontCome.dontFour > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		DontCome.dontFour = DontCome.dontFour * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontFour;
		if(DontCome.dontFour > 0) {
			System.out.println("Don't come Bet Four Wins = $" + DontCome.dontFour + "\n");
		}
		DontCome.dontFour = 0;
		return DontCome.dontFour;
	}

	@Override
	public int betLose() {
		if(DontCome.dontFour > 0) {
			System.out.println("Don't come Bet Four Loses.\n");
		}
		DontCome.dontFour = DontCome.dontFour * 0;
		return DontCome.dontFour;
	}
	
}
