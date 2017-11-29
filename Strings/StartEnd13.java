// strings/StartEnd13.java
// TIJ4 Chapter Strings, Exercise 13, page 538
// Modify StartEnd.java so that it uses Groups.POEM as input, but still produces positive 
// outputs for find(), lookingAt() and matches().
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class StartEnd13 {
	public static String input =
		"Twas brillig, and the slithy toves\n" +
		"Did gyre and gimble in the wabe.\n" +
		"All mimsy were the borogoves,\n" +
		"And the mome raths outgrabe.\n\n" +
		"Beware the Jabberwock, my son,\n" +
		"The jaws that bite, the claws that catch,\n" +
		"Beware the Jubjub bird, and shun\n" +
		"The frumious Bandersnatch.";
	private static class Display {
		private boolean regexPrinted = false;
		private String regex;
		Display(String regex) { this.regex = regex; }
		void display(String message) {
			if(!regexPrinted) {
				print(regex);
				regexPrinted = true;
			}
			print(message);
		}
	}
	static void examine(String s, String regex) {
		Display d = new Display(regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find())
			d.display("find() '" + m.group() + "' start = " + m.start() + " end  = " + m.end());
		if(m.lookingAt()) // No reset() necessary
			d.display("lookingAt() start = " + m.start() + " end = " + m.end());
		if(m.matches()) // No reset() necessary
			d.display("matches() start = " + m.start() + " end = " + m.end());	
	}
	public static void main(String[] args) {
		for(String in : input.split("\n")) {
			print("input : " + in);
			for(String regex : new String[]{"\\w*are\\w*", "A\\w*", "T\\w+", "Did.*"})
				examine(in, regex);
		}
	}
}