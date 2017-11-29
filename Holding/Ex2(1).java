// holding/Ex2.java
// TIJ4 Chapter Holding, Exercise 2, page 396
// Modify SimpleCollection.java to use a Set for c.
import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for(Integer i : c)
			System.out.print(i + ", ");
	}	
}