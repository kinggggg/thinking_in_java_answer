// exceptions/FailingConstructor22b.java
// TIJ4 Chapter Exceptions, Exercise 22 page 488
/* Create a class called FailingConstructor with a constructor that might fail
* partway through the construction process and throw an exception. In main(), 
* write code that properly guards against this failure.
*/
// Solution modeled from examples in text:
import java.io.*;

public class FailingConstructor22b {
	private BufferedReader in;
	public FailingConstructor22b(String fname) throws Exception {
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
			FailingConstructor22b fc = 
				new FailingConstructor22b("AlwaysFinally.java");
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
			} 
		} catch(Exception e) {
			System.out.println("FailingConstructor22b construction failed");
		}
	}
}






		
			