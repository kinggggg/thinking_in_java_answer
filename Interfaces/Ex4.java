// interfaces/Ex4.java
// TIJ4 Chapter Interfaces, Exercise 4, page 315
/* Create an abstract class with no methods. Derive a class and add a method. 
* Create a static method that takes a reference to the base class, downcasts
* it to the derived class, and calls the method. In main(), demonstrate that it
* works. Now put the abstract declaration for the method in the base class, thus
* eliminating the need for the downcast.
*/ 
import static org.greggordon.tools.Print.*;

abstract class Dad {
}

class Son extends Dad {
	protected void print() { println("Son"); }
}

abstract class SecondDad {
	abstract protected void print();
}

class SecondSon extends SecondDad {
	protected void print() { println("SecondSon"); }
}

public class Ex4 {
	public static void testPrint(Dad d) {
		((Son)d).print();
	}
	public static void secondTestPrint(SecondDad sd) {
		sd.print();
	}
	public static void main(String[] args) {
		Son s = new Son();
		Ex4.testPrint(s);
		SecondSon ss = new SecondSon();
		Ex4.secondTestPrint(ss);			
	}
}