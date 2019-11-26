package craps_project;

import java.io.IOException;

public interface GameState {

	boolean pointOff() throws IOException;
	boolean pointOn() throws IOException;
	
}
