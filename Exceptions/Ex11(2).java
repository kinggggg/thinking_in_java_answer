// exceptions/Ex11.java
// TIJ4 Chapter Exceptions, Exercise 11, page 468
/* Repeat the previous exercise, but inside the catch clause, wrap g()'s 
* exception in a RuntimeException.
*/
import static org.greggordon.tools.Print.*;

class GException extends Exception {
	GException(String s) { super(s); }
}

public class Ex11 {
	static void f() {
		try {
			g();
		} catch(GException ge) {
			println("Caught GException in f try");
			ge.printStackTrace();
			throw new RuntimeException(ge);
		}
	}
	static void g() throws GException {
		throw new GException("from g()");
	}
	public static void main(String[] args) {
		f();
	}	
}

	