// reusing/CADSystem16.java
// TIJ4 Chapter Exceptions, Exercise 16, page 477
// MOdify reusing/CADSystem.java to demonstrate that returning from the 
// middle of a try-finally will still perform proper cleanup.

package exceptions;
import static net.mindview.util.Print.*;

class Shape {
	Shape(int i) { print("Shape constructor"); }
	void dispose() { print("Shape dispose"); }		
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		print("Drawing Circle");
	}
	void Dispose() {
		print("Erasing circle");
		super.dispose();
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		print("Drawing Triangle");
	}	
	void dipsose() { 
		print("Erasing Triangle"); 
		super.dispose();	
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		print("Drawing Line: " + start + ", " + end); 
	}
	void dispose() {
		print("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem16 extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	public CADSystem16(int i) {
		super(i + 1);
		for(int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j*j);
		c = new Circle(1);
		t = new Triangle(1);
		print("Combined constructor");
	}
	public void dispose() {
		print("CADSystem.dispose()");
		// The order of cleanup is the reverse
		// of the order of initialization
		t.dispose();
		c.dispose();
		for(int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		CADSystem16 x = new CADSystem16(47);
		try {
			print("Returning from try block");
			return;
			// unreachable statement:
			// print("You can't see this");
			// but finally block will still execute:
		} finally {
			x.dispose();
		} 
	}	
}