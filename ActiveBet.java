package craps_project;

public class ActiveBet {

	public void activeBet() {

		System.out.println("|   4  |    5   |    6   |    8   |    9   |   10   |");
		System.out.println("_____________________________________________________");
		System.out.print("  $" + PlaceFour.place4 + "     $" + PlaceFive.place5 +
				"       $" + PlaceSix.place6 + "       $" + PlaceEight.place8 + "       $" +
				PlaceNine.place9 + "       $" + PlaceTen.place10 + "\t - ");
	}
}
