// polymorphism/rodent/Rodent12.java
// TIJ4 Chapter Polymorphism, Exercise 12, page 298
/* Modify exercise 9 so that it demonstrates the order of initialization of the 
* base classes and derived classes. Now add member objects to both the base and
* derived classes, and show the order in which their initialization occurs during
* construction.
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

class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		println("Creating Characteristic " + s);
	}	
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		println("Creating Description " + s);
	}
}

class Rodent {
	private String name = "Rodent";
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");
	Rodent() { println("Rodent()"); }
	protected void eat() { println("Rodent.eat()"); }
	protected void run() { println("Rodent.run()"); }
	protected void sleep() { println("Rodent.sleep()"); }
	public String toString() { return name; }
}

class Mouse extends Rodent {
	private String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");
	Mouse() { println("Mouse()"); }
	protected void eat() { println("Mouse.eat()"); }
	protected void run() { println("Mouse.run()"); }
	protected void sleep() { println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat extends Rodent {
	private String name = "Rat";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");
	Rat() { println("Rat()"); }
	protected void eat() { println("Rat.eat()"); }
	protected void run() { println("Rat.run()"); }
	protected void sleep() { println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel extends Rodent {
	private String name = "Squirrel";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");
	Squirrel() { println("Squirrel()"); }
	protected void eat() { println("Squirrel.eat()"); }
	protected void run() { println("Squirrel.run()"); }
	protected void sleep() { println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class Rodent12 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();
	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[10];
		for(Rodent r : rodents) {
			r = gen.next();
			println(r);
		}		
	}
}