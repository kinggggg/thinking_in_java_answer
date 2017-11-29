// reusing/Frog17.java
// TIJ4, Chapter Reusing, Exercise 17, page 262
/* Modify Exercise 16 so that Frog overrides the method definitions from 
* the base class (provides new definitions using the same method 
* signatures). Note what happesn in main(). 
* ( Exersice 16:Create a class called Amphibian. From this, inherit a class
* called Frog. Put appropriate methods in the base class. In main(), create a
* Frog and upcast it to Amphibian, and demonstrate that all the methods still 
* work.)
*/
import static org.greggordon.tools.Print.*;

class Amphibian {
	protected void swim() {
		println("Amphibian swim");		
	}
	protected void speak() {
		println("Amphibian speak");
	}
	void eat() {
		println("Amphibian eat");
	}
	static void grow(Amphibian a) {
		println("Amphibian grow");
		a.eat();
	}
}

public class Frog17 extends Amphibian {
	@Override protected void swim() {
		println("Frog swim");		
	}
	@Override protected void speak() {
		println("Frog speak");
	}
	@Override void eat() {
		println("Frog eat");
	}
	static void grow(Amphibian a) {
		println("Frog grow");
		a.eat();
	}
	public static void main(String[] args) {
		Frog17 f = new Frog17();
		// call overridden base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// upcast Frog17 to Amphibian argument:
		f.grow(f);
		// upcast Frog17 to Amphibian and call Amphibian method:
		Amphibian.grow(f);
	}
}