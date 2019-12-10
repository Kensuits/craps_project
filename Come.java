package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Come implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int comeBet;
    public static int comeFour, comeFive, comeSix, comeEight, comeNine, comeTen;
    Odds odds = new Odds();
    
	public Come() {
		
	}
	
	public void comeBet() {
		System.out.print("Come Bet = $");
		
		try {
		comeBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= comeBet && comeBet <= 2500 && comeBet >= 5) {
			Bankroll.balance = Bankroll.balance - comeBet;
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
			System.out.println("Come Bet Loses");
			betLose();
		case 4:
			if(comeBet > 0) {
				comeFour = comeBet;
				System.out.print("Odds on Four? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds4();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 5:
			if(comeBet > 0) {
				comeFive = comeBet;
				System.out.print("Odds on Five? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds5();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 6:
			if(comeBet > 0) {
				comeSix = comeBet;
				System.out.print("Odds on Six? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds6();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
			break;
		case 7:
			System.out.println("Come Bet Wins = $" + comeBet);
			betWin();
			break;
		case 8:
			if(comeBet > 0) {
				comeEight = comeBet;
				System.out.print("Odds on Eight? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds8();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 9:
			if(comeBet > 0) {
				comeNine = comeBet;
				System.out.print("Odds on Nine ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds9();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 10:
			if(comeBet > 0) {
				comeTen = comeBet;
				System.out.print("Odds on Ten? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds10();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
			break;
		case 11:
			System.out.println("Come Bet Wins = $" + comeBet);
			betWin();
			break;
		case 12:
			System.out.println("Come Bet Loses");
			betLose();
			default:
				break;
		}
		
	}
	
	
	@Override
	public int betWin() {
		comeBet = comeBet * 2;
		Bankroll.balance = Bankroll.balance + comeBet;
		if(Come.comeBet > 0) {
			System.out.println("Come Bet Wins = $" + Come.comeBet + "\n");
		}
		comeBet = 0;
		return comeBet;
	}

	@Override
	public int betLose() {
		if(Come.comeBet > 0) {
			System.out.println("Come Bet Loses.\n");
		}
		comeBet = comeBet * 0;
		return comeBet;
	}
	
}

