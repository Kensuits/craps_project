package craps_project;

public class ComeSix implements Wager {

	public void come6() {
		if(Come.comeSix > 0 && Roll.call == 6) {
			betWin();
		}
		if(Come.comeSix > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		Come.comeSix = Come.comeSix * 2;
		Bankroll.balance = Bankroll.balance + Come.comeSix;
		if(Come.comeSix > 0) {
			System.out.println("Come Bet Six Wins = $" + Come.comeSix + "\n");
		}
		Come.comeSix = 0;
		return Come.comeSix;
	}

	@Override
	public int betLose() {
		if(Come.comeSix > 0) {
			System.out.println("Come Bet Six Loses.\n");
		}
		Come.comeSix = Come.comeSix * 0;
		return Come.comeSix;
	}
	
}
