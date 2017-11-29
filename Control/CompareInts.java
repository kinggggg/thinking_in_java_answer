// control/CompareInts.java
// TIJ4 Chapter Control, Exercise 2, page 139
/* Write a program that generates 25 random int values. For each value, use an
* if-else statement to classify it as greater than, less than or equal to a
* second randomly generated value.
*/

import static net.mindview.util.Print.*;
import java.util.*;

public class CompareInts {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		for(int i = 0; i < 25; i++) {
			int x = rand1.nextInt();
			int y = rand2.nextInt();
			if(x < y) print(x + " < " + y);
			else if(x > y) print(x + " > " + y);
			else print(x + " = " + y);
		}
		Random rand3 = new Random();
		Random rand4 = new Random();
		for(int i = 0; i < 25; i++) {
			int x = rand3.nextInt(10);
			int y = rand4.nextInt(10);
			if(x < y) print(x + " < " + y);
			else if(x > y) print(x + " > " + y);
			else print(x + " = " + y);
		}
	}
}