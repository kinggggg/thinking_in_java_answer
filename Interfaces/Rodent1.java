// interfaces/rodent/Rodent1.java
// TIJ4 Chapter Interfaces, Exercise 1, page 315
/* Modify Exercise 9 in the previous chapter so that Rodent is an abstract class.
* Make the methods of Rodent abstract whenever possible.
*/
/* Solution includes, in same package: 
* import java.util.*;
* public class RandomRodentGenerator1 {
*	private Random rand = new Random();
*	public Rodent next() {
*		switch(rand.nextInt(3)) {
*			default:
*			case 0: return new Mouse();
*			case 1: return new Rat();
*			case 2: return new Squirrel();			
*		}
*	}
* }
*/

package interfaces.rodent;
import static org.greggordon.tools.Print.*;

abstract class Rodent {
	private String name = "Rodent";
	abstract protected void eat(); 
	abstract protected void run(); 
	abstract protected void sleep();
	abstract public String toString(); 
}

class Mouse extends Rodent {
	private String name = "Mouse";
	protected void eat() { println("Mouse.eat()"); }
	protected void run() { println("Mouse.run()"); }
	protected void sleep() { println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat extends Rodent {
	private String name = "Rat";
	protected void eat() { println("Rat.eat()"); }
	protected void run() { println("Rat.run()"); }
	protected void sleep() { println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel extends Rodent {
	private String name = "Squirrel";
	protected void eat() { println("Squirrel.eat()"); }
	protected void run() { println("Squirrel.run()"); }
	protected void sleep() { println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class Rodent1 {
	private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
	public static void main(String[] args) {
		// Error: cannot instantiate abstract class:
		// Rodent x = new Rodent();
		// But OK to create array to be downcast to derived objects:
		Rodent[] rodents = new Rodent[10];
		for(Rodent r : rodents) {
			r = gen.next();
			println(r + ": ");
			r.eat();
			r.run();
			r.sleep();			
		}		
	}
}