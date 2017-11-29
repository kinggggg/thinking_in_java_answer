// arrays/Ex7.java
// TIJ4 Chapter Arrays, Exercise 7, page 759
// Repeat the previous exercise for a 3-D array.
import java.util.*;

public class Ex7 {
	public static BerylliumSphere[][][] sphereAM(int size1, int size2, int size3) {
		BerylliumSphere[][][] result = new BerylliumSphere[size1][size2][size3];
		for(int i = 0; i < size1; i++) {
			result[i] = new BerylliumSphere[size2][size3];
			for(int j = 0; j < size2; j++) {
				result[i][j] = new BerylliumSphere[size3];
				for(int k = 0; k < size3; k++)
					result[i][j][k] = new BerylliumSphere();
			}	
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(sphereAM(2,2,2)));
		System.out.println(Arrays.deepToString(sphereAM(4,3,2)));		
	}
}