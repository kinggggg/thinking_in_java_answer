// holding/NonCollectionSequence32.java
// TIJ4 Chapter Holding, Exercise 32, page 437
/* Following the example of MultiIterableClass, add reversed() and randomized() 
* methods to NonCollectionSequence.java, as well as making  NonCollectionSequence.java
* implement Iterable and show that all the approaches * work in foreach statements.
*/
import typeinfo.pets.*;
import java.util.*;
import static org.greggordon.tools.Print.*;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence32 
	extends PetSequence implements Iterable {
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			public boolean hasNext() {
				return index < pets.length;
			}	
			public Pet next() { return pets[index++]; }
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					int current = pets.length - 1;
					public boolean hasNext() {
						return current > -1;
					}
					public Pet next() {
						return pets[current--];
					}
					public void remove() {
						throw new
						UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				List<Pet> shuffled = new
				  	ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random());
				return shuffled.iterator();
			}
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence32 nc = new NonCollectionSequence32();
		print("pets: ");
		for(Pet p : nc.pets)
			print(p + " ");
		println();
		print("reversed: ");
		for(Pet p : nc.reversed())
			print(p + " ");
		println();
		print("randomized: ");
		for(Pet p : nc.randomized())
			print(p + " ");
	}
}