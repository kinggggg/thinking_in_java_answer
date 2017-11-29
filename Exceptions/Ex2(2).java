// exceptions/Ex2.java
// TIJ4 Chapter Exceptions, Exercise 2, page 452
/* Define an object reference and initialize it to null. Try to call a method
* through this reference. Now wrap the code in a try-catch clause to catch the
* exception.
*/

public class Ex2 {
	private static Integer i = null;	
	public static void main(String[] args) {
		// leads to NullPointerException:
		// System.out.println(i.toString());
		try {
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		} 
		try {
			i = 10;
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		} finally {
			System.out.println("Got through it");
		}
	}	
}