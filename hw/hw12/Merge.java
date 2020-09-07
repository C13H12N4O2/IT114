import java.util.*;

public class Merge {
	public static void main(String[] args) {
		int[] ary1 = new int[(int) (Math.random() * 10 + 1)];
		int[] ary2 = new int[(int) (Math.random() * 10 + 1)];
		int num;

		for (int i = 0; i < ary1.length; i++) {
			num = (int) (Math.random() * 20 + 1);
			ary1[i] = num;
		}

		for (int i = 0; i < ary2.length; i++) {
			num = (int) (Math.random() * 20 + 1);
			ary2[i] = num;
		}

		System.out.println("Array 1: " + Arrays.toString(ary1));
		System.out.println("Array 2: " + Arrays.toString(ary2));
		System.out.println("Resulting array after merging: "
				 + Arrays.toString(merge(ary1, ary2)));
	}

	public static int[] merge(int[] ary1, int[] ary2) {
		int[] ary = new int[ary1.length + ary2.length];
		int i = 0;

		for (int n:ary1) {
			ary[i] = n;
			i++;
		}

		for (int n:ary2) {
			ary[i] = n;
			i++;
		}

		for (i = ary.length - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (ary[j - 1] > ary[j]) {
					int temp = ary[j - 1];
					ary[j - 1] = ary[j];
					ary[j] = temp;
				}
			}
		}

		return ary;
	}
}
