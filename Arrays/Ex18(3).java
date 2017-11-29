// arrays/Ex18.java
// TIJ4 Chapter Arrays, Exercise 18, page 775
// Create and fill and array of BerylliumSphere. Copy this array
// to a new array and show that it's a shallow copy.
import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
		BerylliumSphere[] bsa1 = new BerylliumSphere[3];
		for(int i = 0; i < bsa1.length; i++)
			bsa1[i] = new BerylliumSphere();
		// Arrays.fill(bsa1, new BerylliumSphere());
		System.out.println(Arrays.toString(bsa1));
		BerylliumSphere[] bsa2 = new BerylliumSphere[4];
		System.out.println(Arrays.toString(bsa2));
		System.arraycopy(bsa1, 0, bsa2, 0, bsa1.length);
		System.out.println(Arrays.toString(bsa2));
		// no new BerylliumSpheres created in bsa2,
		// just new references to those in bsa1
	}
}