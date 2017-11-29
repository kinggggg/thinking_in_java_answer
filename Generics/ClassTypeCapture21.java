// generics/ClassTypeCapture21.java
// TIJ4 Chapter Generics, Exercise 21, page 663
/* Modify ClassTypeCapture.java by adding a Map<String,Class<?>>,
* a method addType(String typename, Class<?> kind), and a
* method createNew(String typename). creatNew() will either
* produce a new instance of the class associated with its 
* argument string, or produce an error message.
*/
import java.util.*;
import static org.greggordon.tools.Print.*;

class Building {}
class House extends Building {}

public class ClassTypeCapture21<T> {
	Class<?> kind;
	Map<String,Class<?>> map;
	public ClassTypeCapture21(Class<?> kind) {
		this.kind = kind;
	}
	public ClassTypeCapture21(Class<?> kind, Map<String,Class<?>> map) {
		this.kind = kind;
		this.map = map;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	public void addType(String typename, Class<?> kind) {
		map.put(typename, kind);
	}
	public Object createNew(String typename) 
		throws IllegalAccessException, InstantiationException {
		if(map.containsKey(typename))
			return map.get(typename).newInstance();			
		System.out.println(typename + " class not available");
		return null;
	}
	public static void main(String[] args) {
		ClassTypeCapture21<Building> ctt1 = new ClassTypeCapture21<Building>(Building.class);
		println(ctt1.f(new Building()));
		println(ctt1.f(new House()));
		ClassTypeCapture21<House> ctt2 = new ClassTypeCapture21<House>(House.class);
		println(ctt2.f(new Building()));
		println(ctt2.f(new House()));
		ClassTypeCapture21<Building> ct = 
		new ClassTypeCapture21<Building>(Building.class, new HashMap<String, Class<?>>());
		ct.addType("House", House.class);
		ct.addType("Building", Building.class);
		println("ct.map = " + ct.map);
		try {
			Building b = (Building)ct.createNew("Building");
			House h = (House)ct.createNew("House");
			print("b.getClass().getName(): ");
			println(b.getClass().getName());
			print("h.getClass().getName(): ");
			println(h.getClass().getName());
			print("House h is instance House: ");
			println(h instanceof House);
			print("House h is instance of Building: ");
			println(h instanceof Building);
			print("Building b is instance of House: ");
			println(b instanceof House);
			ct.createNew("String");  // String class not available
		} catch(IllegalAccessException e) {
			println("IllegalAccessException in main");
		} catch(InstantiationException e) {
			println("InstantiationException in main");
		}		
	}
}