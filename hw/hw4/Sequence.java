public class Sequence {
	// drive of the class

	public static void main(String[] args) {
		printTimes();
		System.out.println();
		printSquares();
		System.out.println();
		printCubes();
	}

	public static void printTimes() {
		for (int i = 0; i <= 7; i++)
			System.out.println(i * 2);
	}

	public static void printSquares() {
		for (int i = 0; i <= 7; i++) 
			System.out.println(i * i);
	}

	public static void printCubes() {
		for (int i = 0; i <= 7; i++) 
			System.out.println(i * i * i);
	}
}

