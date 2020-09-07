/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates some of things that can be done with
   the Scanner class, the equals() method for Strings and nested if statements
 */

import java.util.*;

public class PositiveNegativeAndString {

	// Takes input and calls test positivenegative and nested if statements.
	// Test on String equality comparison
	public static void main(String[] args) {
		// test on Scanner objects and nested if statements
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		
		int number = input.nextInt();
		String description = positiveNegative(number);
		System.out.println(number + " is " + description);
		System.out.println();

		// test on String equality comparison
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "HELLO";
		String s4 = "Hello";

		System.out.println("S1 is squal to S2?: " + s1.equals(s2));
		System.out.println("S1 is squal to S3?: " + s1.equals(s3));
		System.out.println("S1 is squal to S4?: " + s1.equals(s4));
		System.out.println("S2 is squal to S3?: " + s2.equals(s3));
	}

	// returns a string that describes an integer
	public static String positiveNegative(int num) {
		String result = "";

		if (num > 0)
			result = "positive";
		else if (num < 0)
			result = "negative";
		else
			result = "zero";

		return result;
	}
}
