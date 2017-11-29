// initialization/VarargEx19.java
// TIJ4 Chapter Initialization, Exercise 19, page 204
/* Write a method that takes a vararg String array.  Verify that you can pass
* either a comma-separated list of Strings or a String[] into this method.
*/

public class VarargEx19 {
	static void showStrings(String... args) {
		for(String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		showStrings("one", "TWO", "three", "four");
		showStrings(new String[]{"1", "2", "3", "4"});
	}
}