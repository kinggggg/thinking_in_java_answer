// reusing/JurassicEx.java
// TIJ4 Chapter Reusing, Exercise 22, page 270
// Create a final class and attempt to inherit from it.

class SmallBrain {} 

final class Dinosaur {
	SmallBrain x = new SmallBrain();
}

// class Further extends Dinosaur {} // error: cannot inherit from final Dinosaur

public class JurassicEx {
	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
	}
}
