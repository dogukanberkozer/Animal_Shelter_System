package oopProject;

public class Worker extends Human {

	private String workerID;
	private String workerPassword;

	public Worker(String name, Birthdate birthday, int idNumber, Address address, Phone phone, String workerID,
			String workerPassword) {
		super(name, birthday, idNumber, address, phone);
		this.workerID = workerID;
		this.workerPassword = workerPassword;
	}

	public String getWorkerID() {
		return workerID;
	}

	public void setWorkerID(String workerID) {
		this.workerID = workerID;
	}

	public String getWorkerPassword() {
		return workerPassword;
	}

	public void setWorkerPassword(String workerPassword) {
		this.workerPassword = workerPassword;
	}
}
