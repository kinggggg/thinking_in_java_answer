// typeinfo/Shapes6.java
// TIJ4 Chapter Typeinfo, Exercise 6, page 561
/* Modify Shapes.java so that it can "highlight" (set a flag in)
* all shapes of a particular type.  The toString() method for each 
* derived Shape should indicate whether that Shape is "highlighted."
*/
import java.util.*;

abstract class Shape {
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Circle extends Shape {
	boolean flag = false;
	public String toString() { 
		return (flag ? "H" : "Unh") + "ighlighted " + "Circle"; 
	}
}

class Square extends Shape {
	boolean flag = false;
	public String toString() { 
		return (flag ? "H" : "Unh") + "ighlighted " + "Square"; 
	}
}

class Triangle extends Shape {
	boolean flag = false;
	public String toString() { 
		return (flag ? "H" : "Unh") + "ighlighted " + "Triangle"; 
	}
}

public class Shapes6 {
	public static void setFlag(Shape s) {
			if(s instanceof Triangle)
				((Triangle)s).flag = true; 
		}			
	public static void main(String[] args) {
		// upcasting to Shape:
		List<Shape> shapeList = Arrays.asList(
			new Circle(), new Square(), new Triangle()
		);
		for(Shape shape : shapeList) {
			setFlag(shape);
			System.out.println(shape);
		}
	}
}