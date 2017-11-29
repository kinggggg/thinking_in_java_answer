// generics/Ex27.java
// TIJ4 Chapter Generics, Exercise 27, page 680
// Show that covariancd doesn't work with Lists using Numbers and 
// Integers, then introduce wildcards.
import java.util.*;

public class Ex27 {
	public static void main(String[] args) {
		// compile error: incompatible types:
		// List<Number> lnum = new ArrayList<Integer>();
		List<? extends Number> nlist = new ArrayList<Integer>();
		// compile error: can't add Integer:
		// nlist.add(new Integer(0));
		nlist.add(null); // can add null
		Number x = nlist.get(0); // can get Number (null)
		System.out.println(nlist);
	}	
}