// generics/Functional42.java
// TIJ4 Chapter Generics, Exercise 42, page 743
/*
* Create two separate classes, with nothing in common. Each class should 
* hold a value, and at least have methods that produce that value and 
* perform a modification upon that value. Modify Functional.java so that
* it performs functional operations on collections of your classes (these
* operations do not have to be arithmetic as they are in Functional.java).
*/
import java.util.*;
import static net.mindview.util.Print.*;

// Different types of function objects:
interface Combiner<T> { T combine(T x, T y); }
interface UnaryFunction<R,T> { R function(T x); }
interface Collector<T> extends UnaryFunction<T,T> {
	T result(); // Extract result of collecting parameter
}

class Food {
	private String foodName = "";
	public Food() { foodName = ""; } 
	public Food(String name) { foodName = name; }
	public void set(String name) { foodName = name; }
	public String get() { return foodName; }
	public void eat() { foodName = ""; }
	public String toString() { return "Food: " + foodName; }
}

class Drink {
	private String drinkName = "";
	public Drink() { drinkName= ""; }
	public Drink(String name) { drinkName = name; }
	public void set(String name) { drinkName = name; }
	public String get() { return drinkName; }
	public void eat() { drinkName = ""; }
	public String toString() { return "Drink: " + drinkName; }	
}

public class Functional42 {
	// Calls the Combiner object on each element to combine
	// it with a running result, whch is finally returned:
	public static <T> T
	reduce(Iterable<T> seq, Combiner<T> combiner) {
		Iterator<T> it = seq.iterator();
		if(it.hasNext()) {
			T result = it.next();
			while(it.hasNext())
				result = combiner.combine(result, it.next());
			return result;
		}
		// If seq is the empty list:
		return null; // Or throw exception
	} 
	// Take a function object and call it on each object in
	// the list, ignoring the return value. The function 
	// object may act as a collecting parameter, so it is 
	// returned at the end.
	public static <T> Collector<T>
	forEach(Iterable<T> seq, Collector<T> func) {
		for(T t : seq) func.function(t);
		return func;
	}	
	static class MealMaker implements Combiner<Food> {
		public Food combine(Food f1, Food f2) {
			return new Food(f1.get() + " " + f2.get());
		}
	}
	static class DrinkMaker implements Combiner<Drink> {
		public Drink combine(Drink d1, Drink d2) {
			return new Drink(d1.get() + " " + d2.get());
		}
	}
	static class CookedMeal
	implements Collector<Food> {
		private Food f = new Food("");
		public Food function(Food x) {
			f = new Food(f.get() + " " + x.get());
			return f;
		}
		public Food result() { return new Food("cooked " + f.get()); }
	}	
	public static void main(String[] args) {
		List<Food> lf = Arrays.asList(new Food("bread"),
			new Food("ham"), new Food("cheese"));
		Food meal = reduce(lf, new MealMaker());
		print(meal);
		List<Drink> ld = Arrays.asList(new Drink("water"),
			new Drink("orange juice"), new Drink("lemon"));
		Drink drink = reduce(ld, new DrinkMaker());
		print(drink);
		print(forEach(lf, new CookedMeal()).result());

		
	}
}

