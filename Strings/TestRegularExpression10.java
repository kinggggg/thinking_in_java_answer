// strings/TestRegularExpression10.java
// TIJ4 Chapter Strings, Exercise 10, page 533
/* For the phrase "Java now has regular expressions" evaluate whether the following
* expressions will find a match:
* 	^Java		
* 	\Berg.*
*	n.w\s+h(a|i)s
*	S?
*	S+
*	s{4}
*	s{1}.
* 	s{0,3}
*/ 
// Use args: "Java now has regular expressions", "^Java", "\Berg.*", "n.w\s+h(a|i)s",
//	"s?", "s+", "s{4}", "s{1}.", "s{0,3}"
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class TestRegularExpression10 {
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

