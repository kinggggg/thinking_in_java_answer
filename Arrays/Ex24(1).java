// arrays/Ex24.java
// TIJ4 Chapter Arrays, Exercise 24, page 786
// Show that the class from Exercise 19 can be searched.
import java.util.*;
import net.mindview.util.*;

class A implements Comparable<A> {
	protected int x;
	A(int x) { this.x = x; }
	public int compareTo(A b) {
		return (this.x < b.x ? -1 : (this.x == b.x ? 0 : 1));
	}
	public boolean equals(Object b) {
		return (b.getClass().getSimpleName() == "A" 
			&& this.x == ((A)b).x) ? true : false;
	}
}

public class Ex24 {
	public static void main(String[] args) {
		A[] a = { new A(1), new A(2), new A(3), new A(4), new A(5) };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int index = Arrays.binarySearch(a, new A(3));
		System.out.println("Index: " + index + ", " + a[index]);
	}
}