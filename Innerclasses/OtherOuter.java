// innerclasses/OtherOuter.java
// TIJ4 Chapter Innerclasses, Exercise 5, page 352
/* Create a class with an inner class. In a separate class, make an
* instance of the inner class.
*/

class Outer {
	class Inner { 
		Inner() { System.out.println("Outer.Inner()"); } 
	}	
}


public class OtherOuter { 
	public static void main(String[] args) {
		// must first create outer class object:
		Outer o = new Outer();
		// then create inner class object:
		Outer.Inner oi = o.new Inner();			
	}
}