// strings/Ex5.java
// TIJ4 Chapter Strings, Exercise 5, page 521
/* For each of the basic conversion types in the above table, write the 
* most complex formatting expression possible. That is, use all the possible
* format specifiers available for that conversion type.
*/
import java.math.*;
import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		Formatter f = new Formatter(System.out);

		char u = 'a';
		System.out.println("char u = \'a\'");
		f.format("%-2s%-2S%-2c%-2C%-5b%-5B%-3h%-3H%%\n", u,u,u,u,u,u,u,u);
		
		int v = 121;
		System.out.println("int v = 121");
		f.format("%-4s%-4S%-4d%-4c%-4C%-5b%-5B%-4x%-4X%-4h%-4H%%\n", v,v,v,v,v,v,v,v,v,v,v);
		
		BigInteger w = new BigInteger("50000000000000");
		System.out.println("BigInteger w = 50000000000000");
		f.format("%-15s%-15S%-5b%-5B%-15x%-15X%-5h%-5H%%\n", w,w,w,w,w,w,w,w); 

		double x = 179.543;
		System.out.println("double x = 179.543");
		f.format("%-8s%-8S%-5b%-5B%-15f%-15e%-15E%-12h%-12H%%\n", x,x,x,x,x,x,x,x,x);
		
		Conversion y = new Conversion();
		System.out.println("Conversion y = new Conversion()");
		f.format("%-20s%-20S%-5b%-5B%-10h%-10H%%\n", y,y,y,y,y,y);

		boolean z = false;
		System.out.println("boolean z = false");
		f.format("%-7s%-7S%-7b%-7B%-7h%-7H%%\n", z,z,z,z,z,z);
	}
}
