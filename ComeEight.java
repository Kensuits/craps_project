package craps_project;

public class ComeEight implements Wager {

	public void come8() {
		if(Come.comeEight > 0 && Roll.call == 8) {
			betWin();
		}
		if(Come.comeEight > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		Come.comeEight = Come.comeEight * 2;
		Bankroll.balance = Bankroll.balance + Come.comeEight;
		if(Come.comeEight > 0) {
			System.out.println("Come Bet Eight Wins = $" + Come.comeEight + "\n");
		}
		Come.comeEight = 0;
		return Come.comeEight;
	}

	@Override
	public int betLose() {
		if(Come.comeEight > 0) {
			System.out.println("Come Bet Eight Loses.\n");
		}
		Come.comeEight = Come.comeEight * 0;
		return Come.comeEight;
	}
	
}
