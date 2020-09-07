/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates the usage of Scanner objects.
   This class prommpts for information about a loan and computes the monthly mortgage paymment.
 */

import java.util.Scanner;	// import the Scanner class for usage

public class Mortgage {
	public static void main(String[] args) {
		// create a Scanner object
		Scanner console = new Scanner(System.in);
		
		// read in inforamtion about a loan
		System.out.println("This program computes mmonthly mortgage payments.");

		System.out.print("The client's name of this loan: ");
		String name = console.nextLine();	// get client's name

		System.out.print("Loan amount: ");
		double loan = console.nextDouble();	// get the value for loan amount

		System.out.print("Number of years: ");
		int years = console.nextInt();	// get the value for years

		System.out.print("Interest rate: ");
		double rate = console.nextDouble();	// get the value for rate

		System.out.println();

		// Compute result and report
		int months = 12 * years;
		double c = rate / 12.0 / 100.0;
		double payment = loan * c * Math.pow(1 + c, months) / (Math.pow(1 + c, months) - 1);

		System.out.println("For Client " + name + " the payment = $" + (int) payment);
	}
}
