package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DontCome implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int dontComeBet;
    public static int dontFour, dontFive, dontSix, dontEight, dontNine, dontTen;
    Lay lay = new Lay();

	public DontCome() {
		
	}
	
	public void dontComeBet() {
		System.out.print("Don't Come Bet = $");
		
		try {
		dontComeBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= dontComeBet && dontComeBet <= 2500 && dontComeBet >= 5) {
			Bankroll.balance = Bankroll.balance - dontComeBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public void moveTo() {
		switch(Roll.call) {
		case 2:
		case 3:
			System.out.println("Don't come Bet Wins = $" + dontComeBet);
			betWin();
		case 4:
			if(dontComeBet > 0) {
				dontFour = dontComeBet;
				System.out.print("Lay the Four? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay4();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 5:
			if(dontComeBet > 0) {
				dontFive = dontComeBet;
				System.out.print("Lay the Five? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay5();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 6:
			if(dontComeBet > 0) {
				dontSix = dontComeBet;
				System.out.print("Lay the Six? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay6();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
			break;
		case 7:
			System.out.println("Don't come Bet Loses");
			betLose();
			break;
		case 8:
			if(dontComeBet > 0) {
				dontEight = dontComeBet;
				System.out.print("Lay the Eight? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay8();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 9:
			if(dontComeBet > 0) {
				dontNine = dontComeBet;
				System.out.print("Lay the Nine? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay9();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 10:
			if(dontComeBet > 0) {
				dontTen = dontComeBet;
				System.out.print("Lay the Ten? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay10();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
			break;
		case 11:
			System.out.println("Don't come Bet Loses");
			betLose();
			break;
		case 12:
			System.out.println("Don't come pushes.");
			Bankroll.balance = Bankroll.balance + dontComeBet;
			default:
				break;
		}
		
	}
	
	
	@Override
	public int betWin() {
		dontComeBet = dontComeBet * 2;
		Bankroll.balance = Bankroll.balance + dontComeBet;
		if(DontCome.dontComeBet > 0) {
			System.out.println("Come Bet Wins = $" + DontCome.dontComeBet + "\n");
		}
		dontComeBet = 0;
		return dontComeBet;
	}

	@Override
	public int betLose() {
		if(DontCome.dontComeBet > 0) {
			System.out.println("Don't come Bet Loses.\n");
		}
		dontComeBet = dontComeBet * 0;
		return dontComeBet;
	}
	
}