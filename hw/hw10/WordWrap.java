import java.util.*;
import java.io.*;

public class WordWrap {

	public static final int LIMIT = 6;

	public static void main(String[] args) {
		String filename = "./ATaleOfTwoCities.txt";
		File inputfile = new File(filename);
		String all = "";
		int count = 0;

		try {
			Scanner file = new Scanner(inputfile);

			while (file.hasNext()) {

				if (count == LIMIT) {
					System.out.println(all);
					
					all = "";
					count = 0;
				} else {
					String cur = file.next();
					all += cur + " ";

					count++;
				}
			}

			System.out.println(all);
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
