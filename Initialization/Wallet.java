// initialization/Wallet.java
// TIJ4 Chapter Initialization, Exercise 22, page 207
/* Write a switch statement for the enum in the previous example. For each
* case, output a description of that particular currency.
*/ 

/* use enum:
* public enum Bills {
*		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
*	}
*/

public class Wallet {
	Bills b;
	public static void main(String[] args) {
		for(Bills b : Bills.values()) {
			System.out.print("Worth: ");
			switch(b) {
				case ONE: System.out.println("$1"); break; 
				case FIVE: System.out.println("$5"); break;
				case TEN: System.out.println("$10"); break;
				case TWENTY: System.out.println("$20"); break; 
				case FIFTY: System.out.println("$50"); break;
				case HUNDRED: System.out.println("$100"); break;
				default: break;
			}
		}	
	}
}