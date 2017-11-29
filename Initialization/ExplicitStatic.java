// initialization/ExplicitStatic.java
// TIJ4 Chapter Initialization, Exercise 13, page 191
// Verify the statements in the previous paragraph.
import static net.mindview.util.Print.*;

class Cup {
	Cup(int marker) {
		print("Cup(" + marker + ")");
	}
	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		print("Cups()");
	}
}

public class ExplicitStatic {
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.f(99); // (1)		
	}
	static Cups cups1 = new Cups(); // (2)
	static Cups cups2 = new Cups(); // (2)
}