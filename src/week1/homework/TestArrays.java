package week1.homework;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class TestArrays {
    public static void main(String[] args) {

        MassArray testArr = new MassArray(5);
        testArr.randomValuesAdd();
        //System.out.println(testArr.findMinValue());
        //System.out.println(testArr.findMaxValue());
        for (int i = 0; i < testArr.getLenArray() ; i++) {
            System.out.println(i);
        }
    }
}
