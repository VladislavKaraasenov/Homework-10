package homework.ten.task.two;

import java.io.*;
import java.util.*;

public class TaskTwo {

	public static void main(String[] args) {

		final String FILE = "homework/numbers.txt";
		final String RESULT_NEW_FILE = "homework/copy_numbers.txt";

		try (Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(FILE)));
				PrintWriter writer = new PrintWriter(RESULT_NEW_FILE)) {

			int sum = 0;
			while (sc.hasNextInt()) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
			writer.println(String.valueOf(sum));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
