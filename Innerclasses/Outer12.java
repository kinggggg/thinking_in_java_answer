// innerclasses/Outer12.java
// TIJ4 Chapter Innerclasses, Exercise 12, page 361
/* Repeat Exercise 7 using an anonymous inner class.
* (Exercise 7: Create a class with a private field and a private method. 
* Create an inner class with a method that modifies the outer-class field  * and calls the outer class method. In a second outer-class method, create
* an object of the inner class and call its method, then show the effect on
* the outer-class object.) 
*/

interface Inner12 {
	void modifyOuter();
}

public class Outer12 {
	private int oi = 1;
	private void hi() { System.out.println("Outer hi"); }
	public Inner12 inner() {
		return new Inner12() {
			public void modifyOuter() { 
				oi *= 2;
				hi(); 
			}
		}; 
	}
	public void showOi() { System.out.println(oi); }
	public static void main(String[] args) {
		Outer12 out = new Outer12();
		out.showOi();
		out.inner().modifyOuter();
		out.showOi();
	}
}




