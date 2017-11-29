// holding/Controller13.java
// TIJ4 Chapter Holding, Exercise 13, page 412
/* In the innerclasses/GreenhouseController.java example, the class
* Controller uses an ArrayList. Change the code to use a LinkedList
* instead, and use an Iterator to cycle through the set of events.
*/
import java.util.*;

public class Controller13 {
	// A class from java.util to hold Event objects:
	private LinkedList<Event> eventList = new LinkedList<Event>();
	public void addEvent(Event c) { eventList.add(c); }		
	public void run() {		
		LinkedList<Event> eventListCopy = 
			new LinkedList<Event>(eventList);
		ListIterator<Event> it 
			= eventListCopy.listIterator();
		while(it.hasNext()) {	
			it.next().action();
			it.previous();		
			System.out.println(it.next());		
		}
	}	
}