// operators/BinaryTest.java
// TIJ4 Chapter Operators, Exercise 10, page 112 
/* Write a program with two constant values, one with alternating binary ones and
* zeroes, with a zero in the least-significant digit, and the second, also
* alternating, with a one in the least-significant digit (hint: It's easiest to 
* use hexadecimal constants for this). Take these two values and combine them in
* all possible ways using the bitwise operators, and display the results using
* Integer.toBinaryString(). 
*/

import org.greggordon.tools.*;

public class BinaryTest {
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		P.rintln("i = " + Integer.toBinaryString(i));
		P.rintln("j = " + Integer.toBinaryString(j));
		P.rintln("i & j = " + Integer.toBinaryString(i & j));
		P.rintln("i | j = " + Integer.toBinaryString(i | j));
		P.rintln("i ^ j = " + Integer.toBinaryString(i ^ j));
		P.rintln("~i = " + Integer.toBinaryString(~i));
		P.rintln("~j = " + Integer.toBinaryString(~j));
	}
}