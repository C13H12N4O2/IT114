/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demmonstrates a method that returns avlue
   and give and example of overloading
 */

public class ShowInterest {
	// drive for the class, print interest for different values

	public static void main (String[] args) {
		double balance = 1000;
		System.out.println("The balance is " + balance);
		balance += interest(balance);
		System.out.println("The balance is now " + balance);
		System.out.println("Now the balance is " + (balance + interest(balance, 6)));
	}

	// calculates an interest of 5 percent
	public static double interest(double value) {
		return value * .05;
	}

	// calculates an interest when given the interest as a parameter
	public static double interest(double value, int percent) {
		return value * percent / 100;
	}
}
