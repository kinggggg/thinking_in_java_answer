// exceptions/Ex25.java
// TIJ4 Chapter Exceptions, Exercise 25, page 490
/* Create a three-level hierarchy of exceptions. Now create a 
* base-class A with a method that throws an exception at the base
* of your hierarchy. Inherit B from A and override the method so 
* it throws an exception at level two of your hierarchy. Repeat by
* inheriting class C from B. In main(), create a C and upcast it 
* to A, then call the method.
*/

class LevelOneException extends Exception {}
class LevelTwoException extends LevelOneException {}
class LevelThreeException extends LevelTwoException {} 

class A {
	void f() throws LevelOneException {
		throw new LevelOneException();
	}
}

class B extends A {
	void f() throws LevelTwoException {
		throw new LevelTwoException();
	}
}

class C extends B {
	void f() throws LevelThreeException {
		throw new LevelThreeException();
	}
}

public class Ex25 {
	public static void main(String[] args) {
		A a = new C();
		try {
			a.f();
		}	catch(LevelThreeException e3) {
			System.out.println("Caught e3");			
		}	catch(LevelTwoException e2) {
			System.out.println("Caught e2");
		}	catch(LevelOneException e1) {
			System.out.println("Caught e1");
		}		
	}
}