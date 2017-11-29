// holding/Queue27.java
// TIJ4 Chapter Holding, Exercise 27, page 424
/* Write a class called Command that contains a String and has a method operation()
* that displays the String. Write a second class with a method that fills a Queue
* with Command objects and returns it. Pass the filled Queue to a method in a third
* class that consumes the objects in the Queue and calls their operation() methods.
*/
import java.util.*;

class Command {
	String s;
	Command(String s) { this.s = s; }
	void operation() { System.out.print(s); }
}

class Build {	
	Queue<Command> makeQ() {
		Queue<Command> q = new LinkedList<Command>();
		for(int i = 0; i < 10; i++)
			q.offer(new Command(i + " "));
		return q;
	}
}

public class Queue27 {
	public static void commandEater(Queue<Command> qc) {
		while(qc.peek() != null)
			qc.poll().operation();
	}
	public static void main(String[] args) {
		Build b = new Build();
		commandEater(b.makeQ());	
	}
}