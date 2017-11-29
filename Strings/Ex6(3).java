// strings/Ex6.java
// TIJ4 Chapter Strings, Exercise 6, page 523
/* Create a class that contains int, long, float, and double fields. Create
* a toString() method for this class that uses String.format(), and demonstrate
* that your class works correctly.
*/
import java.util.*;

public class Ex6 {
	int i = 0;
	long l = 0;
	float f = 0.0f;
	double d = 0.0;
	Ex6(int i, long l, float f, double d) {
		this.i = i;
		this.l = l;
		this.f = f;
		this.d = d;
	}	
	public String toString() {
		return String.format("i = %d\nl = %d\nf = %.16g\nd = %.16g\n", i, l, f, d);
	}
	public static void main(String[] args) {
		Ex6 x = new Ex6(2, 45l, 1.2f, 2.7182818289);
		Ex6 ex = new Ex6(-2147483648, -9223372036854775808L, 1.1754943508222875E-38f, 2.2250738585072014E-308);
		Ex6 exMax = new Ex6(2147483647, 9223372036854775807L, 3.4028234663852886E38f, 1.7976931348623157E308);
		System.out.println(x);
		System.out.println(ex);
		System.out.println(exMax);
	}
}