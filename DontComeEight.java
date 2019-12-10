package craps_project;

public class DontComeEight implements Wager {

	public void dontCome8() {
		if(DontCome.dontEight > 0 && Roll.call == 8) {
			betLose();
		}
		if(DontCome.dontEight > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		DontCome.dontEight = DontCome.dontEight * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontEight;
		if(DontCome.dontEight > 0) {
			System.out.println("Don't come Bet Eight Wins = $" + DontCome.dontEight + "\n");
		}
		DontCome.dontEight = 0;
		return DontCome.dontEight;
	}

	@Override
	public int betLose() {
		if(DontCome.dontEight > 0) {
			System.out.println("Don't come Bet Eight Loses.\n");
		}
		DontCome.dontEight = DontCome.dontEight * 0;
		return DontCome.dontEight;
	}
	
}