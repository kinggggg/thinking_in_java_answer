// innerclasses/GreenhouseControls24.java
// TIJ4 Chapter Innerclasses, Exercise 24, page 382
/* In GreenhouseControls.java, add Event inner classes that turn fans on and
* off. Configure GreenhouseController.java to use these new Event objects.
*/
// solution includes GreenHouseController24.java

import innerclasses.controller.*;

public class GreenhouseControls24 extends Controller {
	private boolean fan = false;
	public class FanOn extends Event {
		public FanOn(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control code here to
			// physically turn on the fan.
			fan = true;
		}
		public String toString() { return "Fan is on"; }
	}
	public class FanOff extends Event {
		public FanOff(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control here to
			// physically turn off the fan.
			fan = false;
		}
		public String toString() { return "Fan is off"; }
	}
	private boolean light = false;
	public class LightOn extends Event {
		public LightOn(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control code here to
			// physically turn on the light.
			light = true;
		}
		public String toString() { return "Light is on"; }
	}
	public class LightOff extends Event {
		public LightOff(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control here to
			// physically turn off the light.
			light = false;
		}
		public String toString() { return "Light is off"; }
	}
	private boolean water = false;
	public class WaterOn extends Event {
		public WaterOn(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control code here
			water = true;
		}
		public String toString() { 
			return "Greenhouse water is on";
		} 
	}
	public class WaterOff extends Event {
		public WaterOff(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control code here
			water = false;
		}
		public String toString() {
			return "Greenhouse water is off";
		}
	}
	private String thermostat = "Day";
	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		public void action() {
			// Put hardware control code here
			thermostat = "Night";
		}
		public String toString() {
			return "Thermostat on night setting";
		}
	}
	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}	
		public void action() {
			// Put hardware control code here
			thermostat = "Day";
		}
		public String toString() {
			return "Thermostat on day setting";
		}
	}
	// An example of an action() that inserts a
	// new one of itself into the event list:
	public class Bell extends Event {
		public Bell(long delayTime) { super(delayTime); }
		public void action() {
			addEvent(new Bell(delayTime));
		}
		public String toString() { return "Bing!"; }
	}
	public class Restart extends Event {
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for(Event e : eventList)
				addEvent(e);
		}
		public void action() {
			for(Event e : eventList) {
				e.start(); // Rerun each event
				addEvent(e);
			}
			start(); // Rerun this Event
			addEvent(this);
		}
		public String toString() {
			return "Restarting system";
		}
	}
	public static class Terminate extends Event {
		public Terminate(long delayTime) { super(delayTime); }
		public void action() { System.exit(0); }
		public String toString() { return "Terminating"; }
	}
}	