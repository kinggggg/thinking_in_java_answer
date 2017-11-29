// containers/Ex7.java
// TIJ4 Chapter Containers, Exercise 7, page 820
/* Create both an ArrayList and a LinkedList, and fill each using the
*  Countries.names() generator. Print each list using an ordinary 
* iterator, then insert one list into the other by using a ListIterator, 
* inserting at every other location. Now perform the insertion staring
* at the end of the first list and moving backwards.
*/
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class Ex7 {	
	@SuppressWarnings("unchecked")	
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>(Countries.names(25));
		List<String> ll = new LinkedList<String>(Countries.names(25));
		print(al);
		print(ll);		
		Iterator alit = al.iterator();
		Iterator llit = ll.iterator();
		while(alit.hasNext()) {
			printnb(alit.next() + (alit.hasNext() ? ", " : ""));
		}
		print();
		while(llit.hasNext()) {
			printnb(llit.next() + (llit.hasNext() ? ", " : ""));
		}
		print();
		print();
		ListIterator allit = al.listIterator();
		ListIterator lllit = ll.listIterator();		
		while(lllit.hasNext()) {			
			allit.add((String)lllit.next());
			allit.next();
		}
		print(al);
		print();
		List<String> al2 = new ArrayList<String>(Countries.names(25));
		ListIterator allit2 = al2.listIterator();
		while(lllit.hasPrevious()) lllit.previous();
		while(allit2.hasNext()) allit2.next();
		while(lllit.hasNext()) {
			allit2.add((String)lllit.next());
			allit2.previous();
			allit2.previous();
		}
		print(al2);
	}
}