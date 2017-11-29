// generics/Holders30.java
// TIJ4 Chapter Generics, Exercise 30, page 696
// Create a Holder for each of the primitive wrapper types, and show that
// autoboxing and autounboxing works for the set() and get() methods of 
// each instance.
import static org.greggordon.tools.Print.*;

public class Holders30 {
	public static void main(String[] args) {
		Holder<Character> charHolder = new Holder<Character>();
		Holder<Byte> byteHolder = new Holder<Byte>();
		Holder<Short> shortHolder = new Holder<Short>();
		Holder<Integer> intHolder = new Holder<Integer>();
		Holder<Long> longHolder = new Holder<Long>();
		Holder<Float> floatHolder = new Holder<Float>();
		Holder<Double> doubleHolder = new Holder<Double>();
		// Autoboxing and autounboxing work:
		charHolder.set('a');
		print(charHolder.get() + ", ");
		println(charHolder.get().getClass());
		char c = charHolder.get();
		println("char c = charHolder.get() = " + c);
		byte b = 1;
		byteHolder.set(b);
		print(byteHolder.get() + ", ");
		println(byteHolder.get().getClass());
		byte bb = byteHolder.get();
		println("byte bb = byteHolder.get() = " + bb);			
		short s = 1;
		shortHolder.set(s);
		print(shortHolder.get() + ", ");
		println(shortHolder.get().getClass());
		short ss = shortHolder.get();
		println("short ss = shortHolder.get() = " + ss);
		intHolder.set(1);
		print(intHolder.get() + ". ");
		println(intHolder.get().getClass());
		int i = intHolder.get();
		println("int i = intHolder.get() = " + i);
		long l = 2;
		longHolder.set(l);
		print(longHolder.get() + ", ");
		println(longHolder.get().getClass());
		long ll = longHolder.get();
		println("long ll = longHolder.get() = " + ll);
		float f = 1f;
		floatHolder.set(f);
		print(floatHolder.get() + ", ");
		println(floatHolder.get().getClass());
		float ff = floatHolder.get();
		println("float ff = floatHolder.get() = " + ff);
		double d = 1.1;
		doubleHolder.set(d);
		print(doubleHolder.get() + ", ");
		println(doubleHolder.get().getClass());
		double dd = doubleHolder.get();
		println("double dd = doubleHolder.get() = " + dd);		
	}		
		
}