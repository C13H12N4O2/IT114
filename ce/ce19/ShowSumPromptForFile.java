/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

// This class demonstrates some of things that can be done with
// File object and Scanner object so that we can open and read in data
// from a file and do somme computations.

import java.util.*;
import java.io.*;

public class ShowSumPromptForFile {
	public static void main(String[] args) {
		// try statement in case the file does not exist..
		// ask the user to input the file name.
		// read in decimals from the file and add them up.

		try {
			System.out.println("Will add a serires of numbers from a file.");
			System.out.println();

			Scanner console = new Scanner(System.in);
			System.out.println("What is the file's name?");
			String name = console.nextLine();
			Scanner input = new Scanner(new File(name));
			System.out.println();

			double sum = 0;
			int count = 0;
			
			while (input.hasNextDouble()) {
				double next = input.nextDouble();
				count++;

				System.out.println("number " + count + " = " + next);
				sum += next;
			}

			System.out.println("The sum is: " + sum);
		}

		// catch statement.. Prompt a message if a file does not exist.
		catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
		}
	}
}
