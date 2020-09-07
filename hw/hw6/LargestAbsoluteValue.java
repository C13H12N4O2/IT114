public class LargestAbsoluteValue {
	public static void main(String[] args) {
		int a, b, c;
		a = (int) (Math.random() * 20 - 10);
		b = (int) (Math.random() * 20 - 10);
		c = (int) (Math.random() * 20 - 10);

		System.out.println("The largest absolute value of (" + a + ", " + b + ", " + c + ") is: " + getLargestAbsVal(a, b, c));
	}
	
	public static int getLargestAbsVal(int a, int b, int c) {
		return Math.max(Math.max(Math.abs(a), Math.abs(b)), Math.max(Math.abs(a), Math.abs(c)));		
	}
}
