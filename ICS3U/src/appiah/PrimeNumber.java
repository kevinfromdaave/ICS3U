package appiah;
import java.util.Scanner;

/**
 * PrimeNumber.java
 * This program tells the user if the number they inputted is prime
 * @author 323464446
 *
 */
public class PrimeNumber {
	/**
	 * This is the main method, it outputs the program
	 * @param args
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int x;

		//Input
		System.out.println("Please enter a number");

		x = Integer.parseInt(scan.nextLine());

		//Output
		if (isPrime(x))
			System.out.println(x + " is a prime number.");
		else
			System.out.println(x + " is not a prime number.");
	}


	/**
	 * This method returns if the number is prime to main method
	 * @param x number that is being checked
	 * @return true if the number is prime, false if it isn't
	 */
	private static boolean isPrime(int x) {
		// TODO Auto-generated method stub
		for ( int i = 2; i < x; i++){
			if (isDivisible(x, i))
				return false;

		}
		return true;
	}

	/**
	 * This method checks if the inputted number is divisible by other numbers
	 * @param x
	 * @param y
	 * @return true if the answer is 0 
	 */

	private static boolean isDivisible(int x, int y) {
		// TODO Auto-generated method stub
		if(x % y == 0)
			return true;
		else
			return false;
	}



}
