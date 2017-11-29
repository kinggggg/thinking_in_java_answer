// strings/Sentence7.java
// TIJ4 Chapter Strings, Exercise 7, page 527
/* Using the documentation for java.util.regex.Pattern as a resource,
* write and test a regular expression that checks a sentence to see
* that it begins with a captial letter and ends with a period.
*/
import java.util.regex.*;
import static org.greggordon.tools.Print.*;

public class Sentence7 {

	public static void main(String[] args) {
		// starts with any capital A through Z
		// then zero or more of any char except endline
		// ends with . 
		String sen = "^[A-Z].*[\\.]$";
		String s1 = "Once upon a time.";
		String s2 = "abcd.";
		String s3 = "Abcd?";
		String s4 = "An easy way out.";
		String s5 = "Zorro.";
		String s6 = "X.";
		println(s1.matches(sen));
		println(s2.matches(sen));
		println(s3.matches(sen));
		println(s4.matches(sen));
		println(s5.matches(sen));
		println(s6.matches(sen));
	}
}