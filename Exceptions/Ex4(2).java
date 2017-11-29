// exceptions/Ex4.java
// TIJ4 Chapter Exceptions, Exercise 4, page 452
/* Create your own exception class using the extends keyword. Write a 
* constructor for this class that takes a String argument and stores it inside
* the object with a String reference. Write a method that displays the stored 
* String. Create a try-catch clause to exercise your new exception.
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

public class Ex4 {
	public static void f() throws Exception4 {
		System.out.println("f()");
		throw new Exception4("Ouch from f()");
	}
	public static void main(String[] args) {
		try {
			f();	
		} catch(Exception4 e) {
			System.err.println("Caught Exception4");
			e.printStackTrace();
			e.showS();
		} 
	}	
}