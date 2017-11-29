// exceptions/Frog17.java
// TIJ4 Chapter Exceptions, Exercise 17, page 477
/* Modify pholymorphism/Frog.java so that it uses try-finally to 
* guarantee proper cleanup, and show that this works even if you
* return from the middle of the try-finally.
*/

package exceptions;
import static net.mindview.util.Print.*;

class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		print("Creating Characteristic " + s);
	}
	protected void dispose() {
		print("disposing Characteristic " + s);
	}
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}
	protected void dispose() {
		print("disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	LivingCreature() {
		print("LivingCreature()");
	}		
	protected void dispose() {
		print("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	Animal() { print("Animal()"); }
	protected void dispose() {
		print("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	Amphibian() { print("Amphibian()"); }
	protected void dispose() {
		print("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog17 extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	public Frog17() { print("Frog17()"); }
	public static void jump() { print("frog jumps"); }
	protected void dispose() {
		print("Frog17 dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		Frog17 frog = new Frog17();
		try {
			frog.jump();
			print("Returning from try-finally");
			return;			
		} finally {
			print("Bye!");
			frog.dispose();
		}
	}
}
