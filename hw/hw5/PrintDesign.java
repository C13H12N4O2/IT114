public class PrintDesign {
	public static void main(String[] args) {
		int LINES = 5;
		int num = 1;

		for (int i = LINES; i > 0; i--) {
			writeChars(i, '-');
			writeNums(num, num);
			writeChars(i, '-');
			System.out.println();
			num += 2;
		}

	}

	public static void writeChars(int i, char c) {
		for (int j = 0; j < i; j++)
			System.out.print(c);
	}

	public static void writeNums(int i, int j) {
		for (int k = 0; k < i; k++) 
			System.out.print(j);
	}
}
