//: operators/CoinToss.java
// TIJ4 Chapter Operators, Exercise 7, page 106
// Write a program that simulates coin-flipping

import java.util.*; 
import org.greggordon.tools.*;

public class CoinToss {
	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt();
		if(coin % 2 == 0) P.rintln("heads");
		else P.rintln("tails");		
	}
}