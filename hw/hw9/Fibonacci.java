import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.print("Please enter a number: ");
		n = scanner.nextInt();

		System.out.printf("The first %d numbers in Fibonacci sequence usingiteration: \n", n);

		fibonacciIterative(n);
		System.out.println();

		System.out.printf("The first %d numbers in Fibonacci sequence usingiteration: \n", n);

		for (int i = 0; i < n; i++) 
			System.out.printf("%d ", fibonacciRecursive(i));

		System.out.println();
	}

	public static int fibonacciIterative(int n) {
		int prev = 0;
		int last = 1;
		int next = 1;

		System.out.printf("%d ", prev);
		System.out.printf("%d ", last);
		System.out.printf("%d ", next);

		for (int i = 0; i <= n - 4; i++) {
			prev = last;
			last = next;
			next = last + prev;

			System.out.printf("%d ", next);
		}


		return prev;
	}

	public static int fibonacciRecursive(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else 
			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
}
