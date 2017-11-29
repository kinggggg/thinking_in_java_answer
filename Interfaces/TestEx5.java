// interfaces.TestEx5.java
// TIJ4 Chapter Interfaces, Exercise 5, page 320
// Create an interface containing three methods, in its own package. Implement it
// in another package.
/* Solution includes, in package interfaces.ex5:
* package interfaces.ex5;
*
* public interface Ex5 {
*	void sayOne();
*	void sayTwo();
*	void sayThree();
* }
*/
import interfaces.ex5.*;

public class TestEx5 implements Ex5 {
	public void sayOne() { System.out.println("one"); }
	public void sayTwo() { System.out.println("two"); }
	public void sayThree() { System.out.println("three"); }
	public static void main(String[] args) {
		TestEx5 x = new TestEx5();
		x.sayOne();
		x.sayTwo();
		x.sayThree();
	}
}