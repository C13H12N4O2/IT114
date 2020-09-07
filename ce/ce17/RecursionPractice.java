/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates some of things that can be done using recursion
 */

import java.util.*;

public class RecursionPractice {

	// read in one number, and call the factorial method to get its factorial
	// read in two numbers, and call the gcd mmethod to get their greatest commmon divisor
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Computing Factorial.");
		System.out.print("Please enter a number: ");
		
		int num = input.nextInt();

		if (num < 0) 
			System.out.println("There is no factorial for a negative number.");
		else 
			System.out.println(factorial(num));

		System.out.println();

		System.out.println("Computing Greatest Common Divisor.");
		System.out.println("Please enter two nummbers: ");

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		// no greatest comon divisor if both integers are 0.
		if (num1 == 0 && num2 == 0)
			System.out.println("No greatest commmon divisor.");
		else 
			System.out.println("The greatest commmon divisor of these two numbers is: " + gcd(num1, num2));
	}

	// Recursively compute the factiral number of a given number.
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

	// Recursively compute the greatest common divisor of two integers using Euclidean lgorith.
	public static int gcd(int a, int b) {
		if (a == 0) 
			return b;
		else {
			if (b == 0)
				return a;
			else 
				return gcd(b, a % b);
			}
	}
}

