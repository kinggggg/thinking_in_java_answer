// innerclasses/Outer13.java
// TIJ4 Chapter Innerclasses, Exercise 13, page 361
/* Repeat Exercise 9 using an anonymous inner class.
* (Exercise 9: Create an interface with at least one method, and implement
* that interface by defining an inner class within a method, which returns
* a reference to your interface.) 
*/

interface Ex13Interface {
	String say(String s); 
}

public class Outer13 {	
	Ex13Interface f() {
		return new Ex13Interface() {
			public String say(String s) { return s; }
		};
	} 
	public static void main(String[] args) {
		Outer13 o = new Outer13();
		System.out.println(o.f().say("Hi"));
	}
}




