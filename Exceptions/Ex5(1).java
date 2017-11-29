// exceptions/Ex5.java
// TIJ4 Chapter Exceptions, Exercise 5, page 452
/* Create you own resumption-like behavior using a while loop that repeats
* until an exception is no longer thrown.
*/

public class Ex5 {
	private static int[] ia = new int[2];
	static int x = 5;	
	public static void main(String[] args) {
		while(true) {
			try {
				ia[x] = 1;
				System.out.println(ia[x]);
				break;	
			} catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(
					"Caught ArrayIndexOutOfBoundsException");
					e.printStackTrace();
				x--;
			} finally {
				System.out.println("Are we done yet?");		
			}
		}
		System.out.println("Now, we're done.");
	}	
}