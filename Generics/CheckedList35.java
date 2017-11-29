// generics/CheckedList35.java
// TIJ4 Chapter Generics, Exercise 35, page 711
// Modify CheckedList.java so that it uses the Coffee classes defined
// in this chapter.
import generics.coffee.*;
import java.util.*;

public class CheckedList35 {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyMocha) {
		probablyMocha.add(new Breve());
	}
	public static void main(String[] args) {
		List<Mocha> mocha1 = new ArrayList<Mocha>();
		oldStyleMethod(mocha1); // Quietly accepts a Breve
		List<Mocha> mocha2 = Collections.checkedList(
			new ArrayList<Mocha>(), Mocha.class);
		try {
			oldStyleMethod(mocha2); // Throws an exception
		} catch(Exception e) {
			System.out.println(e);
		}
		// Derived type works fine:
		List<Coffee> coffee = Collections.checkedList(
			new ArrayList<Coffee>(), Coffee.class);
		coffee.add(new Mocha());
		coffee.add(new Breve());		
	}
}	