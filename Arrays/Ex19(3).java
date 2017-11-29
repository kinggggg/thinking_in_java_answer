// arrays/Ex19.java
// TIJ4 Chapter Arrays, Exercise 19, page 778
/* Create a class with an int field that's initialized from a constructor
* argument. Create two arrays of these objects, using identical
* intitialization values for each array, and show that Arrays.equals() says
* that they are unequal. Add an equals() method to your class to fix the
* problem.
*/
import java.util.*;
import static net.mindview.util.Print.*;

class A {
	protected int x;
	A(int x) { this.x = x; }
	public boolean equals(Object b) {
		return (b.getClass().getSimpleName() == "A" 
			&& this.x == ((A)b).x) ? true : false;
	}
}

public class Ex19 {
	public static void main(String[] args) {
		A[] a1 = { new A(1), new A(2), new A(3) };
		A[] a2 = { new A(1), new A(2), new A(3) };
		print(Arrays.toString(a1));
		print(Arrays.toString(a2));
		print(Arrays.equals(a1, a2));
	}
}