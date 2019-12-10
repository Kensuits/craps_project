package craps_project;

public class ComeFive implements Wager {

	public void come5() {
		if(Come.comeFive > 0 && Roll.call == 5) {
			betWin();
		}
		if(Come.comeFive > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		Come.comeFive = Come.comeFive * 2;
		Bankroll.balance = Bankroll.balance + Come.comeFive;
		if(Come.comeFive > 0) {
			System.out.println("Come Bet Five Wins = $" + Come.comeFive + "\n");
		}
		Come.comeFive = 0;
		return Come.comeFive;
	}

	@Override
	public int betLose() {
		if(Come.comeFive > 0) {
			System.out.println("Come Bet Five Loses.\n");
		}
		Come.comeFive = Come.comeFive * 0;
		return Come.comeFive;
	}
	
}
