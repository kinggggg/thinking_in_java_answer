// innerclasses/Ex10.java
// TIJ4 Chapter Innerclasses, Exercise 10, page 356
/* Repeat the previous exercise but define the inner class within a
* scope with scope within a method.
*/

interface Ex10Interface {
	void say(String s); 
}

public class Ex10 {	
	Ex10Interface f(boolean b) {
		if(b) {
			class Inner implements Ex10Interface {
				public void say(String s) {
					System.out.println(s); 
				}
			}
			return new Inner();
		}
		return null;
	}
	public static void main(String[] args) {
		Ex10 x = new Ex10();
		x.f(true).say("hi");
	} 
}