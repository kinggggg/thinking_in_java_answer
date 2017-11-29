// containers/Ex9.java
// TIJ4 Chapter Containers, Exercise 9, page 827
// Use RandomGenerator.String to fill a TreeSet, but use alphabetic 
// ordering. Print the TreeSet to verify the sort order.
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class Ex9 {
	public static void main(String[] args) {
		TreeSet<String> ts = 
		new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		RandomGenerator.String rgs = 
			new RandomGenerator.String(5);
		for(int i = 0; i < 20; i++) {
			ts.add(rgs.next());
		}
		print(ts);
	}
}