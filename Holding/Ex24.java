// holding/Ex24.java
// TIJ4 Chapter Holding, Exercise 24, page 423
/* Fill a LinkedHashMap with String keys and objects of your choice.
* Now extract the pairs, sort them based on the keys, and reinsert
* them into the Map.
*/
// see also solution - holding/Ex24b.java
import java.util.*;
import static org.greggordon.tools.Print.*;

public class Ex24{	
	public static void main(String[] args) {
		Map<String,Integer> m = 
			new LinkedHashMap<String,Integer>();
		m.put("ten", 10);
		m.put("nine", 9);
		m.put("eight", 8);
		m.put("seven", 7);
		m.put("six", 6);
		m.put("five", 5);
		m.put("four", 4);
		m.put("three", 3);
		m.put("two", 2);
		m.put("one", 1);
		m.put("zero", 0);
		println("Map to sort: " + m);
		// temporary map to hold entrys:
		Map<String,Integer> mTemp = 
			new LinkedHashMap<String,Integer>();
		// use TreeSet to sort the keySet():
		Set<String> ss = new TreeSet<String>(m.keySet());
		// mover sorted keys to temp map:
		Iterator<String> itss = ss.iterator();
		while(itss.hasNext()) {
			String s = (String)itss.next();
			Integer i = m.get(s);
			m.remove(s);
			mTemp.put(s, i);
		}
		// get sorted list of temp keys:
		Set<String> ssTemp = 
			new TreeSet<String>(mTemp.keySet());
		// move sorted entrys back to map:
		Iterator<String> itssTemp = ssTemp.iterator();
		while(itssTemp.hasNext()) {
			String s = (String)itssTemp.next();
			Integer i = mTemp.get(s);
			mTemp.remove(s);
			m.put(s, i);
		}
		// done with temp:
		mTemp.clear();
		println("Sorted map: " + m);
	}
}	

