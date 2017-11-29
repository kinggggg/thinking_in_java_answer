// generics/Ex25.java
// TIJ4 Chapter Generics, Exercise 25, page 677
/* Create two interfaces and a class that implements both. Create two
* generic methods, one whose argument parameter is bounded by the first
* interface and one whose argument parameter is bounded by the second
* interface. Create an instance of the class that implements both 
* interfaces, and show that it can be used with both generic methods.
*/

interface A {}

interface B {} 

class C implements A, B {
	public String toString() { return "C"; }
}

public class Ex25 {
	<T extends A> void a(T t) { System.out.println("a(" + t + ")"); }
	<T extends B> void b(T t) { System.out.println("b(" + t + ")"); }
	public static void main(String[] args) {
		C c = new C();
		Ex25 ex = new Ex25();
		ex.a(c);
		ex.b(c);
	}
}