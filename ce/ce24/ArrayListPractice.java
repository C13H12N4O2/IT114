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

public class ArrayListPractice {
	public static void main(String[] args) {
		// create an ArrayList of integers
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		// append two new elements
		list1.add(10);
		list1.add(20);

		// add 30 at index 0
		list1.add(0, 30);

		// print the entire list
		System.out.println(list1);

		// remove the element at index 1
		list1.remove(1);

		System.out.println(list1);

		// get and print the size of list1
		System.out.println(list1.size());

		// call the update() method to update every element.
		update(list1);

		// print the updated list
		System.out.println(list1);

		// clear all elemments in list1
		list1.clear();

		System.out.println(list1);
	}

	public static void update(ArrayList<Integer> list) {
		// increment each element in an ArrayList by 1
		for (int i = 0; i < list.size(); i++)
			list.set(i, list.get(i) + 1);
	}
}
