//: operators/PrintTest.java
// TIJ4 Chapter Operators, Exercise 1, pager 94
// Write a program that uses the "short" and long form of print statement

import static net.mindview.util.Print.*;
import org.greggordon.tools.*;

public class PrintTest {
	public static void main(String[] args) {
		print("Hello, from short form.");
		P.rintln("Hello from greggordon form.");
		System.out.println("Hello from long form.");
	}
}