// operators/CharBinaryTest.java
// TIJ4 Chapter Operators, Exercise 13, page 116
/* Write a method that displays char values in binary form. Demonstrate it
* using several different characters. 
*/ 

import org.greggordon.tools.*;

public class CharBinaryTest {
	public static void main(String [] args) {
		char c = 'a';
		P.rintln(Integer.toBinaryString(c));
		c = 'b';
		P.rintln(Integer.toBinaryString(c));
		c = 'c';
		P.rintln(Integer.toBinaryString(c));
		c = 'd';
		P.rintln(Integer.toBinaryString(c));
		c +=1;
		P.rintln(Integer.toBinaryString(c));
		c = 'A';
		P.rintln(Integer.toBinaryString(c));
		for(int i = 0; i < 26; i++) {
			c +=1;
			P.rintln(Integer.toBinaryString(c));
		}
	}
}