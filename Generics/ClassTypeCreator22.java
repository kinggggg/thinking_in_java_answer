// generics/ClassTypeCreator22.java
// TIJ4 Chapter Generics, Exercise 22, page 667
/* Use a type tag along with reflection to create a method that uses the 
* argument version of newInstance() to create an object of a class with
* a constructor that has arguments.
*/
import java.util.*;
import java.lang.reflect.*;
import static org.greggordon.tools.Print.*;

class Building {}
class House extends Building {
	private String location;
	private Integer area;
	public House() { location = null; }
	public House(Integer area) { this.area = area; }
	public House(String location) {
		this.location = location;
	}
	public House(String location, Integer area) {
		this.location = location;
		this.area = area;
	}
	public String toString() {
		return "House" + ((location == null) ? "" :  " in " + location) +
			((area != null) ? (", "+ area + " sqft") : "");
	}
}

public class ClassTypeCreator22<T> {
	Class<?> kind;
	public ClassTypeCreator22(Class<?> kind) {
		this.kind = kind;
	}
	public Object createNew(String typename) 
		throws 	IllegalAccessException, 
			InstantiationException, 
			ClassNotFoundException {
		return Class.forName(typename).newInstance();
	}	
	/** To create instance of typename with constructors taking arguments args: */
	public Object createNew(String typename, Object... args) 
		throws 	IllegalAccessException, 
			InstantiationException, 
			ClassNotFoundException,
			NoSuchMethodException,
			InvocationTargetException {
		switch(args.length) {
		case 1 : return Class.forName(typename).getConstructor(args[0].getClass()).newInstance(args[0]);
		case 2 : return Class.forName(typename).getConstructor(args[0].getClass(), args[1].getClass()).
			newInstance(args[0], args[1]);
		}
		return null;
	}
	public static void main(String[] args) {
		ClassTypeCreator22<Building> ctcb = new ClassTypeCreator22<Building>(Building.class);
		ClassTypeCreator22<House> ctch = new ClassTypeCreator22<House>(House.class);
		try {
			Building b = (Building)ctcb.createNew("Building");
			// To show we can access and print House constructors:
			println("House constructors:");
			Constructor[] ctors = House.class.getConstructors();
			for(Constructor ctor : ctors) println(ctor);
			// create 3 new House objects:
			House h = (House)ctch.createNew("House", "Hawaii");
			House h2 = (House)ctch.createNew("House", 3000);
			House h3 = (House)ctch.createNew("House", "Manila", 5000);
			println("Constructed House objects:");
			println(h);
			println(h2);
			println(h3);
		} catch(IllegalAccessException e) {
			println("IllegalAccessException in main");
		} catch(InstantiationException e) {
			println("InstantiationException in main");
		} catch(ClassNotFoundException e) {
			println("ClassNotFoundException in main");
		} catch(NoSuchMethodException e) {
			println("NoSuchMethodException in main");
		} catch(InvocationTargetException e) {
			println("InvocationTargetException in main");
		}		
	}
}