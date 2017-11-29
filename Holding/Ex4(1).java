// holding/Ex4.java
// TIJ4 Chapter Holding, Exercise 4, page 401
/* Create a generator class that produces character names (as String objects)
* from your favorite movie (you can use Snow White or Star Wars as a
* fallback) each time you call next(), and loops around to the beginning of
* the character list when it runs out of names. Use this generator to fill
* an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a
* TreeSet, then print each container.
*/
import java.util.*;

class Generator {
	int key = 0;
	public String next() {
		switch(key) {
			default:
			case 0 : key++; return "Snow White";
			case 1 : key++; return "Bashful";
			case 2 : key++; return "Doc";
			case 3 : key++; return "Dopey";
			case 4 : key++; return "Grumpy";
			case 5 : key++; return "Happy";
			case 6 : key++; return "Sleepy";
			case 7 : key = 0; return "Sneezy";			
		}
	} 
	public void fillA(String[] a) {
		for(int i = 0; i < a.length; i++)
			a[i] = next();
	}
	public Collection fill(Collection<String> c, int n) {
		for(int i = 0; i < n; i++) c.add(next());
		return c;
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Generator gen = new Generator();		
		String[] a = new String[10];
		gen.fillA(a);
		for(String s : a) System.out.print(s + ", ");
		System.out.println();	
		System.out.println(gen.fill(new ArrayList<String>(), 10));
		System.out.println(gen.fill(new LinkedList<String>(), 10));
		System.out.println(gen.fill(new HashSet<String>(), 10));
		System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
		System.out.println(gen.fill(new TreeSet<String>(), 10));				
	}
}