/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class prints the hours in a day
 */

public class HoursInDay2 {
	public static final int HALF_A_DAY = 12;

	// driver for this class
	public static void main (String[] args) {
		System.out.println("Hours in the day");
		printHours("AM");
		System.out.println();
		printHours("PM");
	}

	// prints the hours for a certain part of the day
	public static void printHours(String dayPart) {
		for (int hour = 1; hour <= HALF_A_DAY; hour++) {
			System.out.println(hour + " " + dayPart);
		}
	}
}
