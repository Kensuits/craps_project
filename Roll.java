package craps_project;

public class Roll implements Die {
	private Die[] dice;
	public static int d1;
	public static int d2;
	public static int call;
	Dice roll = new Dice(6);

	public Roll(Die...die) {
		this.dice = die;
		die.toString();
	}
		
	public int die1() {
		d1 = roll.go();
		System.out.print("\n   -------[" + d1 + "] ");
		return d1;
	
	}
	
	public int die2() {
		d2 = roll.go();
		System.out.println("[" + d2 + "]-------");
		return d2;
	}
	
	public int call() {
		call = d1 + d2;
		System.out.println("            (" + call + ")\n");
		return call;
	}

	

	@Override
	public int go() {

		int response = ((int) (Math.random() * 6) + 1);
		for (Die d : dice) {
			response += d.go();
		}
		return response;

	}

}
