// initialization/ConstructorTest.java
// ITJ4 Chapter Initialization, Exercise 1, p158
// Create a class containing an unitialized String reference. Demonstrate that // this reference is initialized by Java to null.

class Tester {
	String s;
}

public class ConstructorTest {
	public static void main(String[] args) {
		Tester t = new Tester();
		System.out.println(t.s);
	}
}