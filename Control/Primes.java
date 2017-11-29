// control/Primes.java
// TIJ4 Chapter Control, Exercise 4, page 139
// Write a program that uses two nested for loops and the modulus operator (%)
// to detect and print prime numbers.

public class Primes {
	public static void main(String[] args) {
		for(int i = 1; i < 1000; i++ ) {
			int factors = 0;
			for(int j = 1; j < (i + 2)/2; j++ ) {
				if((i % j) == 0) factors++; 			
			}
			if(factors < 2) System.out.println(i + " is prime");
		}
	}
}