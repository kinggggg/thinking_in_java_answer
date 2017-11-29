// polymorphism/Shapes.java
// TIJ4 Chapter Polymorphism, Exercise 2, page 286
// Add the @Override annotation to the Shapes example
/* Solution includes, in package polymorphism.shape: 
* import static net.mindview.util.Print.*;
* public class Circle extends Shape {
*	@Override public void draw() { print("Circle.draw()"); }
*	@Override public void erase() { print("Circle.erase()"); }
* }
* // and:
*import java.util.*;
* public class RandomShapeGenerator {
*	private Random rand = new Random();
*	public Shape next() {
*		switch(rand.nextInt(3)) {
*			default:
*			case 0: return new Circle();
*			case 1: return new Square();
*			case 2: return new Triangle();
*		}
*	}
* }
* // and:
* public class Shape {
*	public void draw() {}
*	public void erase() {}
* }
* // and:
* import static net.mindview.util.Print.*;
* public class Square extends Shape {
*	@Override public void draw() { print("Square.draw()"); }
*	@Override public void erase() { print("Square.erase()"); }
* }
* // and: 
* import static net.mindview.util.Print.*;
* public class Triangle extends Shape {
*	@Override public void draw() { print("Triangle.draw()"); }
*	@Override public void erase() { print("Triangle.erase()"); }
* }
*/

import polymorphism.shape.*;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[10];
		// fill up the array wth shapes:
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls:
		for(Shape shp : s)
			shp.draw();	
	}
}
