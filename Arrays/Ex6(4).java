// arrays/Ex6.java
// TIJ4 Chapter Arrays, Exercise 6, page 759
/* Write a method that takes two int arguments, indicating the two sizes of
* a 2-D array. The method should create and fill a 2-D array of BerylliumSphere
* according to the size arguments.
*/
import java.util.*;

public class Ex6 {
	public static BerylliumSphere[][] sphereAM(int size1, int size2) {
		BerylliumSphere[][] result = new BerylliumSphere[size1][size2];
		for(int i = 0; i < size1; i++) {
			result[i] = new BerylliumSphere[size2];
			for(int j = 0; j < size2; j++)
				result[i][j] = new BerylliumSphere();	
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(sphereAM(2,2)));
		System.out.println(Arrays.deepToString(sphereAM(4,3)));		
	}
}