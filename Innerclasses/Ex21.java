// innerclasses/Ex21.java
// TIJ4 Chapter Innerclasses, Exercise 21, page 367
/* Create an interface that contains a nested class that has a static method that
* calls the methods of your interface and displays the results. Implement your
* interface and pass an instance of your implementation to the method. 
*/

interface In {
	String f();
	String g(); 
	class Nested {
		static void testIn(In i) { 
			System.out.println(i.f() + i.g());
		}		
	}		
}

public class Ex21 implements In {
	public String f() { return "hello "; }
	public String g() { return "friend"; }
	public static void main(String[] args) {
		Ex21 x = new Ex21();
		In.Nested.testIn(x);						
	}
}