package week1.homework;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class TestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Input First value");
        float firstValue = sc.nextFloat();
        System.out.println("Input Oparation + - * /");
        char operaton = sc.next().charAt(0);
        System.out.println("Input Second value");
        float secondValue = sc.nextFloat();

        if (operaton == '+') {
            calc.add(firstValue, secondValue);
        } else if (operaton == '-') {
            calc.subtract(firstValue, secondValue);
        } else if (operaton == '*') {
            calc.multiply(firstValue, secondValue);
        } else if (operaton == '/') {
            calc.divide(firstValue, secondValue);
        } else {
            System.out.println("Operation not permitted!");
        }
    }
}
