package homework.ten.task.one;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TaskOne {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the directory and file name you want to create(directory name/file name: ");
			String newFile = sc.nextLine();
			Path createFile = Paths.get(newFile);
			Files.createFile(createFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
