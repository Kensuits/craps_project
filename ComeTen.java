package craps_project;

public class ComeTen implements Wager {

	public void come10() {
		if(Come.comeTen > 0 && Roll.call == 10) {
			betWin();
		}
		if(Come.comeTen > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		Come.comeTen = Come.comeTen * 2;
		Bankroll.balance = Bankroll.balance + Come.comeTen;
		if(Come.comeTen > 0) {
			System.out.println("Come Bet Ten Wins = $" + Come.comeTen + "\n");
		}
		Come.comeTen = 0;
		return Come.comeTen;
	}

	@Override
	public int betLose() {
		if(Come.comeTen > 0) {
			System.out.println("Come Bet Ten Loses.\n");
		}
		Come.comeTen = Come.comeTen * 0;
		return Come.comeTen;
	}
	
}
