// typeinfo/RegisteredCoffeeFactories16.java
// TIJ4 Chapter Typeinfo, Exercise 16, page 586
// Modify the Coffee hierarchy in the Generics chapter to use Registered Factories.
import typeinfo.factory.*;
import java.util.*;

class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
	static List<Factory<? extends Coffee>> coffeeFactories =
		new ArrayList<Factory<? extends Coffee>>();
	static {
		coffeeFactories.add(new Latte.Factory());
		coffeeFactories.add(new Mocha.Factory());
		coffeeFactories.add(new Cappuccino.Factory());
		coffeeFactories.add(new Americano.Factory());
		coffeeFactories.add(new Breve.Factory());
	}
	private static Random rand = new Random();
	public static Coffee createRandom() {
		int n = rand.nextInt(coffeeFactories.size());
		return coffeeFactories.get(n).create();
	}
}

class Latte extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Latte> {
		public Latte create() { return new Latte(); }
	}
}

class Mocha extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Mocha> {
		public Mocha create() { return new Mocha(); }
	}
}

class Cappuccino extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Cappuccino> {
		public Cappuccino create() { return new Cappuccino(); }
	}
}

class Americano extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Americano> {
		public Americano create() { return new Americano(); }
	}
}

class Breve extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Breve> {
		public Breve create() { return new Breve(); }
	}
}

public class RegisteredCoffeeFactories16 {
	public static void main(String[] args) {
		for(int i = 0; i < 15; i++)
			System.out.println(Coffee.createRandom());
	}
}