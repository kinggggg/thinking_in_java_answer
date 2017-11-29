// innerclasses/Ex9.java
// TIJ4 Chapter Innerclasses, Exercise 9, page 356
/* Create an interface with at least one method, and implement that
* interface by defining an inner class within a method, which returns a
* reference to your interface.
*/

interface Ex9Interface {
	void say(String s); 
}

public class Ex9 {	
	Ex9Interface f() {
		class Inner implements Ex9Interface {
			public void say(String s) {
				System.out.println(s); 
			}
		}
		return new Inner();
	}
	public static void main(String[] args) {
		Ex9 x = new Ex9();
		x.f().say("hi");
	} 
}