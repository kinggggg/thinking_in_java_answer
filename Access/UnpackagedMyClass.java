// access/UnpackagedMyClass.java
// TIJ4 Chapter Access, Exercise 1, page 217
// Create a class in a package. Create an instance of your class outside of that package.

/* In another directory:
* // access/mypackage/MyPackagedClass.java
*
* package access.mypackage;
*
* public class MyPackagedClass {
*	public MyPackagedClass() {System.out.println("MyPackagedClass()");}
* }	
*/

public class UnpackagedMyClass {
	public static void main(String[] args) {
		access.mypackage.MyPackagedClass m = new access.mypackage.MyPackagedClass();
	}
}