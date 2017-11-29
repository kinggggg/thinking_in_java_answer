// typeinfo/Shapes3.java
// TIJ4 Chapter Typeinfo, Exercise 3, page 561
/* Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape,
* then downcast it back to a Rhomboid. Try downcasting to a Circle and
* see what happens.'
*/
import java.util.*;

abstract class Shape {
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() { return "Circle"; }
}

class Square extends Shape {
	public String toString() { return "Square"; }
}

class Triangle extends Shape {
	public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
	public String toString() { return "Rhomboid"; }
}

public class Shapes3 {
	public static void main(String[] args) {
		// upcasting to Shape:
		List<Shape> shapeList = Arrays.asList(
			new Circle(), new Square(), new Triangle(), new Rhomboid()
		);
		// downcasting back to specific shape:
		for(Shape shape : shapeList)
			shape.draw();
		Rhomboid r = new Rhomboid();
		((Shape)r).draw();
		// inconvertible types:
		// ((Circle)r).draw();
	}
}