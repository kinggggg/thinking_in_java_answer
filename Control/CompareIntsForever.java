// control/CompareIntsForever.java
// TIJ4 Chapter Control, Exercise 3, page 139
// Modify exercise 2 wtih infinte while loop. Stop prgram with Ctrl-C

import static net.mindview.util.Print.*;
import java.util.*;

public class CompareIntsForever {
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
		while(true) {
		//for(int i = 0; i < 25; i++) {
			int x = rand3.nextInt(10);
			int y = rand4.nextInt(10);
			if(x < y) print(x + " < " + y);
			else if(x > y) print(x + " > " + y);
			else print(x + " = " + y);
		}
	}
}