//: operators/Assign.java
// TIJ4 Chapter Operators, Exercise 2, page 97 
// Create a class containing a float and use it to demonstrate aliasing

import org.greggordon.tools.*;

class Tube {
	float level;
}

public class Assign {
	public static void main(String[] args) {
		Tube t1 = new Tube();
		Tube t2 = new Tube();
		t1.level = 0.9f;
		t2.level = 0.47f;
		P.rintln("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;
		P.rintln("2: t1.level: " + t1.level + ", t2.level: " + t2.level);		
		t1.level = 0.27f; 
		P.rintln("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}
}