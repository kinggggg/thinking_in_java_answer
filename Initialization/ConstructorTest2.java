// initialization/ConstructorTest2.java
// TIJ4 Chapter Initialization, Exercise 2, p158
/* Create a class with a String field that is initialized at the point of
* definition, and another one that is initialized by the constructor. What is
* the difference between the two approaches.
*/

class Tester2 {
	String s1;
	String s2 = "hello";
	String s3;
	Tester2() { s3 = "good-bye"; }
}

public class ConstructorTest2 {
	public static void main(String[] args) {
		Tester2 t = new Tester2();
		System.out.println("t.s1: " + t.s1);
		System.out.println("t.s2: " + t.s2);
		System.out.println("t.s3: " + t.s3);
	}
}