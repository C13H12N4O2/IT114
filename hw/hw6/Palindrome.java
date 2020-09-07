public class Palindrome {
	public static void main(String[] args) {
		String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str = "";
		int n = (int) (Math.random() * 10);	
		int r = 0;

		for (int i = 0; i <= n; i++) {
			r = (int) (Math.random() * 26);
			str += list.charAt(r);
		}

		System.out.println("Is \"" + str + "\" a palindrome?: " + isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		if (str.length() == 1)
			return false;

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
					return false;
		}

		return true;
	}
}
