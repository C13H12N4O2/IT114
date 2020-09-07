public class MostFrequent {
	public static void main(String[] args) {
		System.out.printf("The element appears most frequently is: %d\n", getMostFrequent(args));
	}

	public static int getMostFrequent(String[] ary) {
		int[] aryCount = new int[20];
		int cur = -1;
		int num = 0;

		for (int i = 0; i < aryCount.length; i++)
			aryCount[i] = 0;

		for (String str:ary) 
			aryCount[Integer.parseInt(str)]++;

		for (int i = 0; i < aryCount.length; i++) 
			if (cur < aryCount[i]) {
				cur = aryCount[i];
				num = i;
			}

		return num;
	}
}
