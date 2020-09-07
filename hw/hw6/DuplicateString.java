public class DuplicateString {
	public static void main(String[] args) {
		String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str = "";
		int n = (int) (Math.random() * 9 + 1);

		for (int i = 0; i <= n; i++) {
			int r = (int) (Math.random() * 26);
			str += list.charAt(r);
		}

		getDuplicate(str, n);
	}

	public static void getDuplicate(String str, int n) {
		for (int i = 0; i <= n; i++)
			System.out.print(str + " ");

		System.out.println();
	}
}
