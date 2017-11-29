// initialization/BankTest.java
// TIJ4 Chapter Initialization, Exercise 11, page 177
// Modify the previous exercise so that finalize() will always be called.


class WebBank {
	boolean loggedIn = false;
	WebBank(boolean logStatus) {
		loggedIn = logStatus;
	}
	void logOut() {
		loggedIn = false;
	}
	protected void finalize() {
		if(loggedIn)
			System.out.println("Error: still logged in");
		// Normally, you'll also call the base-class version:
		// super.finalize(); 
	}
}

public class BankTest {
	public static void main(String[] args) {
		WebBank bank1 = new WebBank(true);
		WebBank bank2 = new WebBank(true);
		new WebBank(true);
		// Proper cleanup: log out of bank1 before going home:
		bank1.logOut();
		// Forget to logout of bank2 and unnamed new bank
		// Attempts to finalize any missed banks:
		System.out.println("Try 1: "); 
		System.runFinalization();
		System.out.println("Try 2: "); 	
		Runtime.getRuntime().runFinalization();
		System.out.println("Try 3: "); 
		System.gc();
		System.out.println("Try 4: ");
		// using deprecated since 1.1 method:
		System.runFinalizersOnExit(true);		
	}	
}