package week1.homework;

import java.util.Random;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class MassArray {

    private int lenArray = 0;
    private int[] checkArray;

    public MassArray(int lenArray) {
        this.lenArray = lenArray;
        this.checkArray = new int[lenArray];
    }

    public int getLenArray() {
        return lenArray;
    }

    public int findMinValue() {
        int minValue = checkArray[0];
        for (int i = 1; i < checkArray.length; i++) {
            if (minValue > checkArray[i]) {
                minValue = checkArray[i];
            }
        }
        return minValue;
    }

    public int findMaxValue() {
        int maxValue = checkArray[0];
        for (int i = 1; i < checkArray.length; i++) {
            if (maxValue < checkArray[i]) {
                maxValue = checkArray[i];
            }
        }
        return maxValue;
    }

    public void randomValuesAdd() {
        for (int i = 0; i < checkArray.length; i++) {
            checkArray[i] =(int) (Math.random()*1000);
        }
    }

    public void printArray(){
        for (int i = 0; i < checkArray.length; i++) {
            System.out.print(i);
        }
    }
}
