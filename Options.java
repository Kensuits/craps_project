package craps_project;
import java.io.*;

public class Options {
	String player = Player.name;
	int money = Bankroll.balance;
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	
	public Options() {
	}
	
	public void coMenu() throws IOException {
		
		System.out.print("-- " + player + " - $" + money + " --\n");
		System.out.println("Place your bets!");
		int select = Integer.parseInt(br.readLine());
	
		if(select == 1) {
			CrapsLog.rebuy();
			System.out.println("$" + Bankroll.balance);
		}
		if(select == 2) {
			CrapsLog.cashout();
			System.out.println("$" + Bankroll.balance);
		}
		
	}

}
