/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates some of things that can be done with
   the Math class and if/else statement
 */

public class MathExperiment {
	
	// do various things on Math class
		public static void main(String[] args) {
			// compute 2^3
			System.out.println("2^3 is: " + Math.pow(2, 3));

			// get the square root of 25
			System.out.println("The square root of 25 is: " + Math.sqrt(25));

			// absolute of a real number
			System.out.println("The absolute avlue of -12 is: " + Math.abs(-12));

			// The max between -1 and 1
			System.out.println("The max of -1 and 1 is: " + Math.max(-1, 1));

			// The max of variables a, b
			int a = -1, b = 0;

			System.out.println("The larger og (" + a + ", " + b + ") is: " + getLarger(a, b));

			int result1 = (int)(Math.random() * 6 + 1);
			
			System.out.println("The random number generated is: " + result1);

			// call the getDisance() method to get the euclidean distance between two points
			System.out.println("The distance is: " + getDistance(1, 0, 4, 4));
		}
		/*
			method getDistance calculates the euclidean distance between two points.
			suppose (x1, y1) and (x2, y2) are the coordinates of two points in a 2-dimensional 
			the euclidean distance between this two points is calculated as :
			distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
		*/
		public static double getDistance(double x1, double y1, double x2, double y2) {
			return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		}

		/*
			method getLarger returns the larger one between two parameters. if/else statmment is used here
		 */
		public static int getLarger(int a, int b) {
			if (a > b) 
				return a;
			else 
				return b;
		}
}
