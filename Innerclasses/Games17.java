// innerclasses/Games17.java
// TIJ4 Chapter Innerclasses, Exercise 17, page 364
/* Modify the solution to Exercise 19 from the Interfaces chapter to use
* anonymous inner classes. 
* (Exercise 19, Interfaces: Create a framework using Factory Methods
* that performs both coin tossing and dice tossing.
*/
import java.util.*;
import static org.greggordon.tools.Print.*;

interface Games {
	void play();
}

interface GamesFactory {
	Games getGames();
}

class CoinToss implements Games {
	Random rand = new Random();
	public void play() { 
		print("Toss Coin: ");
		switch(rand.nextInt(2)) {
			case 0 : println("Heads"); return;
			case 1 : println("Tails"); return;
			default: println("OnEdge"); return;
		} 
	}
	public static GamesFactory factory =
		new GamesFactory() {
			public Games getGames() { return new CoinToss(); }	
		};
}

class DiceThrow implements Games {
	Random rand = new Random();
	public void play() { 
		print("Throw Dice: " + (rand.nextInt(6) + 1));		
	}
	public static GamesFactory factory =
		new GamesFactory() {
			public Games getGames() { return new DiceThrow(); }
		};
}

public class Games17 {
	public static void playGame(GamesFactory factory) {
		Games g = factory.getGames();
		g.play();
	}
	public static void main(String [] args) {
		playGame(CoinToss.factory);
		playGame(DiceThrow.factory);			
	}
}