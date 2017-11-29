// exceptions/Ex13.java
// TIJ4 Chapter Exceptions, Exercise 13, page 476
/* Modify Exercise 9 by adding a finally clause. Verify that your 
* finally clause is executed, even if a NullPointerException is thrown.
*/
import static net.mindview.util.Print.*;

class ExceptionA extends Exception {
	ExceptionA(String msg) { super(msg); } 	
}

class ExceptionB extends Exception {
	ExceptionB(String msg) { super(msg); } 	
}

class ExceptionC extends Exception {
	ExceptionC(String msg) { super(msg); } 		
}

public class Ex13 {
	// array element will be initialized to null:
	private static Integer[] x = new Integer[1];
	public static void f(int x) 
	throws ExceptionA, ExceptionB, ExceptionC {
		if(x < 0) throw new ExceptionA("x < 0");
		if(x == 0) throw new ExceptionB("x == 0");
		if(x > 0) throw new ExceptionC("x > 0");
	}
	public static void main(String[] args) {
		try {
			// to throw NullPointerException:
			f(x[0]);
			f(0);
			f(1);
			f(-1);
		// will catch any Exception type:
		} catch(Exception e) {
			print("Caught Exception");
			e.printStackTrace(System.out);
		} finally {
			print("made it to finally");
		}
	}	
}

