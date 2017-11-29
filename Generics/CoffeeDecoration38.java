// generics/CoffeeDecoration38.java
// TIJ4 Chapter Generics, Exercise 38, page 719
// Create a simple Decorator system by starting with basic coffee, then
// providing decorators of steamed milk, foam, chocolate, caramel and 
// whipped cream.
import generics.coffee.*;
import java.util.*;

class BasicCoffee {
	private static long counter = 0;
  	private final long id = counter++;
	private String value;
	public void set(String val) { value = val; }
	public String get() { return value; }
  	public String toString() {
    		return getClass().getSimpleName() + " " + id;
  	}
}

class Decorator extends BasicCoffee {
	protected BasicCoffee basicCoffee;
	public Decorator(BasicCoffee basicCoffee) { 
		this.basicCoffee = basicCoffee; 
	}
	public void set(String val) { basicCoffee.set(val); }
	public String get() { return basicCoffee.get(); }
}

class SteamedMilk extends Decorator {
	private final String steamedMilk = "steamedMilk";
	public SteamedMilk(BasicCoffee basicCoffee) {
		super(basicCoffee);
	}
	public String getSteamedMilk() { return steamedMilk; }
}

class Foam extends Decorator {
	private final String foam = "foam";
	public Foam(BasicCoffee basicCoffee) {
		super(basicCoffee);
	}
	public String getFoam() { return foam; }
}

class Chocolate extends Decorator {
	private final String chocolate = "chocolate";
	public Chocolate(BasicCoffee basicCoffee) {
		super(basicCoffee);
	}
	public String getChocolate() { return chocolate; }
}

class Caramel extends Decorator {
	private final String caramel = "caramel";
	public Caramel(BasicCoffee basicCoffee) {
		super(basicCoffee);
	}
	public String getCaramel() { return caramel; }
}

class WhippedCream extends Decorator {
	private final String whippedCream = "whippedCream";
	public WhippedCream(BasicCoffee basicCoffee) {
		super(basicCoffee);
	}
	public String getWhippedCream() { return whippedCream; }
}

public class CoffeeDecoration38 {
	public static void main(String[] args) {
		SteamedMilk sm = new SteamedMilk(new BasicCoffee());
		SteamedMilk sm2 = new SteamedMilk(
			new Foam(new BasicCoffee()));
		Chocolate c = new Chocolate(new BasicCoffee());
		WhippedCream wc = new WhippedCream(new Caramel(
			new Chocolate(new Foam(new SteamedMilk(
			new BasicCoffee())))));
	}
}