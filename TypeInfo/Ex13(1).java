// typeinfo/Ex13.java
// TIJ4 Chapter Typeinfo, Exercise 13, page 582
// Use TypeCounter with the RegisteredFactories.java class in this chapter.
import net.mindview.util.*;
import static net.mindview.util.Print.*;
import java.util.*;

public class Ex13 {
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Part.class);
		List<Part> partList = new ArrayList<Part>();
		for(int i = 0; i < 20; i++)		
			partList.add(Part.createRandom());
		for(Part part : partList) {
			printnb(part.getClass().getSimpleName() + " ");
			counter.count(part);
		}
		print();
		print(counter);
	}
}