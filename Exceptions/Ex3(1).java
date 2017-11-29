// exceptions/Ex3.java
// TIJ4 Chapter Exceptions, Exercise 3, page 452
// Write code to generate and catch an ArrayIndexOutOfBoundsException.

public class Ex3 {
	private static int[] ia = new int[2];	
	public static void main(String[] args) {
		try {
			ia[2] = 3;	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(
				"Caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} 
	}	
}