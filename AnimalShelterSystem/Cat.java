package oopProject;

public class Cat extends Animal {

	private String breed, race;
	boolean hasTraining;

	public Cat(String name, String animalID, int age, int weight, int height, String breed, String race,
			boolean hasTraining) {
		super(name, animalID, age, weight, height);
		this.breed = breed;
		this.race = race;
		this.hasTraining = hasTraining;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isHasTraining() {
		return hasTraining;
	}

	public void setHasTraining(boolean hasTraining) {
		this.hasTraining = hasTraining;
	}

	@Override
	public int calculateHumanAge() {
		return getAge() * 5;
	}
}
