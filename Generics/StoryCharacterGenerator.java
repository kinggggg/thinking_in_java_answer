// generics/storyCharacters/StoryCharacterGenerator.java
// TIJ4 Chapter Generics, Exercise 8, page 631
/* Following the form of the Coffee example, create a hierarchy of StoryCharacter(s) from 
* your favorite movie, dividing them into GoodGuy(s) and BadGuy(s). Create a generator
* for StoryCharacter(s), following the form of CoffeeGenerator.

/* Solution includes, in same package, generics.storyCharacters:
* public class StoryCharacter {
*  	private static long counter = 0;
*  	private final long id = counter++;
*  	public String toString() {
*    		return getClass().getSimpleName() + " " + id;
*  	}
* }
* public class GoodGuy extends StoryCharacter {}
* public class LukeSkywalker extends GoodGuy {}
* public class Yoda extends GoodGuy {}
* public class BadGuy extends StoryCharacter {}
* public class DarthVader extends BadGuy {}
* public class JabbaTheHut extends BadGuy {}
*/

package generics.storyCharacters;
import java.util.*;
import org.greggordon.util.*;

public class StoryCharacterGenerator 
	implements Generator<StoryCharacter>,  Iterable<StoryCharacter> {
	private Class[] types = { DarthVader.class, JabbaTheHut.class, 
		LukeSkywalker.class, Yoda.class };
	private static Random rand = new Random();
	public StoryCharacterGenerator() {}
	// For iteration:
	private int size = 0;
	public StoryCharacterGenerator(int sz) { size = sz; }
	public StoryCharacter next() {
		try {
			return 
			(StoryCharacter)types[rand.nextInt(types.length)].newInstance();
		// Report programmer errors at run time:
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}	
	class StoryCharacterIterator implements Iterator<StoryCharacter> {
		int count = size;
		public boolean hasNext() { return count > 0; }
		public StoryCharacter next() {
			count--;
			return StoryCharacterGenerator.this.next();
		}
		public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		}
	}
	public Iterator<StoryCharacter> iterator() {
		return new StoryCharacterIterator();
	}
	public static void main(String[] args) {
		StoryCharacterGenerator gen = new StoryCharacterGenerator();
		for(int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for(StoryCharacter s : new StoryCharacterGenerator(5))
			System.out.println(s); 
	}
}
