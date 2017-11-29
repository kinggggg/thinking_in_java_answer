// containers/Ex4.java
// TIJ4 Chapter Containers, Exercise 4, page 809
/* Create a Collection initializer that opens a file and breaks
* it into words using TextFile, and then uses the words as the
* source of data for the resulting Collection. Demonstrate that 
* it works.
*/
import java.util.*;
import net.mindview.util.*;
import static org.greggordon.tools.Print.*;

public class Ex4 {
	static Collection<String> CollectFromText(String fileName) {		
		String[] sa = TextFile.read(fileName).split(" ");
		return Arrays.asList(sa);
	}
	static Collection<String> CollectFromText2(String fileName) {		
		String[] sa = TextFile.read(fileName).split(" ");
		return new TreeSet<String>(new TextFile(fileName, "\\W+"));
	}
	public static void main(String[] args) {
		println(CollectFromText("Ex4.java"));
		println(CollectFromText2("Ex4.java"));
	}
}