package week2.day1;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class TestAirplain {
    public static void main(String[] args) {
        Airplaine airplaine1 = new Airplaine();
        Airplaine airplaine2 = new Airplaine("Boing", 120);
        Airplaine airplaine3 = new Airplaine("An-124", 100 );

        System.out.println(Airplaine.getPlainCounter());
    }
}
