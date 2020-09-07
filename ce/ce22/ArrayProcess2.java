/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demmonstrates some of things that can be done with
   Array class
 */

import java.util.*;

public class ArrayProcess2 {
	// Conduct various operations on Arrays
	public static void main(String[] args) {
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		System.out.println(weekDays);
		System.out.println(Arrays.toString(weekDays));

		String[] weekEnds = Arrays.copyOfRange(weekDays, 5, 7);

		System.out.println(Arrays.toString(weekEnds));

		System.out.println();

		int[] numbers1 = {5, 4, 3, 2, 1};

		System.out.println(numbers1);
		printArray(numbers1);
		System.out.println(Arrays.toString(numbers1));

		int[] numbers2 = Arrays.copyOf(numbers1, 10);

		System.out.println(Arrays.toString(numbers2));
		Arrays.sort(numbers1);

		int[] numbers3 = {1, 2, 3, 4, 5};

		if (numbers1 == numbers3) 
			System.out.println(numbers1 + " equals " + numbers3);
		else 
			System.out.println(numbers1 + " does not equal " + numbers3);

		if (Arrays.equals(numbers1, numbers3))
			System.out.println(Arrays.toString(numbers1) + " equals " + Arrays.toString(numbers3));
		else
			System.out.println(Arrays.toString(numbers1) + " does not equal " + Arrays.toString(numbers3));
	}

	// Print the value of all elements on an integer array using for-each loop
	public static void printArray(int[] a) {
		for (int num:a)
			System.out.print(num + " ");

		System.out.println();
	}
}
