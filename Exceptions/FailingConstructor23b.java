// exceptions/FailingConstructor23b.java
// TIJ4 Chapter Exceptions, Exercise 23, page 489
/* Add a class with a dispose() method to the previous exercise. Modify 
* FailingConstructor so that the constructor creates one of these disposable objects 
* as a member object, after which the constructor might throw and exception, after 
* which it creates a second disposable member object. Write code to properly guard 
* against failure, and in main() verify that all possible failure situations are covered. 
*/
import static org.greggordon.tools.Print.*;
import java.io.*;

class NeedsCleanup { 
	private static long counter = 1;	
	private final long id = counter++;
	public void dispose() {
		System.out.println("NeedsCleanup " + id + " disposed");
	}			
}

public class FailingConstructor23b {
	private BufferedReader in;
	NeedsCleanup nc1;
	NeedsCleanup nc2;
	public FailingConstructor23b(String fname) throws Exception {
		nc1 = new NeedsCleanup();
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch(FileNotFoundException e) {
			System.out.println("Could not find file " + fname);
			throw e;
		} catch(Exception e) {
			try {
				in.close();
			} catch(IOException e2) {
				System.out.println("in.close() failed");
			}
			throw e;
		}
		nc2 = new NeedsCleanup();
	}
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch(IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public static void main(String[] args) {
		try {
			FailingConstructor23b fc = 
				new FailingConstructor23b("AlwaysFinally.java");
			try {
				String s;
				int i = 1;
				while((s = fc.getLine()) != null) {
					// code to print to new file:
					// println(i + " " + s);
					// i++;
				}
			} catch(Exception e) {
				System.out.println("Exception caught in main()");
				e.printStackTrace(System.err);
			} finally {
				fc.nc1.dispose();
				fc.nc2.dispose();
			}
		} catch(Exception e) {
			System.out.println("FailingConstructor23b construction failed");
		}
	}
}

