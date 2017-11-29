// arrays/Ex5.java
// TIJ4 Chapter Arrays, Exercise 5, page 759
// Demonstrate that multidimensional arrays of non-primitives are
// automatically initialized to null.
import java.util.*;

class A {}

public class Ex5 {
	public static void main(String[] args) {
		A[][][] a3 = new A[3][3][3];
		System.out.println(Arrays.deepToString(a3));		
	}
}