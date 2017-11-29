// polymorphism/Ex10.java
// TIJ4 Chapter Polymorphism, Exercise 10, page 290
/* Create a base class with two methods. In the first method, call the second
* method. Inherit a class and override the second method. Create an object of
* the derived class, upcast it to the base type, and call the first method. 
* Explain what happens.
*/

class A {
	protected void f() { 
		System.out.println("A.f()");
		this.g(); 
	}
	protected void g() {
		System.out.println("A.g()"); 
	}
}

class B extends A {
	@Override protected void g() {
		System.out.println("B.g()");
	}
}

public class Ex10 {
	public static void main(String[] args) {
		B b = new B();
		// automatic upgrade to base-class to call base-class method A.f()
		// which,by polymorphism, will call the derived-class method B.g():
		b.f();
	}
}