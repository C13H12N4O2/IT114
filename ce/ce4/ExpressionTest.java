public class ExpressionTest {
	// drive of the class. Variable declaration and calculations.

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		double d = 12.5;
		double c = 20.4;
		double e = b / a + (int)(d * c);
		
		System.out.println("The value of e is " + e);

		boolean flag1 = true;
		boolean flag2 = false;

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println("a<b?: " + (a < b));
		System.out.println("b/a==0?: " + (b / a == 0));
	}
}
