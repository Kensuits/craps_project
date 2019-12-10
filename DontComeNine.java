package craps_project;

public class DontComeNine implements Wager {

	public void dontCome9() {
		if(DontCome.dontNine > 0 && Roll.call == 9) {
			betLose();
		}
		if(DontCome.dontNine > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		DontCome.dontNine = DontCome.dontNine * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontNine;
		if(DontCome.dontNine > 0) {
			System.out.println("Don't come Bet Nine Wins = $" + DontCome.dontNine + "\n");
		}
		DontCome.dontNine = 0;
		return DontCome.dontNine;
	}

	@Override
	public int betLose() {
		if(DontCome.dontNine > 0) {
			System.out.println("Don't come Bet Nine Loses.\n");
		}
		DontCome.dontNine = DontCome.dontNine * 0;
		return DontCome.dontNine;
	}
	
}
