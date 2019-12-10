package craps_project;

public class ComeFour implements Wager {

	public void come4() {
		if(Come.comeFour > 0 && Roll.call == 4) {
			betWin();
		}
		if(Come.comeFour > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		Come.comeFour = Come.comeFour * 2;
		Bankroll.balance = Bankroll.balance + Come.comeFour;
		if(Come.comeFour > 0) {
			System.out.println("Come Bet Four Wins = $" + Come.comeFour + "\n");
		}
		Come.comeFour = 0;
		return Come.comeFour;
	}

	@Override
	public int betLose() {
		if(Come.comeFour > 0) {
			System.out.println("Come Bet Four Loses.\n");
		}
		Come.comeFour = Come.comeFour * 0;
		return Come.comeFour;
	}
	
}