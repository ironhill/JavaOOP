package week2.day2.animalpound;

/**
 * Created by Ihor Samanchuk on 27.09.2015.
 */
public class Pound {
    private String poundName;
    private int animalHouseCells;
    private Animal animalHouse[] = new Animal[animalHouseCells];

    public Pound(String poundName, int animalHouseCells) {
        this.poundName = poundName;
        this.animalHouseCells = animalHouseCells;
    }

    public void addAnimal(Animal newAnimal) {
        for (int i = 0; i < animalHouse.length; i++) {
            if (animalHouse[i] == null) {
                animalHouse[i] = newAnimal;
            }
        }
    }

    public Animal getAnimalFromCell(int poundIndex) {
        Animal toFeedom = animalHouse[poundIndex];
        animalHouse[poundIndex] = null;
        return toFeedom;
    }

    public String getPoundName() {
        return poundName;
    }

    public void showAnimal() {
        for (int i = 0; i < animalHouse.length; i++) {
            if (animalHouse[i] != null) {
               // animalHouse[i].asString();
            }
        }
    }
}
