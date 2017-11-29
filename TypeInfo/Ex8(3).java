// typeinfo/Ex8.java
// TIJ4 Chapter Typeinfo, Exercise 8, page 562
// Write a method that takes an object and recursively prints all 
// the classes in that object's hierarchy.

class A {}

class B extends A {}

class C extends B {}

public class Ex8 {
	public static void Hierarchy(Object o) {
		if(o.getClass().getSuperclass() != null) {		
			System.out.println(o.getClass() + " is a subclass of " + 
				o.getClass().getSuperclass()); 
			try {
				Hierarchy(o.getClass().getSuperclass().newInstance());
			} catch(InstantiationException e) {
				System.out.println("Unable to instantiate obj");
			} catch(IllegalAccessException e) {
				System.out.println("Unable to access");
			}
		} 
	}		
	public static void main(String[] args) {
		Hierarchy(new C());
	}
}