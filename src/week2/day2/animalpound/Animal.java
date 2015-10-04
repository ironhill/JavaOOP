package week2.day2.animalpound;

/**
 * Created by Ihor Samanchuk on 27.09.2015.
 */
public class Animal {
    private String breed;
    private float weight;
    private String name;

    public Animal(String breed, float weight, String name) {
        this.breed = breed;
        this.weight = weight;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String asString() {
        return String.format("Breed: %s , Weight: %f, Name: %s ", this.breed, this.weight, this.name);
    }
}
