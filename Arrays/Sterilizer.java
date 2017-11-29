// reusing/Sterilizer.java
// TIJ4 Chapter Reusing, Exercise 2, page 243
/* Inherit a new class from class Detergent. Override scrub() and add a new method
* called sterilize().
*/
import static org.greggordon.tools.Print.*;

public class Sterilizer extends Detergent {
	public void scrub() { append(" Sterilizer.scrub()"); }
	public void sterilize() { append(" sterilize()"); }
	public static void main(String[] args) {
		Sterilizer x = new Sterilizer();
		x.dilute();
		x.apply();	
		x.scrub();
		x.foam();
		x.sterilize();
		println(x);
		println("Testing base class:");
		Detergent.main(args);
	}
}