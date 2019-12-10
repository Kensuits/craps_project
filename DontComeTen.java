package craps_project;

public class DontComeTen implements Wager {

	public void dontCome10() {
		if(DontCome.dontTen > 0 && Roll.call == 10) {
			betLose();
		}
		if(DontCome.dontTen > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		DontCome.dontTen = DontCome.dontTen * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontTen;
		if(DontCome.dontTen > 0) {
			System.out.println("Don't come Bet Ten Wins = $" + DontCome.dontTen + "\n");
		}
		DontCome.dontTen = 0;
		return DontCome.dontTen;
	}

	@Override
	public int betLose() {
		if(DontCome.dontTen > 0) {
			System.out.println("Don't come Bet Ten Loses.\n");
		}
		DontCome.dontTen = DontCome.dontTen * 0;
		return DontCome.dontTen;
	}
	
}
