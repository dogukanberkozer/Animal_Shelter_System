package oopProject;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {

	ArrayList<Worker> workers = new ArrayList<Worker>();
	ArrayList<Adopter> adopters = new ArrayList<Adopter>();
	ArrayList<Animal> animals = new ArrayList<Animal>();

	public void createWorker(String name, Birthdate birthday, int idNumber, Address address, Phone phone,
			String workerID, String workerPassword) {

		Worker worker = new Worker(name, birthday, idNumber, address, phone, workerID, workerPassword);
		addWorker(worker);
	}

	public void addWorker(Worker worker) {
		workers.add(worker);
	}

	public void removeWorker(Worker worker) {// remove methodu isim ve ID ye g�re farkl� parametrelerle
												// yaz�labilir//
		workers.remove(worker);
	}

	public void removeWorker(String workerID) {
		for (int i = 0; i < workers.size(); i++) {
			if (workers.get(i).getWorkerID().equals(workerID)) {
				workers.remove(workers.get(i));
			}
		}
	}

	public void createAdopter(String name, Birthdate birthday, int idNumber, Address address, Phone phone,
			String adopterID, String adopterPassword) {
		Adopter adopter = new Adopter(name, birthday, idNumber, address, phone, adopterID, adopterPassword);
		addAdopter(adopter);
	}

	public void addAdopter(Adopter adopter) {
		adopters.add(adopter);
	}

	public void removeAdopter(Adopter adopter) {
		adopters.remove(adopter);

	}

	public void removeAdopter(String adopterID) {
		for (int i = 0; i < adopters.size(); i++) {
			if (adopters.get(i).getAdopterID().equals(adopterID)) {
				adopters.remove(adopters.get(i));
			}
		}
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void removeAnimal(Animal animal) {
		animals.remove(animal);
	}

	public void removeAnimal(String animalID) {

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getAnimalID().equals(animalID)) {
				animals.remove(animals.get(i));
			}
		}

	}

	public void readAnimals() throws IOException {

		ArrayList<String> words = new ArrayList<String>();

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Monster\\Desktop\\Animal.txt"));

		String line;
		while ((line = reader.readLine()) != null) {

			for (String word : line.split(",")) {

				words.add(word);

			}
		}
		reader.close();

		for (int i = 0; i < words.size(); i += 9) {

			// String name, String animalID, int age, int weight, int height,boolean
			// hasTraining, String breed, String race

			String name = words.get(i + 1);
			String animalID = words.get(i + 2);
			int age = Integer.valueOf(words.get(i + 3));
			int weight = Integer.valueOf(words.get(i + 4));
			int height = Integer.valueOf(words.get(i + 5));
			boolean hasTraining = Boolean.valueOf(words.get(i + 6));
			String breed = words.get(i + 7);
			String race = words.get(i + 8);

			if (words.get(i).equals("Bird")) { // hasTraining and canTalk --> "Same Types"

				Bird bird = new Bird(name, animalID, age, weight, height, hasTraining, breed, race);
				addAnimal(bird);

			} else if (words.get(i).equals("Dog")) {

				Dog dog = new Dog(name, animalID, age, weight, height, breed, race, hasTraining);
				addAnimal(dog);

			}

			else if (words.get(i).equals("Cat")) {

				Cat cat = new Cat(name, animalID, age, weight, height, breed, race, hasTraining);
				addAnimal(cat);

			}

		}
	}

	public void listAnimals() {
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i).getClass().getSimpleName());
			System.out.println("Animal Type: " + animals.get(i).getClass() + " - Name: " + animals.get(i).getName()
					+ " - AnimalID: " + animals.get(i).getAnimalID() + " - Age: " + animals.get(i).getAge()
					+ " - Weight " + animals.get(i).getWeight() + " - Height " + animals.get(i).getHeight());
		}
	}

	public ArrayList<Animal> getBirds() {
		ArrayList<Animal> birds = new ArrayList<Animal>();

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getClass().getSimpleName().equals("Bird"))
				birds.add(animals.get(i));
		}

		return birds;
	}

	public ArrayList<Animal> getDogs() {
		ArrayList<Animal> dogs = new ArrayList<Animal>();

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getClass().getSimpleName().equals("Dog"))
				dogs.add(animals.get(i));
		}

		return dogs;
	}

	public ArrayList<Animal> getCats() {
		ArrayList<Animal> cats = new ArrayList<Animal>();

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getClass().getSimpleName().equals("Cat"))
				cats.add(animals.get(i));
		}

		return cats;
	}

	public boolean checkAdopter(String id, String pass) {
		for (int i = 0; i < adopters.size(); i++) {
			if (adopters.get(i).getAdopterID().equals(id) && adopters.get(i).getAdopterPassword().equals(pass))
				return true;
		}

		return false;
	}

	public boolean checkWorker(String id, String pass) {

		for (int i = 0; i < workers.size(); i++) {
			if (workers.get(i).getWorkerID().equals(id) && workers.get(i).getWorkerPassword().equals(pass))
				return true;
		}
		return false;
	}

	public void adoptAnimal(Adopter p, Animal a) {
		if (p != null) {
			p.addAnimaltoAdopter(a);
			animals.remove(a);
		} else
			System.out.print("null");

	}

	public Adopter findAdopter(String name) {
		for (int i = 0; i < adopters.size(); i++) {
			if (name.equals(adopters.get(i).getAdopterID())) {
				return adopters.get(i);
			}
		}

		return null;
	}

	public Animal findAnimal(String animalID) {
		for (int i = 0; i < animals.size(); i++) {
			if (animalID.equals(animals.get(i).getAnimalID())) {
				return animals.get(i);
			}
		}

		return null;
	}

	public ArrayList<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(ArrayList<Worker> workers) {
		this.workers = workers;
	}

	public ArrayList<Adopter> getAdopters() {
		return adopters;
	}

	public void setAdopters(ArrayList<Adopter> adopters) {
		this.adopters = adopters;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

}
