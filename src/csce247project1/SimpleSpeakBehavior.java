package csce247project1;

import java.util.Random;

public class SimpleSpeakBehavior implements TalkBehavior {

	// calls random
	Random rand = new Random();
	
	public String talk() {
		// generate random int between 0-4
		int n = rand.nextInt(5);
		
		if (n == 0)
			return "Wall-E";
		else if (n == 1)
			return "EVA!";
		else if (n == 2)
			return "Pop";
		else if (n == 3)
			return "Eva?";
		else
			return "Eee-va?";
		}

}
