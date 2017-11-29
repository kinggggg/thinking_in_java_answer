// strings/Groups12.java
// TIJ4 Chapter Strings, Exercise 12, page 536
/* Modify Groups.java to count all of the unique words that do not start with a 
* capital letter.
*/
import java.util.regex.*;
import static net.mindview.util.Print.*;
import java.util.*;

public class Groups12 {
	static public final String POEM =
	"Twas brillig, and the slithy toves\n" +
	"Did gyre and gimble in the wabe.\n" +
	"All mimsy were the borogoves,\n" +
	"And the mome raths outgrabe.\n\n" +
	"Beware the Jabberwock, my son,\n" +
	"The jaws that bite, the claws that catch,\n" +
	"Beware the Jubjub bird, and shun\n" +
	"The frumious Bandersnatch.";
	public static void main(String[] args) {
		Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
		Set<String> words = new TreeSet<String>();
		while(m.find()) {
			words.add(m.group());
		}
		print("Number of unique non-cap words = " + words.size());
		print(words);
	}
}