// containers/WordCounter15.java
// TIJ4 Chapter Containers, Exercise 15, page 847
// Repeat Exercise 13 using a SlowMap. 
import net.mindview.util.*;	
import static net.mindview.util.Print.*;
import java.util.*;

public class WordCounter15 {
	public static void main(String[] args) {
		// File whose words are to be counted:
		String fileName = "WordCounter15.java";
		// List of all words in file:
		ArrayList<String> wordList = new TextFile(fileName, "\\W+");
		SlowMap<String,Integer> wordCount = new SlowMap<String,Integer>();
		Iterator it = wordList.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if(!(wordCount.containsKey(s))) wordCount.put(s,1);
			else {
				int count = wordCount.get(s);
				wordCount.put(s, ++count);
			}
		}
		print(wordCount);		
	}
}