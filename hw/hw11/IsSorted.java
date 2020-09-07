import java.util.*;
import java.io.*;

public class IsSorted {
	public static void main(String[] args) {
		int length = (int) (Math.random() * 10 + 1);
		int[] ary = new int[length];
		int num;

		for (int i = 0; i < length; i++) {
			num = (int) (Math.random() * 10 + 1);

			ary[i] = num;
		}

		System.out.println(Arrays.toString(ary));

		if (isSorted(ary))
			System.out.println("The array is sorted.");
		else
			System.out.println("The array is not sorted.");
	}

	public static boolean isSorted(int[] ary) {
		for (int i = 0; i < ary.length; i++) 
			for (int j = i + 1; j < ary.length; j++)
				if (ary[i] > ary[j])
					return false;
		
		return true;
	}

}
	
