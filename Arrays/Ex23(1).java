// arrays/Ex23.java
// TIJ4 Chapter Arrays, Exercise 23, page 786
// Create an array of Integer fill it with random int values (using
// autoboxing), and sort it into reverse order using a Comparator.
import java.util.*;
import net.mindview.util.*;

public class Ex23 {
	private static Random r = new Random();
	public static void main(String[] args) {
		Integer[] ia = Generated.array(new Integer[20],
			new RandomGenerator.Integer(10));
		System.out.println(Arrays.toString(ia));
		System.out.println("sort");
		Arrays.sort(ia, Collections.reverseOrder());
		System.out.println(Arrays.toString(ia));
	}
}