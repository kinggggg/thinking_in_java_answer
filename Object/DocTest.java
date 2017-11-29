// object.DocTest.java
// TIJ4 Chapter Object, Exercise 12, page 90
/* Find the code for the second version of HelloDate.java, which is the simple
* comment documentation example. Execute Javadoc on the file and view the
* results with your Web browser. 
*/

import java.util.*;

/** The first Thinking in Java example program.
* Displays a string and today's date.
* @author Burce Eckel
* @author www.MindView.net
* @version 4.0
*/

public class DocTest {
	/** Entry poing to class & application.
	* @param args array of string arguments
	* @throws exceptions No exceptions thrown
	*/
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());	
	}
} /* Output: (55% match)

*/

