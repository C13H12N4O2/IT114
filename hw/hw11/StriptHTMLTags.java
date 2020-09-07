import java.util.*;
import java.io.*;

public class StriptHTMLTags {
	public static void main(String[] args) {
		try {
			File file = new File("./page.txt");
			Scanner text = new Scanner(file);
			PrintStream ps = new PrintStream(new FileOutputStream("./pageRemoved.txt"));
			String str;

			while (text.hasNextLine()) {
				str = text.nextLine();

				processLine(str, ps);
			}
		
			ps.close();
		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong");
		}
	}

	public static void processLine(String str, PrintStream ps) {
		ps.println(processToken(str));
	}

	public static String processToken(String str) {
		boolean flag = true;
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				flag = false;
			}

			if (flag) {
				temp += str.charAt(i);
			}

			if (str.charAt(i) == '>') {
				flag = true;
			}


		}

		return temp;
	}
}
