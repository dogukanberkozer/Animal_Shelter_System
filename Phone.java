package oopProject;

public class Phone {
	private int countryCode, phoneNumber;

	public Phone(int countryCode, int phoneNumber) {
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return countryCode + " " + phoneNumber;
	}
}
