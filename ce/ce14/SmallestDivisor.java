/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demmonstrates some of things that can be done with while-loop
 */


import java.util.Scanner;

public class SmallestDivisor {
	// create a Scanner object, and read in an integer number from the user.
	// call the smallestDivisor method to get the smallest divisor of this input number.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = input.nextInt();

		System.out.println("The smallest divisor for this number is: " + smallestDivisor(num));
	}
	
	// starting from 2, increase the divisor until it can evenly divide the given number.
	// and return this advisor to the main method. This divisor would be the smmallest divisor of 
	// the given number rather than 1.
	public static int smallestDivisor(int num) {
		int divisor = 2;
		while (num % divisor != 0)
			divisor++;
		
		return divisor;
	}
}
		


