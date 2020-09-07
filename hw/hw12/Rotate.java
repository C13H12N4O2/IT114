import java.util.*;

public class Rotate {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 4 + 1);
		int[][] ary = new int[num][num];

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		System.out.println("The output would be:");
		System.out.println("[");
			
		for (int[] row:ary) {
			System.out.println(Arrays.toString(row));
		}

		System.out.println();


		for (int[] row:rotate(ary)) {
			System.out.println(Arrays.toString(row));
		}

		System.out.println("]");
	}

	public static int[][] rotate(int[][] ary) {
		int[][] rot = new int[ary.length][ary.length];

		for (int i = 0; i < ary.length; i++) 
			for (int j = 0; j < ary[i].length; j++) 
				rot[j][ary.length - 1 - i] = ary[i][j];

		return rot;
	}
}


