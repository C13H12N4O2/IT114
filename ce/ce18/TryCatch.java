/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

// This class demonstrates somme of things that canbe done with
// File object. Throws clause and try/catch statement.

import java.io.*;
import java.util.Scanner;

public class TryCatch {
	// call the readFile mmethod. Catch the exception if thrown.
	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println("Not such a file.");
		}
	}

	// Create a Scanner object to get data from a file. Throw an exception if that file does not exist.
	public static void readFile() throws FileNotFoundException {
		String filename = "foo.txt";
		Scanner input = new Scanner(new File(filename));
		
		System.out.println("Created Scanner object on " + filename);
	}
}
