// innerclasses/Ex23.java
// TIJ4 Chapter Innerclasses, Exercise 23, page 371
/* Create an interface U with three methods. Create a class A with a method that
* produces a reference to a U by building an anonymous inner class. Create a second
* class B that contains an array of U. B should have one method that accepts and 
* stores a reference to U in the array, a second method that sets a reference in
* the array (specified by the method argument) to null, and a third method that
* moves through the array and calls the methods in U. In main, create a group of A 
* objects and a single B. Fill the B with U references produced by the A objects. 
* Use the B to call back into all the A objects. Remove some of the U references
* from the B.
*/

interface U {
	void f();
	void g();
	String toString();
}

class A {
	U buildU() {
		return new U() {
			public void f() { System.out.println("f()"); }
			public void g() { System.out.println("g()"); }
			public String toString() { return "I'm a U"; }
		};
	}
}

class B {
	private U[] us;
	B(int i) {
		us = new U[i];
	}
	void addU(U u, int i) {
		us[i] = u;
	}
	void eraseU(int i) {
		us[i] = null;	
	}
	void testUs() {
		for(U u : us) {
			u.f();
			u.g();
			u.toString();
		}		
	}
	void showUs() {
		for(U u : us) { 
			if(u != null) System.out.println(u.toString());
			else System.out.println("I'm null");
		}
	}
}

public class Ex23 {
	public static void main(String[] args) {
		A a0 = new A();
		A a1 = new A();
		A a2 = new A();
		B b = new B(3);
		b.addU(a0.buildU(), 0);
		b.addU(a1.buildU(), 1);
		b.addU(a2.buildU(), 2);
		b.showUs();
		b.testUs();
		b.eraseU(0);
		b.eraseU(1);
		b.showUs();
	}
}