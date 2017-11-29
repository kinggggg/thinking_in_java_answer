// interfaces/rodent/Rodent7.java
// TIJ4 Chapter Interfaces, Exercise 7, page 320
// Modify Exercise 9 in the Polymorphism chapter so that Rodent is an
// interface.
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

import static org.greggordon.tools.Print.*;

interface Rodent {
	String name = "Rodent";
	void eat(); 
	void run(); 
	void sleep();
	String toString(); 
}

class Mouse implements Rodent {
	private String name = "Mouse";
	public void eat() { println("Mouse.eat()"); }
	public void run() { println("Mouse.run()"); }
	public void sleep() { println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat implements Rodent {
	private String name = "Rat";
	public void eat() { println("Rat.eat()"); }
	public void run() { println("Rat.run()"); }
	public void sleep() { println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel implements Rodent {
	private String name = "Squirrel";
	public void eat() { println("Squirrel.eat()"); }
	public void run() { println("Squirrel.run()"); }
	public void sleep() { println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class Rodent7 {
	private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
	public static void main(String[] args) {
		// Error: cannot instantiate (abstract) interface:
		// Rodent x = new Rodent();
		// But OK to create array of implementing objects:
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