package oopProject;
public class Bird extends Animal{

    private boolean canTalk;
    private String breed, race;

    public Bird(String name, String animalID, int age, int weight, int height, boolean canTalk, String breed, String race) {
        super(name, animalID, age, weight, height);
        this.canTalk = canTalk;
        this.breed = breed;
        this.race = race;
    }

    public boolean canTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
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

    @Override
    public int calculateHumanAge() {
        return getAge()*3;
    }
}
