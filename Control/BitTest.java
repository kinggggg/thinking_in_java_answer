// control/BitTest.java
// TIJ4 Chapter Control, Exercise 5, page 140
/* Repeat exercise 10 from the last chapter using the ternary operator and a
* bitwise test to display the ones and zeros, instead of Integer.toBinaryString()
*/ 

import org.greggordon.tools.*;

public class BitTest {
	static void binaryPrint (int q) {
		if(q == 0) System.out.print(0);
		else {
			int nlz = Integer.numberOfLeadingZeros(q); 
			q <<= nlz;
			for(int p = 0; p < 32 - nlz; p++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				System.out.print(n);		
				q <<= 1;
			}		
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		int k = 0x100;
		int m = 0;
		P.rintln("Using Integer.toBinaryString():");
		P.rintln("i = " + Integer.toBinaryString(i));
		P.rintln("j = " + Integer.toBinaryString(j));
		P.rintln("k = " + Integer.toBinaryString(k));
		P.rintln("m = " + Integer.toBinaryString(m));		
		P.rintln("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
		P.rintln("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
		P.rintln("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
		P.rintln("~i = " + Integer.toBinaryString(~i));
		P.rintln("~j = " + Integer.toBinaryString(~j));
		P.rintln("Using binaryPrint():");
		P.rint("i = " + i + " = ");
		binaryPrint(i);		
		P.rint("j = " + j + " = ");
		binaryPrint(j);
		P.rint("k = " + k + " = ");
		binaryPrint(k);		
		P.rint("m = " + m + " = ");
		binaryPrint(m);
		P.rint("i & j = " + (i & j) + " = ");
		binaryPrint(i & j);
		P.rint("i | j = " + (i | j) + " = ");
		binaryPrint(i | j);
		P.rint("i ^ j = " + (i ^ j) + " = ");
		binaryPrint(i ^ j);
		P.rint("~i = " + ~i + " = ");
		binaryPrint(~i);		
		P.rint("~j = " + ~j + " = ");
		binaryPrint(~j);
	}	
}