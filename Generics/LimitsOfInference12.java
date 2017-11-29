// generics/LimitsOfInference12.java
// TIJ4 Chapter Generics, Exercise 12, page 635
// Repeat the previous exercise using explicit type specification.
import typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class LimitsOfInference12 {
	static void f(Map<Person, List<? extends Pet>> petPeople) {}
	public static void main(String[] args) {
		f(New.<Person, List<? extends Pet>>map()); 
	}
}