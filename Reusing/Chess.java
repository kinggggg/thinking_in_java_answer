// reusing/Chess.java
// TIJ3 Chapter Reusing, Exercise 6, page 246
/* Using Chess.java, prove the statements in the previous paragraph. (If you
* don't call the base class constructor in BoardGame(), the compiler will
* complain that it can't find a constructor of the form Game(). In addition, the
* call to the base-class constructor must be the first thin you do in the
* derived-class constructor. The compiler will remind you if you get it wrong.)
*/
import static net.mindview.util.Print.*;

class Game {
	Game(int i) {
		print("Game constructor");
	}	
}

class BoardGame extends Game {
	BoardGame(int i) {
		// print("BoardGame constructor"); // call to super must be first
			// statement in constructor 
		super(i); // else: "cannot find symbol: constructor Game()
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
	}
	public static void main(String[] args) {
		Chess x = new Chess();
	}
}