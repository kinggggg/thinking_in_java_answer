// innerclasses/Outer7.java
// TIJ4 Chapter Innerclasses, Exercise 7, page 354
/* Create a class with a private field and a private method. Create an
* inner class with a method that modifies the outer-class field and calls
* the outer class method. In a second outer-class method, create an object
* of the inner class and call its method, then show the effect on the
* outer-class object. 
*/

class Outer7 {
	private int oi = 1;
	private void hi() { System.out.println("Outer hi"); }
	class Inner {
		void modifyOuter() { 
			oi *= 2;
			hi(); 
		}
	}
	public void showOi() { System.out.println(oi); }
	void testInner() {
		Inner in = new Inner();
		in.modifyOuter();
	}
	public static void main(String[] args) {
		Outer7 out = new Outer7();
		out.showOi();
		out.testInner();
		out.showOi();
	}
}