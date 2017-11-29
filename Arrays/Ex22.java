// arrays/Ex22.java
// TIJ4 Chapter Arrays, Exercise 22, page 786
// Show that the results of performing a binarySearch() on an
// unsorted array are unpredictable.
import java.util.*;
import net.mindview.util.*;

public class Ex22 {
	private static Random r = new Random();
	public static void main(String[] args) {
		int[] ia = ConvertTo.primitive(Generated.array(new Integer[20],
			new RandomGenerator.Integer(10)));
		System.out.println(Arrays.toString(ia));
		for(int i = 0; i < 10; i++) {
			int index = Arrays.binarySearch(ia, i);
			if(index < 0) System.out.println(i + " not found");
			else
			System.out.println("Index: " + index + ", " + i);
		}
		System.out.println("sort");
		Arrays.sort(ia);
		System.out.println(Arrays.toString(ia));
		for(int i = 0; i < 10; i++) {
			int index = Arrays.binarySearch(ia, i);
			if(index < 0) System.out.println(i + " not found");
			else
			System.out.println("Index: " + index + ", " + i);
		}		
	}
}