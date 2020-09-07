import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int guessNum = guess(scanner);

		if (guessNum == -1) 
			System.out.println("Sorry! Game Over");

		else
			System.out.printf("Great! It took you %d tries to guess the number", guessNum);
	}

	public static int guess(Scanner input) {
		int num = (int) (Math.random() * 20 + 1);
		String prompt = "Please enter an integer from 1 to 20";
		int count = 1;

		while (count <= 5) {
			int n = getInt(input, prompt);

			if (n < num) {
				System.out.println("Your input is greater than the secret number.");
				count++;
			} else if (n > num) {
				System.out.println("Your input is smaller than the secret number.");
				count++;
			} else {
				return count;
			}
		}

		return -1;
	}

	public static int getInt(Scanner input, String prompt) {
		int num;

		System.out.println(prompt);

		while (!input.hasNextInt()) {
			input.next();

			System.out.println("Not at integer. Please try again");
			System.out.println(prompt);
		}

		return input.nextInt();
	}
}
