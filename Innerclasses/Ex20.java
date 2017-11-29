// innerclasses/Ex20.java
// TIJ4 Chapter Innerclasses, Exercise 20, page 367
/* Create an interface containing a nested class. Implement this interface and 
* create an instance of the nested class.
*/

interface In {
	class Nested {
		Nested() { System.out.println("Nested()"); }
		public void hi() { System.out.println("hi"); }		
	}
}

public class Ex20 implements In {
	public static void main(String[] args) {
		In.Nested in = new In.Nested();
		in.hi();				
	}
}