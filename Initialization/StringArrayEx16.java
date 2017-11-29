// initialization/StringArrayEx16.java
// TIJ4 Chapter Initialization, Exercise 16, page 198
/* Create an array of String objects and assign a String to each element. Print
* the array by using an forloop.
*/

public class StringArrayEx16 {
	public static void main(String[] args) {				
		String[] s = { "one", "two", "three", };		
		for(int i = 0; i < s.length; i++)
			System.out.println("s[" + i + "] = " + s[i]);
	}
}

