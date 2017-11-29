// exceptions/Ex6.java
// TIJ4 Chapter Exceptions, Exercise 6, page 456
/* Create two exception classes, each of which performs its own logging
* automtically. Demonstrate that these work.
*/
import java.util.logging.*;
import java.io.*;

class Oops1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public Oops1() { 
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString()); 		
	}
}

class Oops2 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public Oops2() {
	StringWriter trace = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
	} 
}

public class Ex6 {
	static void f() throws Oops1, Oops2 {
		throw new Oops1();
	}
	static void g() throws Oops2 {
		throw new Oops2();
	}
	public static void main(String[] args) {
		try {
			f();
		} catch(Exception Oops1) {}
		try {
			g();
		} catch(Exception Oops2) {}
	}
}

