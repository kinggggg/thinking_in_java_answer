// holding/Ex29.java
// TIJ4 Chapter Holding, Exercise 29, page 427
/* Fill a PriorityQueue (using offer()) with Double values created using 
* java.util.Random, then remove the elements using poll() and display them.
*/
import java.util.*;

class Simple extends Object {}

public class Ex29 {
	public static void main(String[] args) {		
		PriorityQueue<Simple> s = new PriorityQueue<Simple>();
		// OK to add one Simple:
		s.offer(new Simple());
		// but no more allowed; get runtime exception: 
		// Simple cannot be cast to Comparable:
		s.offer(new Simple());
	}
}


