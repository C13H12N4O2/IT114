/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This program determines the minimum of a series of positive integers.
 */

import java.util.*;

public class Minimum {
	// creates a Scanner object, determines the number of entries and calls findMin
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many integers will you enter: ");
		int number = input.nextInt();
		int minimum = findMin(input, number);

		System.out.println(minimum + " is the minimum number you entered.");
	}

	// asks for a seris of nummbers from the user and returns the minimum
	public static int findMin(Scanner input, int num) {
		int min = Integer.MAX_VALUE; // 2^31 - 1, the larges possible value for an int

		for (int i = 1; i <= num; i++) {
		System.out.print("Please enter an integer: ");
		int value = input.nextInt();

		if (value < min) 
			min = value;
		}

		return min;
	}
}
