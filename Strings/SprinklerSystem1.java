// strings/SprinklerSystem1.java
// TIJ4 Chapter Strings, Exercise 1, page 509
/* Analyze SprinklerSystem.toString() in reusing/SprinklerSystem.java to discover
* whether writing the toString() with an explicit StringBuilder will save any
* StringBuilder creations.
*/

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}
	public String toString() { return s; }
}

public class SprinklerSystem1 {
	private String valve1, valve2, valve3, valve4;	
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	// appears to create only one StringBuilder: (using javap -c)
	public String toString() {
		return
			"valve1 = " + valve1 + " " + 
			"valve2 = " + valve2 + " " +
			"valve3 = " + valve3 + " " +
			"valve4 = " + valve4 + " " +
			"i = " + i + " " + "f = " + f + " " +
			"source = " + source;
	}
	public static void main(String[] args) {
		SprinklerSystem1 sprinklers = new SprinklerSystem1();
		System.out.println(sprinklers);
	}
}
