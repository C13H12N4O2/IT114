import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer greater than or equal to zero ");
		int n = scanner.nextInt();

		int result = factorial(n);

		if (result != -1) 
			System.out.println("The factorial of " + n  + " is " + result);
		else 
			System.out.println("You cannot take the factorial of a negative number.");
	
	}

	public static int factorial(int n) {
		if (n >= 0) {
			int sum = 1;

			for (int i = n; i > 0; i--)
				sum *= i;
				
			return sum;
		} else {
			return -1;
		}
	}
}
