package craps_project;

public class DontComeFive implements Wager {

	public void dontCome5() {
		if(DontCome.dontFive > 0 && Roll.call == 5) {
			betLose();
		}
		if(DontCome.dontFive > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		DontCome.dontFive = DontCome.dontFive * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontFive;
		if(DontCome.dontFive > 0) {
			System.out.println("Don't come Bet Five Wins = $" + DontCome.dontFive + "\n");
		}
		DontCome.dontFive = 0;
		return DontCome.dontFive;
	}

	@Override
	public int betLose() {
		if(DontCome.dontFive > 0) {
			System.out.println("Don't come Bet Five Loses.\n");
		}
		DontCome.dontFive = DontCome.dontFive * 0;
		return DontCome.dontFive;
	}
	
}
