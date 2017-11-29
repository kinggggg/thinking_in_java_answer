// typeinfo/ClassInfo.java
// TIJ4 Chapter TypeInfo, Exercise 20, page 593
/* Look up the interface for java.lang.Class in the JDK decumentation from 
* http://java.sun.com. Write a program that takes the name of a class as a
* command line argument, then uses the Class methods to dump all the 
* information available for that class. Test your prgram with a standard
* library class and a class you create.
*/
import static org.greggordon.tools.Print.*;
import java.lang.reflect.*;
import java.lang.annotation.*;

public class ClassInfo {
	public static void main(String[] args) {
		if(args.length < 1) {
			println("Usage: name of class");
			System.exit(0);
		}
		Class<?> c = null;
		try {
			c = Class.forName(args[0]);
		} catch(ClassNotFoundException e) {
			println("No such class: " + e);
		}
		println("c: " + c);
		println("c.getAnnotations(): ");
		if(c.getAnnotations().length == 0) println("none");
		for(Annotation a : c.getAnnotations())
			println(a);
		println("c.getCanonicalName(): " + c.getCanonicalName());
		println("c.getClasses(): ");
		if(c.getClasses().length == 0) println("none");
		for(Class cl : c.getClasses())
			println(cl);
		println("c.getClassLoader(): " + c.getClassLoader());
		println("c.getConstructors(): ");
		if(c.getConstructors().length == 0) println("none");
		for(Constructor ctor : c.getConstructors())
			println(ctor);
		println("c.getDeclaredAnnotations(): ");
		if(c.getDeclaredAnnotations().length == 0) println("none");
		for(Annotation a : c.getDeclaredAnnotations())
			println(a);
		println("c.getDeclaredClasses(): ");
		if(c.getDeclaredClasses().length == 0) println("none");
		for(Class cl : c.getDeclaredClasses())
			println(cl);
		println("c.getDeclaredConstructors(): ");
		if(c.getDeclaredConstructors().length == 0) println("none");
		for(Constructor ctor : c.getDeclaredConstructors())
			println(ctor);
		println("c.getDeclaredFields(): ");
		if(c.getDeclaredFields().length == 0) println("none");
		for(Field f : c.getDeclaredFields())
			println(f);
		println("c.getDeclaredMethods(): ");
		if(c.getDeclaredMethods().length == 0) println("none");
		for(Method m : c.getDeclaredMethods())
			println(m);
		println("c.getDeclaringClass(): " + c.getDeclaringClass());
		println("c.getEnclosingConstructor(): " + c.getEnclosingConstructor());
		println("c.getEnclosingMethod(): " + c.getEnclosingMethod());
		println("c.getEnumConstants(): " + c.getEnumConstants());
		println("c.getDeclaredFields(): ");
		if(c.getFields().length == 0) println("none");
		for(Field f : c.getFields())
			println(f);
		println("c.getGenericInterfaces(): ");
		if(c.getGenericInterfaces().length == 0) println("none");
		for(Type t : c.getGenericInterfaces())
			println(t);
		println("c.getGenericSuperclass(): " + c.getGenericSuperclass());
		println("c.getInterfaces(): ");
		if(c.getInterfaces().length == 0) println("none");
		for(Class i : c.getInterfaces())
			println(i);
		println("c.getMethods(): ");
		if(c.getMethods().length == 0) println("none");
		for(Method m : c.getMethods())
			println(m);
		println("c.getModifiers(): " + c.getModifiers());
		println("c.getName(): " + c.getName());
		println("c.getPackage(): " + c.getPackage());
		println("c.getProtectionDomain(): " + c.getProtectionDomain());
		print("c.getSigners(): ");
		if(c.getSigners() == null)
			println(c.getSigners());
		if(c.getSigners() != null) {
			println();
			if(c.getSigners().length == 0) println("none");
			if(c.getSigners().length > 0) {
				for(Object s : c.getSigners()) 
					println(s);
			}
		}
		println("c.getSimpleName(): " + c.getSimpleName());
		println("c.getSuperclass(): " + c.getSuperclass());
		println("c.getTypeParameters(): " + c.getTypeParameters());
		println("c.isAnnotation(): " + c.isAnnotation());
		println("c.isAnnotationPresent(Documented.class): " + c.isAnnotationPresent(Documented.class));
		println("c.isAnonymousClass(): " + c.isAnonymousClass());
		println("c.isArray(): " + c.isArray());
		println("c.isAssignableFrom(ClassInfo.class): " + c.isAssignableFrom(ClassInfo.class));
		println("c.isAssignableFrom(Object.class): " + c.isAssignableFrom(Object.class));
		println("c.isEnum(): " + c.isEnum());
		println("c.isInstance(Object.class): " + c.isInstance(Object.class));
		println("c.isInterface(): " + c.isInterface());
		println("c.isLocalClass(): " + c.isLocalClass());
		println("c.isMemberClass(): " + c.isMemberClass());
		println("c.isPrimitive(): " + c.isPrimitive());
		println("c.isSynthetic(): " + c.isSynthetic());		
	}
}