package craps_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odds {
	    static InputStreamReader ir = new InputStreamReader(System.in);
	    static BufferedReader br = new BufferedReader(ir);
	    public static int oddsBet;
	    public static int maxOdds;
	    public static int oddsFour, oddsFive, oddsSix, oddsEight, oddsNine, oddsTen;
	    

		public Odds() {
			
		}
		
		public void lay() {
			Options opt = new Options();
			CrapsTable ct = new CrapsTable();
			System.out.println("______________________");
			System.out.println("[4]Four     [8]Eight");
			System.out.println("[5]Five     [9]Nine");
			System.out.println("[6]Six      [10]Ten");
			System.out.println("            [1]Return");
			System.out.println("            [0]Roll");
			System.out.println("______________________");
			
			while(true) {
			try {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 4:
					odds4();
					break;
				case 5:
					odds5();
					break;
				case 6:
					odds6();
					break;
				case 8:
					odds8();
					break;
				case 9:
					odds9();
					break;
				case 10:
					odds10();
					break;
				case 1:
					if(Point.pnt == 0) {
						opt.coMenu();
					}else {
						opt.peMenu();
					}
					break;
				case 0:
					if(Point.pnt == 0) {
						ct.pointOff();
					}else {
						ct.pointOn();
					}
					default:
						break;
				}

			} catch (IOException e) {
				System.out.println("Invalid Entry");
			}
			}
		}
		
		public void odds4() {
			System.out.print("How Much = $");
			
			try {
			oddsFour = Integer.parseInt(br.readLine());
			maxOdds = Come.comeFour * 3;
			int exist = Come.comeFour;
			int pass = Passline.passBet;
			int passMax = pass * 3;
			
			if(exist > 0 || pass > 0 && oddsFour <= passMax || oddsFour <= maxOdds && oddsFour <= Bankroll.balance) {
				Bankroll.balance = Bankroll.balance - oddsFour;
			}else {
				System.out.println("No Bet!");
			}

			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
		}
		
		public int winOdds4() {
			oddsFour = (oddsFour * 2) + oddsFour;
			Bankroll.balance = Bankroll.balance + oddsFour;
			if(Odds.oddsFour > 0) {
				System.out.println("Odds on Four Wins = $" + Odds.oddsFour + "\n");
			}
			oddsFour = 0;
			return oddsFour;
		}
		
		public int loseOdds4() {
			if(Odds.oddsFour > 0) {
				System.out.println("Odds on Four Loses.\n");
			}
			oddsFour = oddsFour * 0;
			return oddsFour;
		}
		
		public void odds5() {
			System.out.print("How Much = $");
			
			try {
			oddsFive = Integer.parseInt(br.readLine());
			maxOdds = Come.comeFive * 4;
			int exist = Come.comeFive;
			int pass = Passline.passBet;
			int passMax = pass * 4;
			
			if(exist > 0 || pass > 0 && oddsFive <= passMax || oddsFive <= maxOdds && oddsFive <= Bankroll.balance) {
				Bankroll.balance = Bankroll.balance - oddsFive;
			}else {
				System.out.println("No Bet!");
			}

			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
		}
		
		public int winOdds5() {
			oddsFive = (oddsFive / 2 * 3) + oddsFive;
			Bankroll.balance = Bankroll.balance + oddsFive;
			if(Odds.oddsFive > 0) {
				System.out.println("Odds on Five Wins = $" + Odds.oddsFive + "\n");
			}
			oddsFive = 0;
			return oddsFive;
		}
		
		public int loseOdds5() {
			if(Odds.oddsFive > 0) {
				System.out.println("Odds on Five Loses.\n");
			}
			oddsFive = oddsFive * 0;
			return oddsFive;
		}
		
		
		public void odds6() {
			System.out.print("How Much = $");
			
			try {
			oddsSix = Integer.parseInt(br.readLine());
			maxOdds = Come.comeSix * 5;
			int exist = Come.comeSix;
			int pass = Passline.passBet;
			int passMax = pass * 5;
			
			if(exist > 0 || pass > 0 && oddsSix <= passMax || oddsSix <= maxOdds && oddsSix <= Bankroll.balance) {
				Bankroll.balance = Bankroll.balance - oddsSix;
			}else {
				System.out.println("No Bet!");
			}

			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
		}
		
		public int winOdds6() {
			oddsSix = (oddsSix / 5 * 6) + oddsSix;
			Bankroll.balance = Bankroll.balance + oddsSix;
			if(Odds.oddsSix > 0) {
				System.out.println("Odds on Six Wins = $" + Odds.oddsSix + "\n");
			}
			oddsSix = 0;
			return oddsSix;
		}
		
		public int loseOdds6() {
			if(Odds.oddsSix > 0) {
				System.out.println("Odds on Six Loses.\n");
			}
			oddsSix = oddsSix * 0;
			return oddsSix;
		}
		
		public void odds8() {
			System.out.print("How Much = $");
			
			try {
			oddsEight = Integer.parseInt(br.readLine());
			maxOdds = Come.comeEight * 5;
			int exist = Come.comeEight;
			int pass = Passline.passBet;
			int passMax = pass * 5;
			
			if(exist > 0 || pass > 0 && oddsEight <= passMax || oddsEight <= maxOdds && oddsSix <= Bankroll.balance) {
				Bankroll.balance = Bankroll.balance - oddsEight;
			}else {
				System.out.println("No Bet!");
			}

			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
		}
		
		public int winOdds8() {
			oddsEight = (oddsEight / 5 * 6) + oddsEight;
			Bankroll.balance = Bankroll.balance + oddsEight;
			if(Odds.oddsEight> 0) {
				System.out.println("Odds on Eight Wins = $" + Odds.oddsEight + "\n");
			}
			oddsEight = 0;
			return oddsEight;
		}
		
		public int loseOdds8() {
			if(Odds.oddsEight > 0) {
				System.out.println("Odds on Eight Loses.\n");
			}
			oddsEight = oddsEight * 0;
			return oddsEight;
		}
		
		public void odds9() {
			System.out.print("How Much = $");
			
			try {
			oddsNine = Integer.parseInt(br.readLine());
			maxOdds = Come.comeNine * 4;
			int exist = Come.comeNine;
			int pass = Passline.passBet;
			int passMax = pass * 4;
			
			if(exist > 0 || pass > 0 && oddsNine <= passMax || oddsNine <= maxOdds && oddsFive <= Bankroll.balance) {
				Bankroll.balance = Bankroll.balance - oddsNine;
			}else {
				System.out.println("No Bet!");
			}

			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
		}
		
		public int winOdds9() {
			oddsNine = (oddsNine / 2 * 3) + oddsNine;
			Bankroll.balance = Bankroll.balance + oddsNine;
			if(Odds.oddsNine > 0) {
				System.out.println("Odds on Nine Wins = $" + Odds.oddsNine + "\n");
			}
			oddsNine = 0;
			return oddsNine;
		}
		
		public int loseOdds9() {
			if(Odds.oddsNine > 0) {
				System.out.println("Odds on Nine Loses.\n");
			}
			oddsNine = oddsNine * 0;
			return oddsNine;
		}
		
		public void odds10() {
			System.out.print("How Much = $");
			
			try {
			oddsTen = Integer.parseInt(br.readLine());
			maxOdds = Come.comeTen * 3;
			int exist = Come.comeFour;
			int pass = Passline.passBet;
			int passMax = pass * 3;
			
			if(exist > 0 || pass > 0 && oddsTen <= passMax || oddsTen <= maxOdds && oddsFour <= Bankroll.balance) {
				Bankroll.balance = Bankroll.balance - oddsTen;
			}else {
				System.out.println("No Bet!");
			}

			}catch(Exception e) {
				System.out.println("Invalid Entry");
			}
		}
		
		public int winOdds10() {
			oddsTen = (oddsFour * 2) + oddsTen;
			Bankroll.balance = Bankroll.balance + oddsTen;
			if(Odds.oddsTen > 0) {
				System.out.println("Odds on Ten Wins = $" + Odds.oddsTen + "\n");
			}
			oddsTen = 0;
			return oddsTen;
		}
		
		public int loseOdds10() {
			if(Odds.oddsTen > 0) {
				System.out.println("Odds on Ten Loses.\n");
			}
			oddsTen = oddsTen * 0;
			return oddsTen;
		}
			
		public int saveOdds() {
			int saveAll = 0;
			if(oddsFour > 0 || oddsFive > 0 || oddsSix > 0 || oddsEight > 0 || oddsNine > 0 || oddsTen > 0) {
				saveAll = oddsFour + oddsFive + oddsSix + oddsEight + oddsNine + oddsTen;
				System.out.println("$" + saveAll + " in odds returned.");
				Bankroll.balance = Bankroll.balance + saveAll;
			}
			return saveAll;
			
		}

	}

