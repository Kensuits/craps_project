package craps_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Field implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int fieldBet;
	
	public void fieldBet() {
		System.out.print("Field Bet = $");
		
		try {
		fieldBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= fieldBet && fieldBet <= 2500 && fieldBet >= 5) {
			Bankroll.balance = Bankroll.balance - fieldBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int betDouble() {
		fieldBet = fieldBet * 3;
		Bankroll.balance = Bankroll.balance + fieldBet;
		CrapsLog.update();
		if(Field.fieldBet > 0) {
			System.out.println("Field Wins = $" + Field.fieldBet + "\n");
		}
		return fieldBet;
	}

	@Override
	public int betWin() {	
		fieldBet = fieldBet * 2;
		Bankroll.balance = Bankroll.balance + fieldBet;
		CrapsLog.update();
		if(Field.fieldBet > 0) {
			System.out.println("Field Wins = $" + Field.fieldBet + "\n");
		}
		fieldBet = 0;
		return fieldBet;
	}

	@Override
	public int betLose() {
		if(Field.fieldBet > 0) {
			System.out.println("Field loses.\n");
		}
		fieldBet = fieldBet * 0;
		//CrapsLog.update();
		return fieldBet;
	}
}
