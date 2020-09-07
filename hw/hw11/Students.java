import java.util.*;
import java.io.*;

public class Students {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			File file = new File("./students.txt");
			Scanner text = new Scanner(file);

			System.out.print("Please input the keyword you are searching for: ");
			String key = input.next();

			System.out.print("Please input the name of the output file: ");
			String output= input.next();

			PrintStream ps = new PrintStream(new FileOutputStream(output));

			processData(text, ps, key);

			ps.close();
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

	}

	public static void processData(Scanner input, PrintStream ps, String key) {
		Scanner texts;
		String temp;
		String str;

		while (input.hasNextLine()) {
			temp = input.nextLine();
			texts = new Scanner(temp);

			while (texts.hasNext()) {
				str = texts.next();

				if (str.equals(key)) {
					ps.println(temp);
					
					break;
				}
			}
		}
	}
}


