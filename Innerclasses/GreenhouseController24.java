// innerclasses/GreenhouseController24.java
// TIJ4 Chapter Innerclasses, Exercise 24, page 382
/* In GreenhouseControls.java, add Event inner classes that turn fans on and
* off. Configure GreenhouseController.java to use these new Event objects.
*/
// use args 5000 for example
/* solution includes GreenhouseControls24.java, and, in package 
* innerclasses.controller, these two files:
* // innerclasses/controller/Controller.java
* // The reusable framework for control systems.
* package innerclasses.controller;
* import java.util.*;
*
* public class Controller {
*	// A class from java.util to hold Event objects:
*	private List<Event> eventList = new ArrayList<Event>();
*	public void addEvent(Event c) { eventList.add(c); }
*	public void run() {
*		while(eventList.size() > 0)
*			// Make a copy so you're not modifying the list
*			// while you're selecting the elements in it:
*			for(Event e : new ArrayList<Event>(eventList))
*				if(e.ready()) {
*					System.out.println(e);
*					e.action();
*					eventList.remove(e);
*				} 
*	}	
* }
* and:
* // innerclasses/controller/Event.java
* // The common methods for any control event.
* package innerclasses.controller;
*
* public abstract class Event {
*	private long eventTime;
*	protected final long delayTime;
*	public Event(long delayTime) {
*		this.delayTime = delayTime;
*		start();
*	}
*	public void start() { // Allows restarting
*	}
*	public boolean ready() {
*		return System.nanoTime() >= eventTime;
*	}
*	public abstract void action();
* }
*/


import innerclasses.controller.*;

public class GreenhouseController24 {
	public static void main(String[] args) {
		GreenhouseControls24 gc = new GreenhouseControls24();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new FanOn(300),
			gc.new LightOff(400),
			gc.new FanOff(500),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400),
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)
			gc.addEvent(
				new GreenhouseControls24.Terminate(
					new Integer(args[0])));
		gc.run();
	}
}
