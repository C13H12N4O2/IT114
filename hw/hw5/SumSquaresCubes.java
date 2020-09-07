public class SumSquaresCubes {
	public static void main(String[] args) {
		final int LIMIT = 10;

		System.out.println("The sum of the squares from 1 to " + LIMIT + " is " + sumSquares(LIMIT));
		System.out.println();
		System.out.println("The sum of the cubes fromm 1 to " + LIMIT + " is " + sumCubes(LIMIT));
	}

	public static int sumSquares(int i) {
		int sum = 0;

		for (int j = 0; j <= i; j++)
			sum += j * j;

		return sum;
	}

	public static int sumCubes(int i) {
		int sum = 0;

		for (int j = 0; j <= i; j++)
			sum += j * j * j;

		return sum;
	}
}

