// operators/RightShiftTest.java
// TIJ4 Chapter Operators, Exercise 11, page 116 
/* Start with a number that has a binary one in the most significant position
* (hint: Use a hexadecimal constant). Using the signed right-shift operator,
* right shift it all the way through all of its binary positions each time
* displaying the result using Integer.toBinaryString().
*/ 

import org.greggordon.tools.*;

public class RightShiftTest {
	public static void main(String [] args) {
		int h = 0x10000000;
		P.rintln(Integer.toBinaryString(h));
		for(int i = 0; i < 28; i++) {
			h >>>= 1;
			P.rintln(Integer.toBinaryString(h));
		}
	}
}