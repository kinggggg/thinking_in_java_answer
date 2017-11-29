// innerclasses/Ex15.java
// TIJ4 Chapter Innerclasses, Exercise 15, page361
/* Create a class with a non-default constructor and no default constructor.
* Create a second class that has a method that returns a reference to an
* object of the first class. Create the object that you return by making an
* anonymous inner class that inherits from the first class. 
*/

class One {
	private String s;
	One(String s) { this.s = s; } 
	public String showS() { return s; }
}

public class Ex15 {
	public One makeOne(String s) {
		return new One(s) { };
	}
	public static void main(String[] args) {
		Ex15 x = new Ex15();
		System.out.println(x.makeOne("hi").showS());
	}
}