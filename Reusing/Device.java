// reusing/Device.java
// TIJ4. Chapter Reusing, Exercise 15, page 260
/* Create a class inside a package. Your class should contain a protected
* method. Outside of the package, try to call the protected method and eplain
* the results. Now inherit from your class and call the protected method from
* inside a method of your derived class.
* Solution incudes reusing/ex15/BasicDevice.java in different package:
* package reusing.ex15;
* public class BasicDevice {
*	private String s = "Original";
*	public BasicDevice() {	s = "Original"; }
*	protected void changeS(String c) { // outside package, only derived 
*		s = c;			// classes can access protected method	
*	}
*	public void showS() {
*		System.out.println(s);
*	}
* }
*/

import reusing.ex15.*;

class DeviceFail {	
	public static void main(String[] s) {
		BasicDevice fail = new BasicDevice();
		fail.showS();
		// fail.changeS("good-bye"); // cannot access protected method 	
	}
}

public class Device extends BasicDevice {
	void changeBasic(String t) {
		super.changeS(t); // calls protected method
	}	
	public static void main(String[] args) {
		Device d = new Device();
		d.showS();
		d.changeBasic("Changed"); // derived class can access protected
		d.showS();
		DeviceFail.main(args);
	}
}
