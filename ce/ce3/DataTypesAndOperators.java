/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates different data types in Java and the Java arithmetic operators.
 */

public class DataTypesAndOperators {
	public static void main(String[] args) {
		printIntegers();
		printDoubles();
		printChars();
		doCalculates();
	}

	// print intergers
	public static void printIntegers() {
		System.out.println(55);
		System.out.println(-10);
	}

	// print deciamls
	public static void printDoubles() {
		System.out.println(3.14);
		System.out.println(-57.0);
	}

	// print characters
	public static void printChars() {
		System.out.println('c');
		System.out.println('s');
	}

	// calculate and print out the results
	public static void doCalculates() {
		int n1 = 4;
		int n2 = 5;
		int n3 = 6;

		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n3 + n1 = " + (n3 + n1));
		System.out.println("n1 * n3 = " + (n1 * n3));
		System.out.println("n3 / n1 = " + (n3 / n1));
		System.out.println("n3 % n1 = " + (n3 % n1));
		System.out.println("(n1 + n2) * n3 = " + (n1 + n2) * n3);
	}
}
