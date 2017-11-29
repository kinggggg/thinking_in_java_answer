// initialization/VarargEx20.java
// TIJ4 Chapter Initialization, Exercise 20, page 204
/* Create a main() that uses varargs instead of the ordinary main() syntax. Print
* all the elements in the resulting args array. Test it with various numbers of
* command-line arguments.
*/

public class VarargEx20 {
	public static void main(String... args) {
		for(String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
}