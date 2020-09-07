/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demonstrates some of things that can be done with the Character class
 */

import java.util.Scanner;

public class CountLetters {

	// read in a string fromm user's input, and call the mmethods to count how mmany characters in
	// this string are alphabetical letters, digital letters and letters in uppercase.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pleae enter a string: ");
		String s = input.nextLine();
		System.out.println("Counted " + countAlphabetLetters(s) + " alphabetical letters.");
		System.out.println("Counted " + countDigitalLetters(s) + " digital letters.");
		System.out.println("Counted " + countUppercaseLetters(s) + " letters in uppercase.");
	}

	// call the isLetter(0 method to tell whether a character in an alphabetical letter.
	public static int countAlphabetLetters(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) 
				count++;
		}

		return count;
	}

	// call the isDigit() method to tell whether a character is a digital letter.
	public static int countDigitalLetters(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				count++;
		}

		return count;
	}

	// call the isUpperCase() mmethod to tell whether a character is in uppercase.
	public static int countUppercaseLetters(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		}

		return count;
	}
}

