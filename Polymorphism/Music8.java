// polymorphism/music8/Music8.java
// TIJ4 Chapter Polymorphism, Exercise 8, page 289
/* Modify Music3.java so that it randomly creates Instrument objects the way
* Shapes.java does.
*/
/* Solution includes, in same package:
* import java.util.*;
* public class RandomInstrumentGenerator {
*	private Random rand = new Random();
*	public Instrument next() {
*		switch(rand.nextInt(7)) {
*			default:
*			case 0: return new Wind();
*			case 1: return new Percussion();
*			case 2: return new Stringed();
*			case 3: return new Keyboard();
*			case 4: return new Brass();
*			case 5: return new Woodwind();
*			case 6: return new Piano();
*		}
*	}
* }
*/
package polymorphism.music8;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

class Instrument {
	void play(Note n) { print("Instrument.play() " + n); }
	public String toString() { return "Instrument"; }
	void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
	void play(Note n) { print("Wind.play() " + n); }
	public String toString() { return "Wind"; }
	void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
	void play(Note n) { print("Percussion.play() " + n); }
	public String toString() { return "Percussion"; }
	void adjust() { print("Adjusting Percussion"); } 
}

class Stringed extends Instrument {
	void play(Note n) { print("Stringed.play() " + n); }
	public String toString() { return "Stringed"; }
	void adjust() { print("Adjusting Stringed"); } 
}

class Keyboard extends Instrument {
	void play(Note n) { print("Keyboard.play() " + n); }
	public String toString() { return "Keyboard"; }
	void adjust() { print("Adjusting Keyboard"); } 
}

class Brass extends Wind {
	void play(Note n) { print("Brass.play() " + n); }
	public String toString() { return "Brass"; }
	void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
	void play(Note n) { print("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
}

class Piano extends Keyboard {
	void play(Note n) { print("Piano.play() " + n); }
	public String toString() { return "Piano"; }
}

public class Music8 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();	
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = new Instrument[20];
		// fill up orchestra array wth instruments:
		for(int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		tuneAll(orchestra);
		for(Instrument i : orchestra)
			System.out.println(i);
	}
}