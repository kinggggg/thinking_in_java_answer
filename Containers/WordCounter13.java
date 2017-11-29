// containers/WordCounter13.java
// TIJ4 Chapter Containers, Exercise 12, page 833
/* Use AssociativeArray.java to create a word-occurrence counter,
* mapping String to Integer. Using the net.mindview.util.TextFile 
* utility in this book, open a text file and break up the words
* in that file using whitespace and punctuation, and count the 
* occurrence of the words in that file.
*/
import net.mindview.util.*;	
import static net.mindview.util.Print.*;
import java.util.*;

public class WordCounter13 {
	public static void main(String[] args) {
		// File whose words are to be counted:
		String fileName = "WordCounter13.java";
		// Set of unique words in file:
		Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
		// Create initialize array of correct length:
		AssociativeArray<String,Integer> wordCount =
			new AssociativeArray<String,Integer>(words.size());
		// Word list of all words in file:
		ArrayList<String> fileList = new TextFile(fileName, "\\W+");
		// Count appearances of each unique word and add to array:
		for(String s : words) {
			int count = 0;
			for(String t : fileList) {
				if(t.equals(s)) count++;
			}
			wordCount.put(s, count);
		}
		print(wordCount);
	}
}