// holding/Ex8.java
// TIJ4 Chapter Holding, Exercise 8, page 409
// Modify Exercise 1 so it uses an Iterator to move through the List while 
// calling hop().
import java.util.*;

class Gerbil {
	private int gerbilNumber;
	public Gerbil(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("Gerbil " + gerbilNumber + " hops");
	}
}

public class Ex8 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0; i < 10; i++)
			gerbils.add(new Gerbil(i));
		Iterator<Gerbil> it = gerbils.iterator();
		while(it.hasNext()) 
			it.next().hop();
	}
}


