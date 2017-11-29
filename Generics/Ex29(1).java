// generics/Ex29.java
// TIJ4 Chapter Generics, Exercise 29, page 694
/* Create a generic method that takes as an argument a Holder<List<?>>. 
* Determine what methods you can and can't call for the Holder and for
* the List. Repeat for an argument of List<Holder<?>>.
*/
import java.util.*;
import static org.greggordon.tools.Print.*;

public class Ex29 {
	static void f1(Holder<List<?>> holder) {
		println("Calling methods for the Holder: ");
		println("holder: " + holder);
		println("holder.get(): " + holder.get());
		println("Calling holder.set(Arrays.asList(1,2,3)");
		holder.set(Arrays.asList(1,2,3));
		println("holder.get(): " + holder.get());
		int[] ia = {1,2,3};
		println("int[] ia = {1,2,3}");
		println("holder.equals(ia): " + holder.equals(ia));
		List iaList = Arrays.asList(ia);
		println("List iaList = Arrays.asList(ia)");
		println("holder.equals(iaList): " + holder.equals(iaList));
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 1; i < 4; i++) l.add(i);
		println("l = List<Integer>() and add 1,2,3");
		println("holder.equals(l): " + holder.equals(l));
		println();
					
		println("Calling methods for the List: ");
		println("holder.get(): " + holder.get());
		println("holder.get().getClass(): " + holder.get().getClass());
		// Incompatible types:
		// List<? extends Integer> list = holder.get();
		// OK, but can't add anything:
		List<?> list = holder.get();
		println("list: " + list); 
		// list.add(new Object());		
		List list1 = holder.get(); // OK, but:
		// list1.add(new Object()); // Warning: unchecked call to add(E) and
		// UnsupportedOperationException at runtime
		println("list1.getClass(): " + list1.getClass());
		println("list.equals(list1): " + list.equals(list1));
		// list.clear(); // runtime UnsupportedOperationException
 		println("list.contains(1): " + list.contains(1));		
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 1; i < 4; i++) c.add(i);
		println("list.containsAll(c): " + list.containsAll(c));	
		println("list.equals(c): " + list.equals(c));
		println("list = " + list);
		println("c = " + c);
		println("c.getClass(): " + c.getClass()); // c is not a List
		println("list.get(0) = " + list.get(0));
		println("list.hashCode() = " + list.hashCode());
		println("list.indexOf(2) = " + list.indexOf(2));	
		ListIterator li = list.listIterator();
		println("After ListIterator li = list.listIterator():");
		println("li.next() = " + li.next());
		// runtime errors: UnsupportedOperationException:
		// list.remove(0);
		// list.removeAll(c);
		// list.retainAll(c1);
		// list.set(1,4); // compile error: set(int, ?) in list<?> cannot
		// be applied to (int,int)
		println("list.size() = " + list.size());
		println("list.subList(1,2) = " + list.subList(1,2));
		Object[] oa = list.toArray();
		println("After Object[] oa = list.toArray():");
		print("oa = ");
		for(Object o : oa) print(o + " ");
		println(); 
		// Error: runtime error ArrayStoreException:
		// Double[] da = list.toArray(new Double[3]);
		Number[] na = list.toArray(new Number[3]);
		println("After Number[] na = list.toArray(new Number[3]):");
		print("na = ");
		for(Number n : na) print(n + " ");
		println();
	}
	static void f2(List<Holder<?>> list) {
		println("Calling methods for the List: ");
		println("list = " + list);
		println("Adding Integer, String, Double");
		list.add(new Holder<Integer>(1));
		list.add(new Holder<String>("two"));
		list.add(new Holder<Double>(3.0));
		println("list = " + list);
		println("Elements of list: ");
		for(Holder h : list) 
			println("h.get() = " + h.get());
		println("Adding Float");
		list.add(3, new Holder<Float>(4.0f));
		println("list = " + list);
		println("Elements of list: ");
		for(Holder h : list) 
			println("h.get() = " + h.get());
		println("list.clear()");
		list.clear();
		println("list = " + list);
		Collection<Holder<?>> c = 
			new ArrayList<Holder<?>>();
		c.add(new Holder<String>("one"));
		c.add(new Holder<Float>(2.0f));
		c.add(new Holder<Double>(3.0));
		list.addAll(c);
		println("Adding String, Float, Double");
		println("list = " + list);
		println("Elements of list: ");
		for(Holder h : list) 
			println("h.get() = " + h.get().getClass().getSimpleName() 
				+ " " + h.get());
		list.add(3, new Holder<String>("four"));
		println("Elements of list: ");
		for(Holder h : list) 
			println("h.get() = " + h.get().getClass().getSimpleName() 
				+ " " + h.get());
		Object listClone = ((ArrayList)list).clone();
		println("((ArrayList)list).clone() = " +  listClone);
		println("((ArrayList)list).clone().getClass() = " +
			((ArrayList)list).clone().getClass());
		// Appears to be an ArrayList, but cannot assign:
		// ArrayList alistClone = ((ArrayList)list).clone(); // found Object
		println("Replacing element with h4, new Holder<Integer>(4)");
		Holder<Integer> h4 = new Holder<Integer>(4);
		list.set(3, h4);
		println("Elements of list Holders: ");
		for(Holder h : list) 
			println(h.get().getClass().getSimpleName() 
				+ " " + h.get());
		println("list.contains(list.set(3, h4): " + 
				list.contains(list.set(3, h4)));
		println("list.contains(4): " + list.contains(4));
		println("list.contains(h4): " + list.contains(h4));
		println("Adding null member to list");		
		list.add(null);
		println("list.contains(null): " + list.contains(null));
		println("list.get(0).get(): " + list.get(0).get());
		println("list.indexOf(h4) = " + list.indexOf(h4));
		println("list.indexOf(null) = " + list.indexOf(null));
		println("list.isEmpty(): " + list.isEmpty());
		println("list.lastIndexOf(null) = " + list.lastIndexOf(null));	
		println("Removing index 0");
		list.remove(0);
		println("Elements of list Holders: ");
		for(Holder h : list) {
			if(h == null) println("null");
			else
			println(h.get().getClass().getSimpleName() 
				+ " " + h.get());	
			}
		println("Removing null");
		println("Elements of list Holders: ");
		for(Holder h : list) {
			if(h == null) println("null");
			else
			println(h.get().getClass().getSimpleName() 
				+ " " + h.get());	
			}
		// Error: removeRange has protected access:
		// ((ArrayList)list).removeRange(0,2);
		println("list.size() = " + list.size());
		Object[] oa = list.toArray();
		print("list.toArray() = ");
		for(int i = 0; i < oa.length; i++) 
			print(oa[i] + " ");
		println();
		Holder[] ha = ((ArrayList<Holder<?>>)list).toArray(new Holder[4]);
		println("(ArrayList<Holder<?>>list).toArray(new Holder[4]) = ");
		for(int i = 0; i < ha.length; i++)
			print(ha[i] + " ");
		println();
		println("Holder[4] Holders are holding: ");
		for(Holder h : ha) {
			if(h == null) println("null");
			else println(h.get());
		}
		println();		
	
		println("Calling methods for the Holder: ");
		println("list = " + list);
		print("Three Holders (one null) in list:");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == null) println("null"); 
			else
			println(list.get(i).getClass().getSimpleName());
		}
		list.remove(3);
		println("Holders are holding:");
		for(Holder h : list) println(h.get());
		Holder<?> h1 = list.get(0);
		Holder<?> h2 = list.get(1);
		Holder<?> h3 = list.get(2);
		println(list.get(0).getClass() + ": " 
			+ list.get(0).get().getClass().getSimpleName() + ", " 
			+ list.get(0).get());
		println(list.get(1).getClass() + ": " 
			+ list.get(1).get().getClass().getSimpleName() + ", " 
			+ list.get(1).get());
		println(list.get(2).getClass() + ": " 
			+ list.get(2).get().getClass().getSimpleName() + ", "
			+ list.get(2).get());
		// Error: cannot set <?> to int or Object:
		// h3.set(5);
		// h2.set(new Object());
		
	}	
	public static void main(String[] args) {
		println("new Holder<List<?>> holder");
		f1(new Holder<List<?>>());
		println();
		println("List<Holder<?>> list = new ArrayList<Holder<?>>();");
		List<Holder<?>> list = new ArrayList<Holder<?>>();
		f2(list);
	}
}