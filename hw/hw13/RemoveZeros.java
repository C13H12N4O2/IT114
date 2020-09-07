import java.util.*;

public class RemoveZeros {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < args.length; i++)
			list.add(Integer.parseInt(args[i]));

		if (list.contains(0))
			System.out.println(removeZeros(list));
		else 
			System.out.println(list);
	}

	public static ArrayList<Integer> removeZeros(ArrayList<Integer> list) {
		while (list.contains(0)) {
			list.remove(list.indexOf(0));
		}

		return list;
	}
}
	
