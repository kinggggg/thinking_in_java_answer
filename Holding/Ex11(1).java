// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
* print the toString() of each object in the container. Fill all the different
* types of Collections with objects and apply your method to each container.
*/
import java.util.*;
import static org.greggordon.tools.Print.*;

public class Ex11 {
	public static void printAny(Collection c) {
		Iterator it = c.iterator();
		while(it.hasNext())
			print(it.next() + " ");
		println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = 
			new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		LinkedList<Character> ll =
			new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));	
		HashSet<Float> hs = 
			new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
		TreeSet<Double> ts =
			new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
		LinkedHashSet<Integer> lhs =
			new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
		printAny(al);
		printAny(ll);
		printAny(hs);
		printAny(ts);
		printAny(lhs);
	}
}
