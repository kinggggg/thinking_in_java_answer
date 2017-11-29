// exceptions/WithFinally15.java
// TIJ4 Chapter Exceptions, Exercise 15, page 476
// Show that WithFinally.java doesn't fail by throwing a 
// RuntimeException inside the try block.

public class WithFinally15 {
	private static Switch sw = new Switch();
	// set up x[0] = null:
	private static Integer[] x = new Integer[1];
	public static void f(int i) 
	throws OnOffException1, OnOffException2 {}
	public static void main(String[] args) {
		try {
			sw.on();
			// Code to throw NullPointerException: 
			f(x[0]);
		} catch(OnOffException1 e) {
			System.out.println("OnOffException1");
		} catch(OnOffException2 e) {
			System.out.println("OnOffException2");
		} finally {
			sw.off();
		} 
	}		
} 

