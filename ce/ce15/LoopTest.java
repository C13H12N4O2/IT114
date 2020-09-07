/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This calldemonstrates some of things that can be done with 
   do-while loop and the hasNextInt() mmethod of the Scanner object.
 */

import java.util.*;

public class LoopTest {
	public static void main(String[] args) {
		// call ths doWhilTest method to do some experiments on throwing dices.
		doWhileTest();

		System.out.println();

		// call the getAge mmethod that get user's input of his/her age.
		getAge();
	}

	// The doWhileTest mmethod will use the do-while loop to repeatedly throw two dices
	// until their sum is 7.
	public static void doWhileTest() {
		int sum = 0;

		Random rand = new Random();

		do {
			// Roll the dice once
			// To throw a dice is equivalent to generating a random integer nummber between 1 and 6.
			int die1 = rand.nextInt(6) + 1;
			int die2 = rand.nextInt(6) + 1;

			sum = die1 + die2;

			System.out.println(die1 + " + " + die2 + " = " + sum);
		} while (sum != 7);
	}

	// getAge method will ask for user's input about his/her age and calls the getInt() method 
	public static void getAge() {
		Scanner console = new Scanner(System.in);
		int age = getInt(console, "How old are you?");

		System.out.println("You have told me your age is: " + age);
	}

	// prompts untill a valid integer is entercd
	public static int getInt(Scanner console, String prompt) {
		System.out.println(prompt);

		while (!console.hasNextInt()) {
			console.next(); // to discard the invalid input. next() accepts any string

			System.out.println("Not an integer; try again.");
			System.out.println(prompt);
		}

		return console.nextInt();
	}
}
