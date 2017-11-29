// strings/SplitDemo14.java
// TIJ4 Chapter Strings, Exercise 14, page 541
// Rewrite SplitDemo using String.split().
import java.util.regex.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class SplitDemo14 {
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(input.split("!!")));
		// Only do the first three:
		print(Arrays.toString(input.split("!!", 3)));
	}
}