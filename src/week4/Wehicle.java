package week4;

/**
 * Created by Ihor Samanchuk on 10.10.2015.
 */
public class Wehicle extends Machine{

    public Wehicle(int speed, String model, int weight) {
        super(speed, model, weight);
    }

    @Override
    public void go() {
        System.out.println("Car go method");
    }
}
