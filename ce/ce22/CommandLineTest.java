/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates some of things that can be done with
   command line arguments and conversation from string to other data types.
 */

import java.util.*;
import java.io.*;

public class CommandLineTest {
	public static void main(String[] args) {
		try {
			//args[0] is the filename; args[1] indicates the number of integers to read from the file

			Scanner input = new Scanner(new File(args[0]));
			int count = 0;

			//convert args[1] from a string to an integer
			while (input.hasNext() && count < Integer.parseInt(args[1])) {
				int num = Integer.parseInt(input.next());
				
				System.out.print(num + " ");
				count++;
			}

			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
		}
	}
}


