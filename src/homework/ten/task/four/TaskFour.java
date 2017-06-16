package homework.ten.task.four;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class TaskFour {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the directory and the file name  you want to move(directory name/file name): ");
			Path from = Paths.get(sc.nextLine());
			System.out.println("Please enter a new directory and the file name  you want to move(directory name/file name): ");
			Path to = Paths.get(sc.nextLine());

			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
			Files.delete(from);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
