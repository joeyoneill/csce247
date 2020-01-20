package csce247project1;

import java.util.Random;

public class SpeakBehavior implements TalkBehavior {
	
	// calls random
	Random rand = new Random();
	
	public String talk() {
		// generate random int between 0-2
		int n = rand.nextInt(3);
		
		if (n == 0) {
			return "Hello";
		}
		else if (n == 1) {
			return "How are you?";
		}
		else {
			return "Good day";
		}
	}
	
}
