// reusing/Stem2.java
// TIJ4 Chapter Reusing, Exercise 12, page 254
// Add a proper hierarchy of dispose() methods to all the classes of exercise 9. 
/* EX 9: Create a class called Root that contains an instance of each of the classes
* (that you also create) named Component1, Component2 and Component3. Derive a 
* class Stem from Root that also contains an instance of each "component." All 
* classes should have default constructors that print a message about that class.
*/
 
import static org.greggordon.tools.Print.*;

class Component1 {
	Component1() { println("Component1()"); }
	void dispose() { println("Component1.dispose()"); }
}

class Component2 {
	Component2() { println("Component2()"); }
	void dispose() { println("Component2.dispose()"); }
}

class Component3 {
	Component3() { println("Component3()"); }
	void dispose() { println("Component3.dispose()"); }
}

class Root2 { 
	Component1 c1root;
	Component2 c2root;
	Component3 c3root;
	Root2() { 
		println("Root()");
		c1root = new Component1();
		c2root = new Component2();
		c3root = new Component3();
	}
	void dispose() {
		c3root.dispose();
		c2root.dispose();
		c1root.dispose();
		println("Root2.dispose()");
	} 
}

class Stem2 extends Root2 { 
	Component1 c1stem;
	Component2 c2stem;
	Component3 c3stem;
	Stem2() { 
		super();
		println("Stem2()"); 
		c1stem = new Component1();
		c2stem = new Component2();
		c3stem = new Component3();
	}
	void dispose() {
		c3stem.dispose();
		c2stem.dispose();
		c1stem.dispose();
		super.dispose();
		println("Stem2.dispose()");
	} 
	public static void main(String[] args) {
		Stem2 s = new Stem2();
		try {
			// Code and exception handling...
		} finally {
			s.dispose();
		}
	}
}
