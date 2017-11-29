// initialization/DefaultConstructorTest.java
// TIJ4 Chapter Initialization, Exercise 2, page 167
/* Create a class with a default constructor (one that takes no arguments) that
* prints a message. Create an object of this class.
*/

class Kabayo {
	 Kabayo() {
		System.out.println("isa lang kabayo");
	}
} 

public class DefaultConstructorTest {
	public static void main(String[] args) {
		Kabayo k = new Kabayo();
	}
}