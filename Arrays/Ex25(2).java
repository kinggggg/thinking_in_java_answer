// arrays/Ex25.java
// TIJ4 Chapter Arrays, Exercise 25, page 789
// Rewrite PythonLists.py in Java.
import java.util.*;
import static net.mindview.util.Print.*;

class MyList extends ArrayList<T> {
	List myList = new ArrayList();
	MyList(List l) { myList = l; }
	@SuppressWarnings("unchecked")
	MyList getReversed() {
		ListIterator lit = myList.listIterator(myList.size());
		List reverseMyList = new ArrayList();
		while(lit.hasPrevious()) {
			reverseMyList.add(lit.previous());
		}
		return new MyList(reverseMyList);
	}
}

public class Ex25 {
	public static void main(String[] args) {
		List<Integer> aList = 
			new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		print(aList);
		print(aList.get(4));
		aList.add(new Integer(6));
		aList.addAll(new ArrayList<Integer>(Arrays.asList(7,8)));
		print(aList);
		print(aList.subList(2,4));
		MyList ml = new MyList(aList);
		print((ml.getReversed()).myList);
	}
}