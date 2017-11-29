// initialization/DogTalk2.java
// TIJ4 Chapter Initialization, Exercise 6, page 167
/* Modify the previous exercise so that two of the overloaded methods have two
* arguments (of two different types), but in reverse order to each other.
* Verify that this works.
*/

class Dog {
	void bark() {System.out.println("quiet");}
	void bark(char c) {System.out.println("cawcaw");}
	void bark(byte b) {System.out.println("barkbark");}
	void bark(short s) {System.out.println("slurpslurp");}
	void bark(int i) {System.out.println("iyow");}
	void bark(long L) {System.out.println("lalala");}
	void bark(float f) {System.out.println("fififoofum");}
	void bark(double d) {System.out.println("dodo");}
	void bark(char c, int i) {System.out.println("caw-iyow");}
	void bark(int i, char c) {System.out.println("iyow-caw");}
} 	


public class DogTalk2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		d.bark();
		d.bark((char)c);
		d.bark((byte)b);
		d.bark((short)s);
		d.bark(1);
		d.bark(1L);
		d.bark(1.0f);
		d.bark(1.0);
		d.bark(c, 1);
		d.bark(1, c);
	}
}