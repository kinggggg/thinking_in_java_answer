// holding/shape/RcdandomShapeGenerator31.java
// TIJ4 Chapter Holding, Exercise 31, page 434
/* Modify polymorphism/shape/RandomShapeGenerator.java to make it
* Iterable. You'll need to add a constructor that takes the number of
* elements that you want the iterator to produce before stopping. Verify
* that it works.
*/
/* Solution includes, in same package: 
* public class Shape {
*	public void draw() {}
*	public void erase() {}
*	public void amend() { System.out.println("Shape.amend()"); }
*	@Override public String toString() { return "Shape"; }
* }
* public class Circle extends Shape {
*	@Override public void draw() { print("Circle.draw()"); }
*	@Override public void erase() { print("Circle.erase()"); }
*	@Override public void amend() { print("Circle.amend()"); }
*	@Override public String toString() { return "Circle"; }
* }
* public class Square extends Shape {
*	@Override public void draw() { print("Square.draw()"); }
*	@Override public void erase() { print("Square.erase()"); }
*	@Override public void amend() { print("Square.amend()"); }
*	@Override public String toString() { return "Square"; }
* }
* public class Triangle extends Shape {
*	@Override public void draw() { print("Triangle.draw()"); }
*	@Override public void erase() { print("Triangle.erase()"); }
*	@Override public void amend() { print("Triangle.amend()"); }
*	@Override public String toString() { return "Triangle"; }
* }
*/
package holding.shape;
import java.util.*;

public class RandomShapeGenerator31 implements Iterable<Shape> {
	private Random rand = new Random();
	public Shape make() {		
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
	private Shape[] shapes;
	RandomShapeGenerator31(int n) {
		shapes = new Shape[n];
		for(int i = 0; i < n; i++)
			shapes[i] = make();
				 
	}
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;
			public boolean hasNext() {
				return index < shapes.length;
			}
			public Shape next() {
				return shapes[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}			
		};
	}
	public static void main(String[] args) {
		RandomShapeGenerator31 rsg = new RandomShapeGenerator31(20);
		for(Shape s : rsg)
			System.out.println(s);
	}
}
