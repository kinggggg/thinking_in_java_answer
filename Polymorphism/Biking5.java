// polymorphism/biking/Biking5.java
// TIJ4 Chapter Polymorphism, Exercise 5, page 286
/* Starting from Exercise 1, add a wheels() method in Cycle, which returns the
* number of wheels. MOdify ride() to call wheels() and verify that polymorphism
* works.
*/
package polymorphism.biking;
import static org.greggordon.tools.Print.*;

class Cycle {
	private String name = "Cycle";
	private int wheels = 0;
	public static void travel(Cycle c) {
		println("Cycle.ride() " + c);
	}
	public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	private int wheels = 1;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	private int wheels = 2;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	

}

class Tricycle extends Cycle {
	private String name = "Tricycle";
	private int wheels = 3;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

public class Biking5 {
	public static void ride(Cycle c) {
		c.travel(c);
		println("wheels: " + c.wheels());
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u); // upcast to Cycle
		ride(b);
		ride(t);		
	}
}

