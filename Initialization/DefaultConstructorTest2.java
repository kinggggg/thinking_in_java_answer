// initialization/DefaultConstructorTest2.java
// TIJ4 Chapter Initialization, Exercise 4, page 167
/* Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.*/

class Kabayo2 {
	Kabayo2() {
		System.out.println("isa lang kabayo");
	}
	Kabayo2(String s) {
		System.out.println(s);
	}	
} 

public class DefaultConstructorTest2 {
	public static void main(String[] args) {
		Kabayo2 k = new Kabayo2();
		Kabayo2 k2 = new Kabayo2("tumutugtog ng gitara");
	}
}