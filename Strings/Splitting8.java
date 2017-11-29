// strings/Splitting8.java
// TIJ4 Chapter Strings, Exercise 8, page 527
// Split the string Splitting.knights on the words "the" or "you."
import java.util.*;

public class Splitting8 {
	public static String knights =
		"Then, when you have found the shrubbery, you must " +
		"cut down the mightiest tree in the forest... " +
		"with... a herring!";
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}

	public static void main(String[] args) {
		split("the|you");
	}
}