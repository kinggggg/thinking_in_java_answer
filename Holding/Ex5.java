// holding/Ex5.java
// TIJ4 Chapter Holding, Exercise 5, page 406
/* Modify ListFeatures.java so that it uses Integers (remember 
* autoboxing!) instead of Pets, and explain any difference in
* results.
*/
import java.util.*;
import static net.mindview.util.Print.*;

public class Ex5 {
	// method to make a List<Integer> with random values < n:
	public static List<Integer> listOfRandInteger(int length, int n) {
		Random rand = new Random();
		List<Integer> li = new ArrayList<Integer>(); 
		for(int i = 0; i < length; i++)
			li.add(rand.nextInt(n)); 		
		return li;	
	}
	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> li = listOfRandInteger(7, 10);
		print("1: " + li);
		Integer h = new Integer(rand.nextInt(10));
		li.add(h);
		print("2: " + li);
		print("3: " + li.contains(h));
		// removes the first instance equivalent to Integer h:
		li.remove(h);
		print("3.5: " + li);
		Integer p = li.get(2);
		print("4: " + p + " " +  li.indexOf(p));
		Integer cy = new Integer(rand.nextInt(10));
		print("5: " + cy +" " + li.indexOf(cy));
		print("6: " + li.remove(cy));
		print("7: " + li.remove(p));
		print("8: " + li);
		li.add(3, new Integer(rand.nextInt(10)));
		print("9: " + li);
		List<Integer> sub = li.subList(1, 4);
		print("sublist: " + sub);
		print("10: " + li.containsAll(sub));
		// will also sort sub elements within li:
		Collections.sort(sub);
		print("sorted sublist: " + sub);
		print("11: " + li.containsAll(sub));
		print("11.25: " + li);
		// will also shuffle sub elements within li:
		Collections.shuffle(sub, rand);
		print("11.5: " + li);
		print("shuffled sublist: " + sub);
		print("12: " + li.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(li);
		print("12.5: " + li);
		sub = Arrays.asList(li.get(1), li.get(4));
		print("sub: " + sub);	
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<Integer>(li);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub); 
		print("15: " + copy);
		if(copy.size() > 1) // to avoid out of bounds exception
			copy.set(1, 8); // autoboxing int -> Integer
		print("16: " + copy);
		if(copy.size() > 2)
			copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + li.isEmpty());
		li.clear();
		print("19: " + li);
		print("20: " + li.isEmpty());
		li.addAll(listOfRandInteger(4, 10));
		print("21: " + li);
		Object[] o = li.toArray();
		print("22: " + o[3]);
		Integer[] ia = li.toArray(new Integer[0]);
		print("23: " + ia[3]);
	}
}