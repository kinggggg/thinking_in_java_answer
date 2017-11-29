// typeinfo/Ex12.java
// TIJ4 Chapter Typeinfo, Exercise 12, page 582
// Use TypeCounter with the CoffeeGenerator.java class in the Generics chapter.
import generics.coffee.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class Ex12 {
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Coffee.class);
		for(Coffee coffee : new CoffeeGenerator(20)) {
			printnb(coffee.getClass().getSimpleName() + " ");
			counter.count(coffee);
		}
		print();
		print(counter);
	}
}