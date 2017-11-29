// generics/Apply40.java
// {main: ApplyTest40}
// TIJ4 Chapter Generics, Exercise 40, page 731
// Add a speak() method to all the pets in tyepinfo.pets. Modify Apply.java to call the speak
// method for a heterogeneous collection of Pet.
import java.lang.reflect.*;
import java.util.*;
import static net.mindview.util.Print.*;
import typeinfo.pets.*;

public class Apply40 {
	public static <T,S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
		try {
			for(T t : seq)
				f.invoke(t, args);
		} catch(Exception e) {
			// Failures are programmer errors
			throw new RuntimeException(e);
		}
	}
}

class FilledList<T> extends ArrayList<T> {	
	public FilledList(Class<? extends T> type, int size) {
		try {
			for(int i = 0; i < size; i++)
				// Assumes default constructor:
				add(type.newInstance());
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class ApplyTest40 {
	public static void main(String[] args) throws Exception {
		// Random list of 10 pets:
		List<Pet> pets = Pets.arrayList(10);
		print("Random pets: " + pets);
		// Applies the overridden methods:
		Apply40.apply(pets, Pet.class.getMethod("speak"));
		// FilledList contains only one type:
		Apply40.apply(new FilledList<Pet>(Dog.class, 5), Pet.class.getMethod("speak"));
	}
}