import java.util.*;

public class ValidWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int count = 0;
		int valword = 0;

		System.out.print("How many strings do you want to enter: ");
		n = scanner.nextInt();

		while (count < n) {
			System.out.print("Please enter a non-empty string: ");

			if (isValid(scanner.next()))
				valword++;

			count++;
		}

		System.out.printf("There are %d valid words in the list of entered strings.\n", valword);
	}

	public static boolean isValid(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 65 || str.charAt(i) > 122) 
				return false;
		}

		return true;
	}
}
