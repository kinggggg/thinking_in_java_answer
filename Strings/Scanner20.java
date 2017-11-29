// strings/Scanner20.java
// TIJ4 Chapter Strings, Exercise 20, page 549
/* Create a class that contains int, long, float and double and String fields.
* Create a constructor for this class that takes a single String argument, and
* scans that string into the various fields. Add a toString(0 method and 
* demonstrate that your class works correctly.
*/
import java.util.*;

public class Scanner20 {
	int i;
	long L;
	float f;
	double d;
	String s;
	Scanner20(String s) {
		Scanner sc = new Scanner(s);
		i = sc.nextInt();
		L = sc.nextLong();
		f = sc.nextFloat();
		d = sc.nextDouble();
		this.s = sc.next(); 		
	}
	public String toString() {
		return i + " " + L + " " + f + " " + d + " " + s;
	}
	public static void main(String[] args) {
		Scanner20 s20 = new Scanner20("17 56789 2.7 3.61412 hello");
		System.out.println(s20);
	}
}