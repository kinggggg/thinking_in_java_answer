// typeinfo/Finder25.java
// TIJ4 Chapter Typeinfo, Exercise 25, page 613
/* Create a class containing private, protected and package-access methods. 
* Write code to access these methods from outside of the class's package.
*/

/* Solution includes, in another package:
* package typeinfo.secret;
* public interface A {
*	void e();
* }
* // and:
* package typeinfo.secret;
* import static org.greggordon.tools.Print.*;
*
* class Secret implements A {
*	public void e() { println("public Secret.e()"); } 
*	void f() { println("package Secret.f()"); }
*	protected void g() { println("protected Secret.g()"); }
*	private void h() { println("private Secret.h()"); }
* }
*
* public class SecretMaker {
*	public static A makeSecret() { return new Secret();  }
* }
*/

import typeinfo.secret.*;
import java.lang.reflect.*;
import static org.greggordon.tools.Print.*;

public class Finder25 {
	public static void main(String[] args) throws Exception {
		A a = SecretMaker.makeSecret();
		println("a is of class type: " + a.getClass().getName());
		for(Method m : a.getClass().getDeclaredMethods()) {
			m.setAccessible(true);
			m.invoke(a);
		}
	}
}