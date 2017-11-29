// exceptions/Ex8.java
// TIJ4 Chapter Exceptions, Exercise 8, page 458
/* Write a class with a method that throws an exception of the type created
* in Exercise 4. Try compiling it without an exception specification to see
* what the compiler says. Add the appropriate exception specification. Try
* out your class and its exception inside a try-catch clause.
*/

class Exception4 extends Exception {
	private String msg;
	Exception4(String msg) {
		super(msg);
		System.out.println("Exception4()");
		this.msg = msg;
	}
	protected void showS() { 
		System.out.println("Message from Exception4: " + msg);
	}
}

class Test8 {
	public static void f() throws Exception4 {
		System.out.println("f()");
		throw new Exception4("Ouch from f()");
	}
}

public class Ex8 {
	public static void main(String[] args) {
		try {
			Test8 t = new Test8();
			t.f();	
		} catch(Exception4 e) {
			System.err.println("Caught Exception4");
			e.printStackTrace();
			e.showS();
		} 
	}	
}