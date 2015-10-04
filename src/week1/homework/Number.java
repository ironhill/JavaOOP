package week1.homework;

/**
 * Created by Ihor Samanchuk on 24.09.2015.
 */
public class Number {
    private int number = 0;

    public void setNumber(int number) {
        this.number = number;
    }

    public int sum(int incomeNumber) {
        return number + incomeNumber;
    }

    public int substract(int incomeNumber) {
        return number - incomeNumber;
    }

    public int multiplication(int incomeNumber) {
        return number * incomeNumber;
    }

    public int division(int incomeNumber) {
        return number / incomeNumber;
    }

    public int remOfDevision(int incomeNumber) {
        return number % incomeNumber;
    }

    public double involution(double involutionRange) {
        double result = Math.pow(number, involutionRange);
        return result;
    }

    public int factorial() {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public void compare(int valueForCompare) {
        if (number < valueForCompare) {
            System.out.println(number + " is less than " + valueForCompare);
        } else if (number < valueForCompare) {
            System.out.println(number + " is bigger than " + valueForCompare);
        } else {
            System.out.println(number + " is equal to " + valueForCompare);
        }
    }
}
