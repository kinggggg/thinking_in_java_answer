// containers/Ex2.java
// TIJ4 Chapter Containers, Exercise 2, page 809
// Produce a Map and a Set containing all the countries that begin
// with 'A'.
import java.util.*;
import java.util.regex.*;
import net.mindview.util.*;
import static org.greggordon.tools.Print.*;

public class Ex2 {
	public static void main(String[] args) {
		Map<String,String> hm = new HashMap<String,String>();
		Set<String> hs = hm.keySet();
		Pattern p = Pattern.compile("A[a-zA-Z]*");
		for(int i = 0; i < Countries.DATA.length; i++) {
			if(p.matcher(Countries.DATA[i][0]).matches())
				hm.put(Countries.DATA[i][0], Countries.DATA[i][1]);
		}
		println(hm);	
		println(hs);	
	}
}