package homework.ten.task.three;

import java.util.*;
import java.io.*;

public class TaskThree {
	public static void main(String[] args) {

		final String FILE = "C:/Users/computer_name/Desktop/console.input.txt";

		try (Scanner sc = new Scanner(System.in);
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE)))) {
			boolean hasEnteredExit = true;
			final String EXIT = "Exit";
			System.out.println("If you want to stop the program, please enter the word \"Exit\".");
			System.out.println("Please enter text:");
			
			while (hasEnteredExit) {
				String text = sc.nextLine();
				if (text.equalsIgnoreCase(EXIT)) {
					hasEnteredExit = false;
				} else {
					writer.println(text);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
