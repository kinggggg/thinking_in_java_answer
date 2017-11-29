// innerclasses/Outer1.java
// TIJ4 Chapter Innerclasses, Exercise 1, page 347
/* Write a class named Outer that contains an inner class named Innet. 
* Add a method to Outer that returns an object of type Inner. In main(),
* create and initialize a reference to an Inner.
*/

public class Outer1 {
	class Inner { 
		Inner() { System.out.println("Inner()"); }
	}
	Outer1() { System.out.println("Outer1()"); }
	// make an Inner from within a non-static method of outer class:
	Inner makeInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Inner i = o.makeInner();
	}
}