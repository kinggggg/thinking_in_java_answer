// generics/Ex20.java
// TIJ4 Chapter Generics, Exercise 20, page 654
/* Create an interface with two methods, and a class that implements that interface
* and adds another method. In another class, create a generic method with an 
* argument type that is bounded by the interface, and show that the methods in the 
* interface are callable inside this generic method. In main(), pass an instance of
* the implementing class to the generic method.
*/

interface A {
	void f();
	void g();
}

class A3 implements A {
	public void f() { System.out.println("A3.f()"); }
	public void g() { System.out.println("A3.g()"); }
	public void h() { System.out.println("A3.h()"); }
}

class G {
	public static <T extends A> void j(T x) { 
		x.f();
		x.g();
	}
}

public class Ex20 {
	public static void main(String[] args) {
		A3 a3 = new A3();
		G.j(a3);	
	}
}