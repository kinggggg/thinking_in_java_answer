// generics/Sets17.java
// TIJ4 Chapter Generics, Exercise 17, page 645
/* Study the JDK documentation for EnumSet. You'll see that there's a 
* clone() method defined. However, you cannot clone() from the reference
* to the Set interface passed in Sets.java. Can you modify Sets.java to
* handle both the general case of a Set interface as shown, and the 
* special case of an EnumSet, using clone() instead of creating a new
* HashSet?
*/
import java.util.*;
import static net.mindview.util.Print.*;
import generics.watercolors.*;
import static generics.watercolors.Watercolors.*;

public class Sets17 {	
	public static <T> Set<T> union(Set<T> a, Set<T> b) {		
		try {
			if(a instanceof EnumSet) {
				Set<T> result = ((EnumSet<T>)a).clone();
				result.addAll(b);
    				return result;
				}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
		Set<T> result = new HashSet<T>(a);
    		result.addAll(b);
    		return result;
	}	
  	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		try {
			if(a instanceof EnumSet) {
				Set<T> result = ((EnumSet<T>)a).clone();
				result.retainAll(b);
    				return result;
				}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
    		Set<T> result = new HashSet<T>(a);
    		result.retainAll(b);
    		return result;
  	}	
  	// Subtract subset from superset:
  	public static <T> Set<T>  difference(Set<T> superset, Set<T> subset) {
		try {
			if(superset instanceof EnumSet) {
				Set<T> result = ((EnumSet<T>)superset).clone();
				result.removeAll(subset);
    				return result;
				}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
    		Set<T> result = new HashSet<T>(superset);
    		result.removeAll(subset);
    		return result;
  	}
  	// Reflexive--everything not in the intersection:
  	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
    		return difference(union(a, b), intersection(a, b));
  	}
	public static void main(String[] args) {
		Set<Watercolors> set1 =
			EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
		Set<Watercolors> set2 =
			EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		print("set1: " + set1);
		print("set2: " + set2);
		print("union(set1, set2): " + union(set1, set2));
		Set<Watercolors> subset = intersection(set1, set2);
		print("intersection(set1, set2): " + subset);
		print("difference(set1, set2): " + 
			difference(set1, set2));
		print("difference(set2, subset): " + 
			difference(set2, subset));
		print("complement(set1, set2): " + 
			complement(set1, set2));
	}
} 
