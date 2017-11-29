// strings/Ex19.java
// TIJ4 Chapter Strings, Exercise 19, page 546
/* Building on the previous two exercises, write a program that examines 
* Java source-code and produces all the class names used in a particular
* program.
*/
// {Args: fileName}
import java.util.regex.*;
import net.mindview.util.*;
import java.io.*;

public class Ex19  {
	public static void main(String[] args) throws Exception {
		if(args.length < 1) {
			System.out.println("Usage: fileName");
			System.exit(0);
		}		
		// we want all class names:
		Pattern p = Pattern.compile("class \\w+\\s+");
		// not including those in comment lines:
		Pattern q = Pattern.compile("^(//|/\\*|\\*)");
		System.out.println("classes in " + args[0] + ":");
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates emtpy Matcher object
		Matcher n = q.matcher("");
		for(String line : new TextFile(args[0])) {
			m.reset(line);
			n.reset(line);
			while(m.find() && !n.find())
				System.out.println(index++ + ": " + m.group());
		}
	}
}