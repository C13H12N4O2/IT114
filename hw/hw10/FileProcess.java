import java.util.*;
import java.io.*;

public class FileProcess {
	public static void main(String[] args) {
		String filename = "./bigFile.txt";
		File inputfile = new File(filename);

		try {
			Scanner file = new Scanner(inputfile);
			statistics(file);
		
			Scanner input = new Scanner(System.in);
			int n;
			
			System.out.println();
			System.out.printf("Please input a number for search: ");
			n = input.nextInt();
			System.out.println();

			file = new Scanner(inputfile);

			if (search(file, n))
				System.out.printf("%d exists in the file.\n", n);
			else 
				System.out.printf("%d does not exist in the file.\n", n);
		} catch (Exception e) {
			System.out.printf("Something went wrong\n");
		}
	}

	public static void statistics(Scanner input) {
		int total = 0;
		int non_negtv = 0;
		int negtv = 0;
		double non_percent;
		double percent;

		
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				total++;

				if (input.nextInt() >= 0) {
					non_negtv++;
				} else {
					negtv++;
				}
			}
		}

		non_percent = (double) non_negtv / (double) total * 100;
		percent = (double) negtv / (double) total * 100;

		System.out.printf("There are totally %d nummbers in the file.\n", total);
		System.out.printf("There are %d non-negative numbers (%.14f%c).\n", non_negtv, non_percent, '%');
		System.out.printf("There are %d negative numbers (%.15f%c).\n", negtv, percent, '%'); 
	}

	public static boolean search(Scanner input, int n) {
		while (input.hasNext()) {
			if (input.hasNextInt())
				if (input.nextInt() == n) 
					return true;
		}

		return false;
	}
}
