// holding/Rodent10.java
// TIJ4 Chapter Holding, Exercise 10, page 409
/* Change Exercise 9 in the Polymorphism chapter to use an ArrayList to
* hold the Rodents and an Iterator to move through the sequence of 
* Rodents.
*/
import java.util.*;
import static org.greggordon.tools.Print.*;

class RandomRodentGenerator {
	private Random rand = new Random();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse();
			case 1: return new Rat();
			case 2: return new Squirrel();			
		}
	}
}

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

public class Rodent10 {
	private static RandomRodentGenerator gen = 
		new RandomRodentGenerator();
	public static void main(String[] args) {
		List<Rodent> rodentList = new ArrayList<Rodent>();
		for(int i = 0; i < 10; i++)
			rodentList.add(gen.next());
		Iterator<Rodent> it = rodentList.iterator();
		while(it.hasNext()) {
			Rodent r = it.next();
			print(r + ": ");
			r.eat();
			r.run();
			r.sleep();
		}
	}
}



