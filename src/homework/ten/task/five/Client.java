package homework.ten.task.five;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Client implements Serializable {

	private String accountNumber;
	private String fullName;
	private long id;
	private int phone;
	private String email;
	private String address;

	public Client(String accountNumber, String fullName, long id, int phone, String email, String address) {
		super();
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.id = id;
		this.phone = phone;
		this.email = email;
		this.address = address;

	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
