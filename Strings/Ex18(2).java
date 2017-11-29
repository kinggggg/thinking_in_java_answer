// strings/Ex18.java
// TIJ4 Chapter Strings, Exercise 18, page 546
/* Write a program that reads a Java source-code file (you provide the 
* file name on the command line) and displays all the string literals 
* in the code.
*/
// {Args: fileName}
import java.util.regex.*;
import net.mindview.util.*;
import java.io.*;

public class Ex18  {
	public static void main(String[] args) throws Exception {
		if(args.length < 1) {
			System.out.println("Usage: fileName");
			System.exit(0);
		}
		Pattern p = Pattern.compile("\".*\"");
		System.out.println(args[0] + " string literals:");
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates emtpy Matcher object
		for(String line : new TextFile(args[0])) {
			m.reset(line);
			while(m.find())
				System.out.println(index++ + ": " + m.group());
		}
	}
}