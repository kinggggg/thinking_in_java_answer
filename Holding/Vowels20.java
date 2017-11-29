// holding/Vowels20.java
// TIJ4 Chapter Holding, Exercise 20, page 422
// Modify Exercise 16 so that you keep a count of the occurence of each vowel. 
import java.util.*;
import net.mindview.util.*;

public class Vowels20 {
	static void vowelCounter20(Set<String> st) {		
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 
			'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		int allVowels = 0;
		Map<Character,Integer> vowelMap =
			new TreeMap<Character,Integer>();
		for(String s : st) {
			for(Character v : s.toCharArray()) {		
				if(vowels.contains(v)) {
					Integer count = vowelMap.get(v);
					vowelMap.put(v, 
						count == null ? 1 : count + 1);
					allVowels++; 
				}
			}
		}
		System.out.println("Vowels: " + vowelMap);	
		System.out.println("Total vowels: " + allVowels);
	}
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(
			new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
		System.out.println();
		vowelCounter20(words);		
	}		
}
