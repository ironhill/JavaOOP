package week4;

/**
 * Created by Ihor Samanchuk on 10.10.2015.
 */
public abstract class Machine {
    private final int speed;
    private final String model;
    private final int weight;

    public Machine(int speed, String model, int weight) {
        this.speed = speed;
        this.model = model;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public abstract void go();
}
