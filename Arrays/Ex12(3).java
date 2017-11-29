// arrays/Ex12.java
// TIJ4 Chapter Arrays, Exercise 12, page 774
// Create an initialized array of double using CountingGenerator.
// Print the results.
import net.mindview.util.*;
import java.util.*;

public class Ex12 {
	public static void main(String[] args) {
		double[] da = new double[10];
		CountingGenerator.Double dGen = 
			new CountingGenerator.Double();
		for(int i = 0; i < da.length; i++)
			da[i] = dGen.next();
		System.out.println(Arrays.toString(da));	
	}
}