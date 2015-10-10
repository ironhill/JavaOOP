package week3.day2;

/**
 * Created by Ihor Samanchuk on 04.10.2015.
 */
public class NuclearStation {

    private final String name;
    private final int critiaclTemperatire;
    protected final int requiredpower;

    public NuclearStation(String name, int critiaclTemperatire, int requiredpower) {
        this.name = name;
        this.critiaclTemperatire = critiaclTemperatire;
        this.requiredpower = requiredpower;
    }

    @Override
    public String toString() {
        return "NuclearStation{" +
                "name='" + name + '\'' +
                ", critiaclTemperatire=" + critiaclTemperatire +
                ", requiredpower=" + requiredpower +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCritiaclTemperatire() {
        return critiaclTemperatire;
    }

    public int getRequiredpower() {
        return requiredpower;
    }

    public final boolean start(int curentTemperature, int power) {
        if (curentTemperature >= curentTemperature) {
            System.err.println("Temparature is critical");
            return false;
        }
        if (power < requiredpower) {
            System.err.println("Not enough power");
            return false;
        }
        System.out.println("Starting Nuclear Station");
        return true;
    }
}
