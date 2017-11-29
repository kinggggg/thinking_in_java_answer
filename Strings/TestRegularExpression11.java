// strings/TestRegularExpression11.java
// TIJ4 Chapter Strings, Exercise 11, page 533
/* Apply the regular expression:
* 	(?i)((^[aeiou])|(\s+[aeiou]))\W+?[aeiou]\b
* 	to
* 	"Arline ate eight apples and one orange while Anita hadn't any"
*/ 
// Use args: "Arline ate eight apples and one orange while Anita hadn't any"
// 	(?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class TestRegularExpression11 {
	public static void main(String[] args) {
		if(args.length < 2) {
			print("Usage:\njava TestRegularExpression " + 
				"characterSequence regularExpression+");
			System.exit(0);  
		}
		print("Input: \"" + args[0] + "\"");
		for(String arg : args) {
			print("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			if(!m.find()) 
			  	print("No match found for " + "\"" + arg + "\"");
			m.reset();
			while(m.find()) {
				print("Match \"" + m.group() + "\" at position " +
					m.start() + ((m.end() - m.start() < 2) ? "" :  ("-" + (m.end() - 1))));
			}
		}
	}
}

