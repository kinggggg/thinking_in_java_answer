// arrays/ContainerComparison15.java
// TIJ4 Chapter Arrays, Exercise 15, page 775
// Modify ContainerComparison.java by creating a Generator for 
// BerylliumSphere, and change main() to use that Generator
// with Generated.array().
import net.mindview.util.*;
import java.util.*;
import static net.mindview.util.Print.*;

class BerylliumSphereGenerator implements Generator<BerylliumSphere> {
	public BerylliumSphere next() {
		return new BerylliumSphere();
	}		
}

public class ContainerComparison15 {
	public static void main(String[] args) {
		BerylliumSphere[] spheres = new BerylliumSphere[5];
		BerylliumSphereGenerator bsg = new BerylliumSphereGenerator();
		Generated.array(spheres, bsg);
		print(Arrays.toString(spheres));
		print(spheres[4]);
		List<BerylliumSphere> sphereList =
			new ArrayList<BerylliumSphere>();
		for(int i = 0; i < 5; i++)
			sphereList.add(bsg.next());
		print(sphereList);
		print(sphereList.get(4));
	}
}