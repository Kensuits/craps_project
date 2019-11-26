package craps_project;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		CrapsLog.player1();
		CrapsLog.bankroll();
		
		String player = Player.name;
		int money = Bankroll.balance;
		System.out.print("\nWelcome " + player);
		System.out.println(" you have $" + money + ". Good Luck!\n");
		
		
		Options newGame = new Options();
		newGame.coMenu();
				 
		
	}

}
