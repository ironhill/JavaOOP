package week1.day1;

/**
 * Created by Ihor Samanchuk on 20.09.2015.
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] charToStringOne = {'H', 'e', 'l', 'l', 'o', ','};
        char[] charToStringTwo = {' ', 'W', 'o', 'r', 'l', 'd', '!'};

        String testString = StringUtils.toString(charToStringOne);
        System.out.println(testString);

        int indexOfCharArray = StringUtils.indexOf(charToStringOne, 'e');
        System.out.println("Index of Array is: " + indexOfCharArray);

        int amountOfChars = StringUtils.count(charToStringOne, 'l');
        System.out.println("Amount of chars is: " + amountOfChars);

        char[] concateChar = StringUtils.concatenate(charToStringOne, charToStringTwo);
        StringUtils.printArray(concateChar);

    }
}
