// generics/Ex28.java
// TIJ4 Chapter Generics, Exercise 28, page 685
/* Create a generic class Generic1<T> with a single method that takes an argument
* of type T. Create a second generic class Generic2<T> with a single method that 
* returns an argument of type T. Write a generic method with a contravariant 
* argument of the first generic class that calls its method. Write a second generic
* method with a covariant argument of the second class that calls its method. Test
* using the typeinfo.pets library.
*/
import java.util.*;
import typeinfo.pets.*;

public class Ex28 {
	class Generic1<T> {
		T t;
		void take(T t) { this.t = t; }
	}
	// note that generic type T in Generic1 is not the same as type T in Generic2
	class Generic2<T> {
		T t;
		T give() { return t; }
	}
	<T> void contra(Generic1<? super T> g1t, T t) {
		g1t.take(t);
	}
	<T> T co(Generic2<? extends T> g2t) {
		return g2t.give();
	}
	public static void main(String[] args) {
		Ex28 e28 = new Ex28();
		e28.contra(e28.new Generic1<Pet>(), new Cat("kitty"));
		e28.co(e28.new Generic2<Pet>());		
	}
}