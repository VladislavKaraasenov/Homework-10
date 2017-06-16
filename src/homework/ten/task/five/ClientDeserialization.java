package homework.ten.task.five;

import java.io.*;
import java.util.*;

public class ClientDeserialization {
	public static void main(String[] args) {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("homework/clients.txt"))) {
			@SuppressWarnings("unchecked")
			List<Client> clients = (List<Client>) (in.readObject());
			for (Client c : clients) {
				System.out.println("Account number: " + c.getAccountNumber() + ", " + "Full name: " + c.getFullName()
						+ ", " + "Id: " + c.getId() + ", " + "Phone: " + c.getPhone() + ", " + "Email: " + c.getEmail()
						+ ", " + "Address: " + c.getAddress() + ".");
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
