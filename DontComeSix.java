package craps_project;

public class DontComeSix implements Wager {

	public void dontCome6() {
		if(DontCome.dontSix > 0 && Roll.call == 6) {
			betLose();
		}
		if(DontCome.dontSix > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		DontCome.dontSix = DontCome.dontSix * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontSix;
		if(DontCome.dontSix > 0) {
			System.out.println("Don't come Bet Six Wins = $" + DontCome.dontSix + "\n");
		}
		DontCome.dontSix = 0;
		return DontCome.dontSix;
	}

	@Override
	public int betLose() {
		if(DontCome.dontSix > 0) {
			System.out.println("Don't come Bet Six Loses.\n");
		}
		DontCome.dontSix = DontCome.dontSix * 0;
		return DontCome.dontSix;
	}
	
}
