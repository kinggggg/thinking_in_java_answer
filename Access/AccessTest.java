// access/AccessTest.java
// TIJ4 Chapter Access, Exercise 5, page 227 
/* Create a class with public, private, protected and package-access fields and
* method members. Create an object of this class and see what kind of compiler
* messages you get when you try to access all the class members. Be aware that
* classes in the same directory are part of the "default" package.
*/

/* in same directory:
* package access; 
*
* public class FourWays {
*	int a = 0;
*	public int b = 1;
*	protected int c = 2;
*	private int d = 3;
*	FourWays() { System.out.println("FourWays() constructor"); }
*	void showa() { System.out.println(a); }
*	public void showb() { System.out.println(b); }
*	protected void showc() { System.out.println(c); }
*	private void showd() { System.out.println(d); }	
* }
*/

package access; // run command java access.AccessTest

public class AccessTest {
	public static void main(String[] args) {
		FourWays fw = new FourWays();
		fw.showa();
		fw.showb();
		fw.showc();
		fw.a = 10;
		fw.b = 20;
		fw.c = 30;
		fw.showa();
		fw.showb();
		fw.showc();
		//! fw.showd(); // private access, compiler can't touch
	}	
}