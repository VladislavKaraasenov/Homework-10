package homework.ten.task.five;

import java.io.*;
import java.util.*;

public class ClientSerialization {
	public static void main(String[] args) {

		List<Client> clients = new ArrayList<>();
		clients.add(new Client("Test account number 1", "Test full name 1", 11111111, 101010, "Test mail 1", "Test address 1"));
		clients.add(new Client("Test account number 2", "Test full name 2", 22222222, 202020, "Test mail 2","Test address 2"));
		clients.add(new Client("Test account number 3", "Test full name 3", 33333333, 303030, "Test mail 3", "Test address 3"));

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("homework/clients.txt"))) {
			out.writeObject(clients);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
