// typeinfo/SimpleProxyDemo21.java
// TIJ4 Chapter Typeinfo, Exercise 21, page 598
// Modify SimpleProxyDemo.java so that it measures method-call times.
import static net.mindview.util.Print.*;
import java.util.*;

interface Interface {
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() { print("doSomething"); }
	public void somethingElse(String arg) {
		print("somethingElse " + arg);
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;
	private static int doCount = 0;
	private static int sECount = 0;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() { 
		long timeIn = new Date().getTime();
		print("Time called doSomething() " + doCount + ": " + timeIn + " msecs");
		print("on " + new Date());
		doCount++;
		proxied.doSomething();
		print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
	}
	public void somethingElse(String arg) {
		long timeIn = new Date().getTime();
		print("Time called somethingElse() " + sECount + ": " + timeIn + " msecs");
		print("on " + new Date());
		sECount++;
		proxied.somethingElse(arg);
		print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
	}
}

class SimpleProxyDemo21 {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		print();
		consumer(new SimpleProxy(new RealObject()));
		print();
		consumer(new SimpleProxy(new RealObject()));
		print();
		consumer(new SimpleProxy(new RealObject()));					
	}
}