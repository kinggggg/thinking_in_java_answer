// operators/DogCompare.java
// TIJ4 Chapter Operators, Exercise 6, page 105
/* Create a class called Dog containing two Strings: name and says.
* Following exercise 5, create a new Dog reference and assign it to spot's
* object. Test for comparison using == and equals() for all references.
*/

import org.greggordon.tools.*;

class Dog {
	String name;
	String says;
	void setName(String n) {
		name = n;
	}
	void setSays(String s) {
		says = s;
	}
	void showName() {
		P.rintln(name);
	}
	void speak() {
		P.rintln(says);
	}
}

public class DogCompare {
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.setName("Spot");
		spot.setSays("Ruff!");
		Dog scruffy = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		spot.showName();
		spot.speak();
		scruffy.showName(); 
		scruffy.speak();
		Dog butch = new Dog();
		butch.setName("Butch");
		butch.setSays("Hello!");
		butch.showName();
		butch.speak();
		P.rintln("Comparison: ");
		P.rintln("spot == butch: " + (spot == butch));
		P.rintln("spot.equals(butch): " + spot.equals(butch));
		P.rintln("butch.equals(spot): " + butch.equals(spot));
		P.rintln("Now assign: spot = butch");
		spot = butch;
		P.rintln("Compare again: ");
		P.rintln("spot == butch: " + (spot == butch));
		P.rintln("spot.equals(butch): " + spot.equals(butch));
		P.rintln("butch.equals(spot): " + butch.equals(spot));
		P.rintln("Spot: ");
		spot.showName();
		spot.speak();
		P.rintln("Butch: ");
		butch.showName();
		butch.speak();
			
	}
}