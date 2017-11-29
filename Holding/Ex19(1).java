// holding/Ex19.java
// TIJ4 Chapter Holding, Exercise 19, page 422
// Repeat the previous exercise with a HashSet and a LinkedHashSet.
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

public class Ex19 {
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
		Set<String> hashedKeys = 
			new HashSet<String>(gerbils.keySet());
		System.out.println("HashSet: " + hashedKeys);
		System.out.println();
		Map<String, Gerbil> hashedGerbils = 
			new LinkedHashMap<String, Gerbil>();
		for(String s : hashedKeys) {
			System.out.print("Adding " + s + ", ");			
			hashedGerbils.put(s, gerbils.get(s));
		}
		System.out.println();
		System.out.println();
		System.out.println("From HashSet: " + hashedGerbils);
		
		System.out.println();
		Set<String> linkedHashedKeys = 
			new LinkedHashSet<String>(gerbils.keySet());
		System.out.println("LinkedHashSet: " + linkedHashedKeys);
		System.out.println();
		Map<String, Gerbil> linkedHashedGerbils = 
			new LinkedHashMap<String, Gerbil>();
		for(String s : linkedHashedKeys) {
			System.out.print("Adding " + s + ", ");			
			linkedHashedGerbils.put(s, gerbils.get(s));
		}
		System.out.println();
		System.out.println();
		System.out.println("From LinkedHashSet: " 
			+ linkedHashedGerbils);
		}
}

