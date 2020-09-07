public class PrintEvens {
	// drive of the class. calls printEvens

	public static void main(String[] args) {
		printEvens();
	}

	// prints the even numbers fromm 2 to 50
	public static void printEvens() {
		for (int i = 1; i <= 25; i++) {
			System.out.println(i * 2);
		}
	}
}
