// generics/GenericMethods10.java
// TIJ4 Chapter Generics, Exercise 10, page 633
// Modify the previous exercise so that one of f()'s arguments
// is non-parameterized.

public class GenericMethods10 {
	public <T, U> void f(T x, U y, Integer z) {
		System.out.println(x.getClass().getName() +
		" " + y.getClass().getName() +
		" " + z.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods10 gm = new GenericMethods10();
		gm.f("", 1, 1);
		gm.f(1.0F, 'c', 1);
	}
}