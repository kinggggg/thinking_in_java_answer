// polymorphism/Transmogrify16.java
// TIJ4 Chapter Polymorphism, Exercise 16, page 306
/* Following the example in Transmogrify.java, create a Starship class
* containing an AlertStatus reference that can indicate three different states.
* Include methods to change the states.
*/
import static org.greggordon.tools.Print.*;

class AlertStatus {
	public void alert() {}
}

class NormalAlert extends AlertStatus {
	public void alert() { println("AlertStatus Normal"); }
}  

class HighAlert extends AlertStatus {
	public void alert() { println("AlertStatus High"); }
} 

class MaximumAlert extends AlertStatus {
	public void alert() { println("AlertStatus Maximum"); }
}

class Starship {
	private AlertStatus alertStatus = new NormalAlert();
	public void normalAlert() { alertStatus = new NormalAlert(); }
	public void highAlert() { alertStatus = new HighAlert(); }
	public void maximumAlert() { alertStatus = new MaximumAlert(); }
	public void checkAlertStatus() { alertStatus.alert(); } 
}

public class Transmogrify16 {
	public static void main(String[] args) {
		Starship ss = new Starship();
		ss.checkAlertStatus();
		ss.highAlert();
		ss.checkAlertStatus();
		ss.maximumAlert();
		ss.checkAlertStatus();
		ss.normalAlert();
		ss.checkAlertStatus();
	}
}

