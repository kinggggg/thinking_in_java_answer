// innerclasses/Ex11.java
// TIJ4 Chapter Innerclasses, Exercise 11, page 356
/* Create a private inner class that implements a public interface.
* Write a method that returns a reference to an instance of the private
* inner class, upcast to the interface. Show that the inner class is 
* completely hidden by trying to downcast to it.
*/

/* public interface Ex11Interface {
*	void say(String s); 
* }
*/

class Test {
	private class Inner implements Ex11Interface {
		public void say(String s) {
			System.out.println(s); 
		}
	}
	Ex11Interface f() {
		return new Inner();
	}
}
public class Ex11 {	
	public static void main(String[] args) {
		Test t = new Test();
		t.f().say("hi");
		// Error: cannot find symbol: class Inner:
		// ((Inner)t.f()).say("hello");
	} 
}