package craps_project;

public class ComeNine implements Wager {

	public void come9() {
		if(Come.comeNine > 0 && Roll.call == 9) {
			betWin();
		}
		if(Come.comeNine > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		Come.comeNine = Come.comeNine * 2;
		Bankroll.balance = Bankroll.balance + Come.comeNine;
		if(Come.comeNine > 0) {
			System.out.println("Come Bet Nine Wins = $" + Come.comeNine + "\n");
		}
		Come.comeNine = 0;
		return Come.comeNine;
	}

	@Override
	public int betLose() {
		if(Come.comeNine > 0) {
			System.out.println("Come Bet Nine Loses.\n");
		}
		Come.comeNine = Come.comeNine * 0;
		return Come.comeNine;
	}
	
}