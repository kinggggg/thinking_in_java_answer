// initialization/AutomaticConstructor.java
// TIJ4 Chapter Initialization, Exercise 7, page 167
/* Create a class without a constructor, and then create an object of that
* class in main() to verify that the default constructor is automatically
* synthesized.
*/

class Aso {
	void bark() {System.out.println("woof");}
} 	

public class AutomaticConstructor {
	public static void main(String[] args) {
		Aso a = new Aso();
		a.bark();
	}
}