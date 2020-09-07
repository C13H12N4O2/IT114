/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates how to print a two-dimensional array of integers.
 */

public class TwoDArray {
	public static void main(String[] args) {
		int[][] sudoku = {{1, 2, 3}, {2, 3, 1}, {3, 2, 1}};
		
		// sudoku.length is the number of rows
		for (int i = 0; i < sudoku.length; i++) {

			// sudoku[i].length is the number of columns on row i.
			for (int j = 0; j < sudoku[i].length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();
	}
}
