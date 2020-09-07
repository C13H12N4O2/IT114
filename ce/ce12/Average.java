/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class averages numbers entered by the user
 */

import java.util.*;

public class Average {
	
	// asks user for number then average them
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you have? ");
		int numberOfNumbers = console.nextInt();

		double sum = 0.0;

		for (int i = 1; i <= numberOfNumbers; i++) {
			System.out.print("     #" + i + " ? ");
			double next = console.nextDouble();
			sum += next;
		}

		if (numberOfNumbers <= 0) {
			System.out.println("No numbers to average");
		} else {
			double average = sum / numberOfNumbers;
			System.out.println("average: " + average);
		}
	}
}


