// reusing/FinalOverridingIllusionEx.java
// TIJ4 Chapter Reusing, Exercise 20, page 269
// Show that the @Override annotation solves the problem in ths section
import static net.mindview.util.Print.*;

class WithFinals {
	// Identical to private alone:
	private final void f() { print("WithFinals.f()"); }
	// Also automatically "final":
	private void g() { print("WithFinals.g()"); }
} 

class OverridingPrivate extends WithFinals {
	// attempt to override:
	private final void f() { print("OverridingPrivate.f()"); }
	private void g() { print("OverridingPrivate.g()"); }
	// @Override: compiler finds error - does NOT override
	// @Override private final void f() { print("OverridingPrivate.f()"); }
	// @Override private void g() { print("OverridingPrivate.g()"); }
}

class OverridingPrivate2 extends OverridingPrivate {
	// attempt to override:
	public final void f() { print("OverridingPrivate2.f()"); }
	public void g() { print("OverridingPrivate2.g()"); }
	// use @Override so compiler with say "does NOT override or implement"
	// @Override public final void f() { print("OverridingPrivate2.f()"); }
	// @Override public void g() { print("OverridingPrivate2.g()"); }
}

public class FinalOverridingIllusionEx {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods:
		//! op.f(); // f() has private access in OverridingPrivate
		//! op.f();
		// Same here:
		WithFinals wf = op2;
		//! wf.f(); // f() has private access in WithFinals
		//! wf.g();
	}
}
