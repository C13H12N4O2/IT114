/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrate some fo things that can be done with
   the String objects
 */

public class StringExperiment {
	
	// do various things on String objects
	public static void main(String[] args) {
		String first = "Hello";
		String second = "world";
		String newString = first + " " + second + "!";
		System.out.println("newString: " + newString);
		System.out.println("The length of newString is: " + newString.length());
		System.out.println("The first character in newString is " + newString.charAt(0));
		System.out.println("The last character in newString is " + newString.charAt(newString.length() -1));
		System.out.println("The first word in newString is " + newString.substring(0, 5));
		System.out.println(newString.toLowerCase());
		System.out.println(newString.toUpperCase());

		// call the getReverse() method to get a string in reversed order
		String s = "A Tale of two Cities";
		System.out.println("Original string is: " + s);
		System.out.println("The reversed string is: " + getReverse(s));
	}

	/*
		method getReverse creates a new string that is in a reversed order
		of the original given string
	*/

	public static String getReverse(String s) {
		String newS = "";

		for (int i = s.length() -1; i >= 0; i--) 
			newS += s.charAt(i);

		return newS;
	}
}
