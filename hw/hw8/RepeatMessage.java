import java.util.*;

public class RepeatMessage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		boolean exit = true;

		while (exit) {
			System.out.printf("She sells seashells by the seashore.\n");
			System.out.printf("Do you want to hear it again? ");
			str = scanner.next();
			scanner.nextLine();

			if (str.equals("yes"))
				;
			
			else if (str.equals("y"))
				;

			else if (str.equals("YES"))
				;

			else if (str.equals("Y"))
				;

			else if (str.equals("Yes"))
				;

			else if (str.equals("no"))
				exit = false;

			else if (str.equals("n"))
				exit = false;

			else if (str.equals("NO"))
				exit = false;

			else if (str.equals("N"))
				exit = false;

			else if (str.equals("No"))
				exit = false;

			else
				System.out.printf("Please type between yes or no\n");

			System.out.println();
		}
			
	}
}
	
