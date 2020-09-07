import java.util.*;

public class LongestSortedSequence {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < args.length; i++)
			list.add(Integer.parseInt(args[i]));

		System.out.printf("The length of the longest sorted sequence is: %d\n", getLongestSortedSequence(list));
	}

	public static int getLongestSortedSequence(ArrayList<Integer> list) {
		if (list.size() == 0)
			return 0;

		int count = 1;
		int cur = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i + 1)) {
				count++;
			} else {
				count = 1;
			}

			if (count > cur)
				cur = count;
		}

		return cur;
	}
}
