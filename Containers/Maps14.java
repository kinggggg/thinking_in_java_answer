// containers/Maps14.java
// TIJ4 Chapter Containers, Exercise 14, page 835
// Show that java.util.Properties works in the above program (Maps.java).
import net.mindview.util.*;	
import static net.mindview.util.Print.*;
import java.util.*;
import java.util.concurrent.*;

public class Maps14 {
	public static void printKeys(Map<Integer,String> map) {
		printnb("Size = " + map.size() + ", ");
		printnb("Keys: ");
		print(map.keySet()); // Produce a set of the keys
	}
	// more general version, taking Map<Object,Object> arg:
	public static void printKeys2(Map<Object,Object> map) {
		printnb("Size = " + map.size() + ", ");
		printnb("Keys: ");
		print(map.keySet()); // Produce a set of the keys
	}
	public static void test(Map<Integer,String> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		// Map has 'Set' behavior for keys:
		map.putAll(new CountingMapData(25));
		printKeys(map);
		// Producing a collection of the values:
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.containsKey(11): " + map.containsKey(11));
		print("map.get(11): " + map.get(11));
		print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("First key in map: " + key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty(): " + map.isEmpty());
		map.putAll(new CountingMapData(25));
		// Operations on the Set change the Map:
		map.keySet().removeAll(map.keySet());
		print("map.isEmpty(): " + map.isEmpty());
	}
	// more general version, taking Map<Object,Object> arg:
	public static void test2(Map<Object,Object> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		// Map has 'Set' behavior for keys:
		map.putAll(new CountingMapData(25));
		printKeys2(map);
		// Producing a collection of the values:
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.containsKey(11): " + map.containsKey(11));
		print("map.get(11): " + map.get(11));
		print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
		Object key = map.keySet().iterator().next();
		print("First key in map: " + key);
		map.remove(key);
		printKeys2(map);
		map.clear();
		print("map.isEmpty(): " + map.isEmpty());
		map.putAll(new CountingMapData(25));
		// Operations on the Set change the Map:
		map.keySet().removeAll(map.keySet());
		print("map.isEmpty(): " + map.isEmpty());
	}
	public static void main(String[] args) {
		// Method test(Map<Integer,String>() cannot be applied:
		// test(new java.util.Properties()); 
		// test(new Properties());
		// test(new HashMap<Object,Object>());
		// test(new HashMap<String,String>());
		// Incompatible:
		// Map<Integer,String> misp = new Properties(); 
		// Map<String,String> mssp = new Properties();
		// OK:
		Map<Object,Object> moop = new Properties();
		// but test(Map<Integer,String>() cannot be applied: 
		// test(moop); 
		// Using more general version, taking Map<Object,Object> arg:
		test2(new Properties()); // OK			
	}
}