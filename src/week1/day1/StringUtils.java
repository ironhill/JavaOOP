package week1.day1;

/**
 * Created by Ihor Samanchuk on 19.09.2015.
 */
public class StringUtils {

    public static String toString(char income[]) {
        String StringToRet = "";
        for (int i = 0; i < income.length; i++) {
            StringToRet += income[i];
        }
        return StringToRet;
    }

    public static int indexOf(char[] income, char target) {
        int indexOf = 0;
        for (int i = 0; i < income.length; i++) {
            if (income[i] == target) {
                indexOf = i;
            }
        }
        return indexOf;
    }

    public static int count(char[] income, char target) {
        int amount = 0;
        for (int i = 0; i < income.length; i++) {
            if (income[i] == target) {
                amount++;
            }
        }
        return amount;
    }

    public static char[] concatenate(char[] income1, char[] income2) {
        int lenthNew = income1.length + income2.length;
        char[] newChar = new char[lenthNew];

        for (int i = 0; i < income1.length; i++) {
            newChar[i] = income1[i];
        }
        for (int j = 0; j < income2.length; j++) {
            newChar[income1.length + j] = income2[j];
        }
        return newChar;
    }

    public static void printArray(char[] incomeCharArray){
        for (int i = 0; i < incomeCharArray.length; i++) {
            System.out.print(incomeCharArray[i]);
        }
    }
}
