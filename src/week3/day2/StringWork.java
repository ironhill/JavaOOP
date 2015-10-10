package week3.day2;

/**
 * Created by Ihor Samanchuk on 04.10.2015.
 */
public class StringWork {
    public static void main(String[] args) {
        String empty = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            empty += "*";
        }
        long stop = System.currentTimeMillis();
        System.out.printf("time %s \n", stop - start);
    }
}
