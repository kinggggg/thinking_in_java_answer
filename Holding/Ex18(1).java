// holding/Ex18.java
// TIJ4 Chapter Holding, Exercise 18, page 422
/* Fill a HashMap with key-value pairs. Print the results to show ordering
* by hash code. Extract the pairs, sort by key, and place the result into a 
* LinkedHashMap. Show that the insertion order is maintained. 
*/
import java.util.*;

class Gerbil {
	private int gerbilNumber;
	public Gerbil(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("gerbil " + gerbilNumber + " hops");
	}
}

public class Ex18 {
	public static void main(String[] args) {
		Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
		gerbils.put("Fuzzy", new Gerbil(0));
		gerbils.put("Spot", new Gerbil(1));
		gerbils.put("Speedy", new Gerbil(2));
		gerbils.put("Dopey", new Gerbil(3));
		gerbils.put("Sleepy", new Gerbil(4));
		gerbils.put("Happy", new Gerbil(5));
		gerbils.put("Funny", new Gerbil(6));
		gerbils.put("Silly", new Gerbil(7));
		gerbils.put("Goofy", new Gerbil(8));
		gerbils.put("Wowee", new Gerbil(9));
		System.out.println(gerbils);
		System.out.println();
		Set<String> sortedKeys = 
			new TreeSet<String>(gerbils.keySet());
		System.out.println(sortedKeys);
		System.out.println();
		Map<String, Gerbil> sortedGerbils = 
			new LinkedHashMap<String, Gerbil>();
		for(String s : sortedKeys) {
			System.out.print("Adding " + s + ", ");
			sortedGerbils.put(s, gerbils.get(s));			
		}
		System.out.println();
		System.out.println();
		System.out.println(sortedGerbils);
		System.out.println();
		// or, just:
		Map<String, Gerbil> sortedGerbils2 =
			new TreeMap<String, Gerbil>(gerbils);
		System.out.println(sortedGerbils2);		
	}
}

