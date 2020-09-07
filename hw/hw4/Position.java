public class Position {
	public static void main(String[] args) {
		double s0 = 10.5;
		double v0 = -12.5;
		double a = 9.8;
		double s = s0;

		System.out.println("For s0 = " + s0 + " v0 = " + v0 + ", and a = " + a);
		
		for (int t = 0; t <= 10; t++) {
			System.out.println("At time t = " + t + ", the new position s is: " + (s + v0 * t + 0.5 * a * t * t));
		}
	}
}
