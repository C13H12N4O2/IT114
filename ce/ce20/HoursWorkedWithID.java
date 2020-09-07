/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   The program processes a file of hours worked from a file
   that lists the employeeID, the employee nam and the hours worekd.
   each on a separate line.
 */

import java.io.*;
import java.util.*;

public class HoursWorkedWithID {
	
	// Open a file and call the processLine method to read in data from each line
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("id_hours.txt"));

			while (input.hasNextLine()) {
				String line = input.nextLine();
				processLine(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist");
		}
	}

	// Processes the given String (ID, name, and hours worked (a list of decimal numbers) 
	public static void processLine(String line) {
		Scanner data = new Scanner(line);
		int id = data.nextInt();
		String name = data.next();
		double sum = 0;
		
		while (data.hasNextDouble())
			sum += data.nextDouble();

		System.out.println("Total hours worked by " + name + "(ID#" + id + ")= " + sum);
	}
}

