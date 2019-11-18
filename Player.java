package craps_project;
import java.io.*;

public class Player {
	
       public static String name;
       static InputStreamReader ir = new InputStreamReader(System.in);
       static BufferedReader br = new BufferedReader(ir);
	
	public Player() {
	}
	
	public static String playerId() {
		try {
			System.out.print("Enter Player Id = ");
			name = br.readLine();
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return name;
		
	}
}
