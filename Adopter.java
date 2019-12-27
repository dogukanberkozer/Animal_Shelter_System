package oopProject;

import java.util.ArrayList;

public class Adopter extends Human {

    private String adopterID;
    private String adopterPassword;
    ArrayList<Animal> adoptedAnimals = new ArrayList<Animal>();
    
    public Adopter(String name, Birthdate birthday, int idNumber, Address address, Phone phone, String adopterID, String adopterPassword) {
        super(name, birthday, idNumber, address, phone);
        this.adopterID = adopterID;
        this.adopterPassword = adopterPassword;
        this.adoptedAnimals = new ArrayList<Animal>();

    }
    
    
    public void addAnimaltoAdopter(Animal animal) {
    	adoptedAnimals.add(animal);
    }

    public ArrayList<Animal> getAdoptedAnimals() {
		return adoptedAnimals;
	}

	public void setAdoptedAnimals(ArrayList<Animal> adoptedAnimals) {
		this.adoptedAnimals = adoptedAnimals;
	}

	public String getAdopterID() {
        return adopterID;
    }

    public void setAdopterID(String adopterID) {
        this.adopterID = adopterID;
    }

	public String getAdopterPassword() {
		return adopterPassword;
	}

	public void setAdopterPassword(String adopterPassword) {
		this.adopterPassword = adopterPassword;
	}
	
	public String getAdoptedName() {
		String names = "";
		if(adoptedAnimals.size()!=0) {
			
			for(int i = 0; i<adoptedAnimals.size() ;i++)
			{
				
				names +=adoptedAnimals.get(i).getName()+", ";
			}
		
		}
		
		
		return names;
	}
    
}
