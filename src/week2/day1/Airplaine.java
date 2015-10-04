package week2.day1;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class Airplaine {
    private static int plainCounter = 0;

    private String plainModel;
    private float plaineLenth;
    private int passAmount;

    {
        plainCounter++;
    }

    public Airplaine() {
    }

    public Airplaine(String plainModel, float plaineLenth) {
        this.plainModel = plainModel;
        this.plaineLenth = plaineLenth;
    }

    public Airplaine(String plainModel, float plaineLenth, int passAmount) {
        this.plainModel = plainModel;
        this.plaineLenth = plaineLenth;
        this.passAmount = passAmount;
    }

    public static int getPlainCounter() {
        return plainCounter;
    }
}
