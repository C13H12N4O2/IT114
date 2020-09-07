/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   The program uses arrays to analyze temperatures.
 */

import java.util.*;

public class AverageTemperature {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] temps = getTempArray(console);
		double average = average(temps);
		
		System.out.println();
		System.out.println("Average temperature = " + average(temps));
		System.out.println(daysAboveAverage(temps, average) + " days above average.");

		int[] temps2 = {70, 79, 72, 75, 76, 81};
		average = average(temps2);

		System.out.println("Average temperature = " +average(temps2));
		System.out.println(daysAboveAverage(temps2, average) + " days above average.");
	}
	
	// File in the array from users' inputs.
	public static int[] getTempArray(Scanner console) {
		System.out.println("How many days' temperatures? ");
		int numDays = console.nextInt();
		int[] temps = new int[numDays];

		for (int i = 0; i < temps.length; i++) {
			System.out.print("Day " + (i + 1) + "'s high temperature: ");
			temps[i] = console.nextInt();
		}

		return temps;
	}

	// get and return the average of elemments' values in the array
	public static double average(int[] temps) {
		double sum = 0;

		for (int i = 0; i < temps.length; i++)
			sum += temps[i];

		return sum / temps.length;
	}

	// find and return the number of days with temperature above average
	public static int daysAboveAverage(int[] temps, double average) {
		int daysAbove = 0;

		for (int i = 0; i < temps.length; i++)
			if (temps[i] > average)
				daysAbove++;

		return daysAbove;
	}
}

