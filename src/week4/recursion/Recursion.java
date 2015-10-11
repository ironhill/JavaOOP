package week4.recursion;

/**
 * Created by Ihor Samanchuk on 11.10.2015.
 */
public class Recursion {
    public static void main(String[] args) {
        a();
        System.out.println(recMeth(5));
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        System.out.println("last");
    }

    //Factorial
    public static int recMeth(int val) {
        if (val == 1) {
            return 1;
        } else {
            return val * recMeth(val - 1);
        }
    }
}
