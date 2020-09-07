/* Credit
 *
   I swear, on my honor, that all the work on this assignment was mine
   and that I had no help from any other individual
 */

/*
   This class demmonstrates some of things that can be done with
   the ArrayList class
 */

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		// create an ArrayList of Strings
		ArrayList<String> words = new ArrayList<String>();

		// add elements to this ArrayList using command line arguments
		for (int i = 0; i < args.length; i++)
			words.add(args[i]);

		// print the list
		System.out.println(words);

		// call the contains() method to see wheather a string exists in the ArrayList
		String word = "be";

		if (words.contains(word))
			System.out.println("Yes, the list contains the word: " + word);
		else 
			System.out.println("No, the list does not contain the word: " + word);

		System.out.println();

		// call the duplicateWord() method to duplicate every word in the list
		duplicateWord(words);

		// print the new list
		System.out.println(words);
	}

	public static void duplicateWord(ArrayList<String> list) {
		// duplicate every word. Pay attention to updating i by 2
		for (int i = 0; i < list.size(); i += 2)
			list.add(i + 1, list.get(i));
	}
}
