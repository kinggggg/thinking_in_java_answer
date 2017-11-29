// polymorphism/rodent/Rodent9.java
// TIJ4 Chapter Polymorphism, Exercise 9, page 289
/* Create an inheritance hierarchy of Rodent:Mouse, Gerbil, Hamster, etc. In the
* base class, provide methods that are common to all Rodents, and override these
* in the derived classes to perform different behaviors depending on the
* specific type of Rodent. Create an array of Rodent, fill it with different
* specific types of Rodents, and call your base-class methods to see what 
* happens.
*/
/* Solution includes, in same package: 
* import java.util.*;
* public class RandomRodentGenerator {
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

package polymorphism.rodent;
import static org.greggordon.tools.Print.*;

class Rodent {
	private String name = "Rodent";
	protected void eat() { println("Rodent.eat()"); }
	protected void run() { println("Rodent.run()"); }
	protected void sleep() { println("Rodent.sleep()"); }
	public String toString() { return name; }
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

public class Rodent9 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();
	public static void main(String[] args) {
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