package oopProject;

public abstract class Human {

	private String name;
	private Birthdate birthday;
	private int idNumber;
	private Address address;
	private Phone phone;

	Human(String name, Birthdate birthday, int idNumber, Address address, Phone phone) {
		this.name = name;
		this.birthday = birthday;
		this.idNumber = idNumber;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Birthdate getBirthday() {
		return birthday;
	}

	public void setBirthday(Birthdate birthday) {
		this.birthday = birthday;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
