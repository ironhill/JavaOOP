package week3;

/**
 * Created by Ihor Samanchuk on 03.10.2015.
 */
public class Emploee {
    private String name;
    private int age;
    private double salary;

    public Emploee() {
    }

    public Emploee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void emploeerWorks(){
        System.out.println("I'm working");
    }
}
