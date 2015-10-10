package week3;

/**
 * Created by Ihor Samanchuk on 03.10.2015.
 */
public class Tester extends Emploee {
    private String type;

    public void doTest() {
        System.out.println("Tester is testing now");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
