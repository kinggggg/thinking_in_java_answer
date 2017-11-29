// generics/Ocean18.java
// TIJ4 Chapter Generics, Exercise 18, page 647
// Following the form of BankTeller.java, create an example where
// BigFish eat LittleFish in the ocean.
import net.mindview.util.*;
import java.util.*;

class BigFish {
	private static long counter = 0;
	private final long id = ++counter;
	private BigFish() {}
	public String toString() {
		return "BigFish" + id;
	}
	public static Generator<BigFish> generator() {
		return new Generator<BigFish>() {
			public BigFish next() {
				return new BigFish();
			}	
		};
	}
}

class LittleFish {
	private static long counter = 0;
	private final long id = ++counter;
	private LittleFish() {}
	public String toString() {
		return "LittleFish" + id;
	}
	public static Generator<LittleFish> generator =
		new Generator<LittleFish>() {
			public LittleFish next() {
				return new LittleFish();
			}
		};
}

public class Ocean18 {
	public static void eat(BigFish bf, LittleFish lf) {
		System.out.println(bf + " eats " + lf);
	}
	public static void main(String[] args) {
		Random rand = new Random();
		List<BigFish> hunters = new ArrayList<BigFish>();
		Generators.fill(hunters, BigFish.generator(), 3);
		Queue<LittleFish> school = new LinkedList<LittleFish>();
		Generators.fill(school, LittleFish.generator, 15);
		for(LittleFish f : school)
			eat(hunters.get(rand.nextInt(hunters.size())), f);
	}
}