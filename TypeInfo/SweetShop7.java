// typeinfo/SweetShop7.java
// TIJ4 Chapter Typeinfo, Exercise 7, page 561
/* Modify SweetShop.java so that each type of object creation is controlled
* by a command-line argument. That is, if your command line is "java 
* SweetShop Candy," then only the Candy object is created. Notice how you 
* can control which Class object are loaded via the command-line argument.
*/

import static net.mindview.util.Print.*;

class Candy {
	static { print("Loading Candy"); }
}

class Gum {
	static { print("Loading Gum"); } 
}

class Cookie {
	static { print("Loading Cookie"); }
}

public class SweetShop7 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: sweetName");
			System.exit(0);
		}
		Class c = null;
		try {
			c = Class.forName(args[0]);
			print("Enjoy your " + args[0]);
		} catch(ClassNotFoundException e) {
			print("Couldn't find " + args[0]);
		}
	}
}