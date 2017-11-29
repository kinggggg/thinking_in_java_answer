// MakeWidget.java
// TIJ4 Chapter Access, Exercise 7, page 230
/* Create the library according to the code fragments describing access and Widget.
* Create a Widget in a class that is not part of the access package.
*/

/* in access package:
* // access/Widget.java
* package access;
*
* public class Widget {
* 	public Widget() { System.out.println("Widget()"); }
* }
*/

import access.*;

public class MakeWidget {	
	public static void main(String[] args) {
		Widget w = new Widget();
	}
}