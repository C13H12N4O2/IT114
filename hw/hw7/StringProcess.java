import java.util.*;

public class StringProcess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ecount = 0;
		int scount = 0;
		int max = 0;
		int min = 9999;

		System.out.print("How many strings do you want to enter: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Please enter a non-empty string: ");
			String str = scanner.next();

			if (containLetters(str, 'e'))
				ecount++;

			if (containLetters(str, 's'))
				scount++;

			if (max < str.length())
				max = str.length();

			if (min > str.length())
				min = str.length();
		}

		System.out.printf("There are %d strings that contains two or more 'e's\n", ecount);
		System.out.printf("There are %d strings that contains two or more 's's\n", scount);
		System.out.printf("The maximum length of string is: %d\n", max);
		System.out.printf("The minimum length of string is: %d\n", min);
	}

	public static boolean containLetters(String str, char c) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i))
				count++;
		}

		return count >= 2;
	}
}
