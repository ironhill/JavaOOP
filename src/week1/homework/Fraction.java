package week1.homework;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class Fraction {
    private int numerator = 0;
    private int denominator = 0;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void summFraction(Fraction incomeFraction) {
        int fullDenominator = denominator * incomeFraction.getDenominator();
        int firstNumer = numerator * (fullDenominator / denominator);
        int secondNumer = incomeFraction.getNumerator() * (fullDenominator / incomeFraction.getDenominator());
        int resultNumer = firstNumer + secondNumer;
        // int intDevisison = resultNumer % fullDenominator;
        System.out.printf("%d / %d", resultNumer, fullDenominator);
    }

    public void subtraction(Fraction incomeFraction) {
        int fullDenominator = denominator * incomeFraction.getDenominator();
        int firstNumer = numerator * (fullDenominator / denominator);
        int secondNumer = incomeFraction.getNumerator() * (fullDenominator / incomeFraction.getDenominator());
        int resultNumer = firstNumer - secondNumer;
        System.out.printf("%d/%d", resultNumer, fullDenominator);
    }

    public void multiplication(Fraction incomeFraction) {
        int firstNumer = numerator * incomeFraction.getNumerator();
        int secondNumer = denominator * incomeFraction.getDenominator();
        System.out.printf("%d/%d", firstNumer, secondNumer);
    }

    public void divisionFraction(Fraction incomeFraction) {
        int firstNumer = numerator * incomeFraction.getDenominator();
        int secondNumer = denominator * incomeFraction.getNumerator();
        System.out.printf("%d / %d", firstNumer, secondNumer);
    }

    public void equlFraction(Fraction incomeFractionOne, Fraction incomeFractionTwo) {
        Fraction firstFract = new Fraction(incomeFractionOne.getNumerator(), incomeFractionOne.getDenominator());
        Fraction secondFract = new Fraction(incomeFractionTwo.getNumerator(), incomeFractionTwo.getDenominator());
        if (firstFract.getDenominator() == secondFract.getDenominator()) {
            if (firstFract.getNumerator() > secondFract.getNumerator()) {
                System.out.printf("Fraction %d / %d is bigger ", incomeFractionOne.getNumerator(), incomeFractionOne.getDenominator());
            } else if (firstFract.getNumerator() > secondFract.getNumerator()) {
                System.out.printf("Fraction %d / %d is bigger ", incomeFractionTwo.getNumerator(), incomeFractionTwo.getDenominator());
            } else {
                System.out.println("Fractions are equals");
            }
        } else {
            int fullDenominator = firstFract.getDenominator() * secondFract.getDenominator();
            int firstNumerator = firstFract.getNumerator() * (fullDenominator / firstFract.getDenominator());
            int secondNumerator = secondFract.getNumerator() * (fullDenominator / secondFract.getDenominator());
            if (firstNumerator > secondNumerator) {
                System.out.printf("Fraction %d / %d is bigger ", incomeFractionOne.getNumerator(), incomeFractionOne.getDenominator());
            } else if (firstNumerator > secondNumerator) {
                System.out.printf("Fraction %d / %d is bigger ", incomeFractionTwo.getNumerator(), incomeFractionTwo.getDenominator());
            } else {
                System.out.println("Fractions are equals");
            }
        }
    }
}
