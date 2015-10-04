package week1.homework;

/**
 * Created by Ihor Samanchuk on 24.09.2015.
 */
public class TestHome {
    public static void main(String[] args) {
        Number num = new Number();
        num.setNumber(4);
        System.out.println(num.factorial());
        num.compare(4);
        System.out.println(num.remOfDevision(3));

        Fraction fract1 = new Fraction(2, 5);
        Fraction fract2 = new Fraction(3 , 7);

        fract1.divisionFraction(fract2);
    }
}
