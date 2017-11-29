// strings/JGrep15.java
// TIJ4 Chapter Strings, Exercise 15, page 546
// Modify JGrep.java to accept flags as arguments (e.g., Pattern.CASE_INSENSITIVE,
// Pattern.MULTILINE).
// {Args: JGrep15.java "\b[Ssct]\w+", Pattern.CASE_INSENSITIVE}
import java.util.regex.*;
import net.mindview.util.*;

public class JGrep15  {
	public static void main(String[] args) throws Exception {
		if(args.length < 3) {
			System.out.println("Usage: java JGrep file regex flag");
			System.exit(0);
		}
		int flag = 0;
		if(args[2].equals("Pattern.CASE_INSENSITIVE")) 
			flag = Pattern.CASE_INSENSITIVE;
		else if(args[2].equals("Pattern.CANON_EQ"))
			flag = Pattern.CANON_EQ;
		else if(args[2].equals("Pattern.COMMENTS"))
			flag = Pattern.COMMENTS;
		else if(args[2].equals("Pattern.DOTALL"))
			flag = Pattern.DOTALL;
		else if(args[2].equals("Pattern.LITERAL"))
			flag = Pattern.LITERAL;
		else if(args[2].equals("Pattern.MULTILINE"))
			flag = Pattern.MULTILINE;
		else if(args[2].equals("Pattern.UNICODE_CASE"))
			flag = Pattern.UNICODE_CASE;
		else if(args[2].equals("Pattern.UNIX_LINES"))
			flag = Pattern.UNIX_LINES;
		Pattern p = Pattern.compile(args[1], flag);
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates empty Matcher object
		for(String line : new TextFile(args[0])) {
			m.reset(line);
			while(m.find())
				System.out.println(index++ + ": " + 
					m.group() + ": " + m.start());
		}
	}
}