// typeinfo/SimpleDynamicProxy23.java
// TIJ4 Chapter Typeinfo, Exercise 23, page 598
// Inside invoke() in SimpleDynamicProxy.java, try to print the proxy argument and explain
// what happens.
import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/* 
		* trying to print proxy leads to:
		* StackOverFlowError 
		* at AbstractStringBuilder.<init>(Unknown Source)
		* at StringBuilder.<init>(Unknown Source)
		* at DynamicProxyHandler.invoke(SimpleDynamicProxy23.java)
		* at $Proxy0.toString(Unknown Source)
		* at String.valueOf(Unknown Source)
		* at StrinbBuilcer.append(Unknown Source)
		* at DynamicProxyHandler.invoke(SimpleDynamicProxy23.java), etc,
		* probably due to infinite recursion because calls to toString()
		* are passed repeatedly back to this invoke method
		*/
		// System.out.println("proxy: " + proxy); // error
		System.out.println("**** proxy: " + proxy.getClass() +
			", method: " + method + ", args: " + args);
		if(args != null)
			for(Object arg : args)
				System.out.println("  " + args);
		return method.invoke(proxied, args);
	}
}

class SimpleDynamicProxy23 {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		// Insert a proxy and call again:
		Interface proxy = (Interface)Proxy.newProxyInstance(
			Interface.class.getClassLoader(),
			new Class[]{ Interface.class },
			new DynamicProxyHandler(real));
		consumer(proxy);		
	}
}