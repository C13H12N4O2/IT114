import java.util.*;

public class Josephus {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = Integer.parseInt(args[0]);

		for (int i = 0; i < n; i++)
			list.add(i);

		getJosephus(list, Integer.parseInt(args[1]));
	}

	public static void getJosephus(ArrayList<Integer> list, int n) {
		int i = 0;
		int f = 0;

		while (!list.isEmpty()) {
			if (i == list.size())
				i = 0;

			if (f == n - 1) {
				System.out.print(list.remove(i) + " ");
				f = 0;
			}

			i++;
			f++;
		}


		System.out.println();
	}
}
