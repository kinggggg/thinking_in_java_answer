// typeinfo/toys/ToyTest19.java
// TIJ4 Chapter Typeinfo, Exercise 19, page 593
// In ToyTest.java, use reflection to create a Toy object using
// the non-default constructor.
package typeinfo.toys;
import static net.mindview.util.Print.*;
import java.lang.reflect.*;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
	Toy() {
		print("Creating Toy() object");	
	}
	Toy(int i) {
		print("Creating Toy(" + i + ") object");
	}
}

class FancyToy extends Toy 
	implements HasBatteries, Waterproof, Shoots {
		FancyToy() { super(1); }
}

public class ToyTest19 {
	public static void main(String[] args) {
		// get appropriate constructor and create new instance:
		try {
			Toy.class.getDeclaredConstructor(int.class).newInstance(1);
		// catch four exceptions:
		} catch(NoSuchMethodException e) {
			print("No such method: " + e);
		} catch(InstantiationException e) {
			print("Unable make Toy: " + e);
		} catch(IllegalAccessException e) {
			print("Unable access: " + e);
		} catch(InvocationTargetException e) {
			print("Target invocation problem: " + e);
		}
	}
}