// innerclasses/GreenhouseControls25.java
// TIJ4 Chapter Innerclasses, Exercise 25, page 382
/* Inherit from GreenhouseControls in GreenhouseControls.java to add Event
* inner classes that turn water mist generators on and off. Write a new
* version of GreenhouseController.java to use these new Event objects.
*/
// solution includes GreenhouseController25.java
import innerclasses.controller.*;

public class GreenhouseControls25 extends GreenhouseControls {
	private boolean waterMist = false;
	public class WaterMistOn extends Event {
		public WaterMistOn(long delayTime) {
			super(delayTime);
		}
		public void action() {
			// Put hardware control code here to 
			// physically turn on water mist generator
			waterMist = true;
		}
		public String toString() { 
			return "Water mist generator on";  
		}
	}	
	public class WaterMistOff extends Event {
		public WaterMistOff(long delayTime) {
			super(delayTime);
		}
		public void action() {
			// Put hardware control code here to
			// physically turn off water mist generator
			waterMist = false;
		}
		public String toString() {
			return "Water mist generator off";
		}
	}	
}
