// object/StorageTest.java
// TIJ4 Chapter Object, Exercise 6, page 90
// Write a program that includes and calls the storage() method defined as a
// code fragment in this chapter.

public class StorageTest {	
	public static void main(String[] args) {
		class StoreStuff {
			int storage(String s) {
				return s.length() * 2;
			}	
		}
		StoreStuff x = new StoreStuff();
		System.out.println(x.storage("hi"));		
	}
}
