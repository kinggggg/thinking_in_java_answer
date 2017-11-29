// reusing/Difference.java
// TIJ4 Chapter Reusing, Exercise 18, page 265
/* Create a class with a static final field and a final field and demonstrate
* the difference between the two.
*/
import java.util.*;
import static org.greggordon.tools.Print.*;

class Test {
	Test() { println("Test()"); }
}

public class Difference {
	private String name;
	public Difference(String s) { name = s;  } 
	static final Test sft = new Test(); // constant reference address
	private final Test ft = new Test();
	static final String SFS = "static final"; // class constant
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt(); // class constant 
	private final int fi = rand.nextInt();
	public String toString() {
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);   
	} 		
	public static void main(String[] args) {
		Difference d1 = new Difference("d1");
		Difference d2 = new Difference("d2");
		Difference d3 = new Difference("d3");
		println(d1);
		println(d2);
		println(d3);
	}
}