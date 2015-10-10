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

    @Override
    public boolean equals(Object obj) {
        //non null
        if (obj == null) {
            return false;
        }
        //reflectivity
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coder)) {
            return false;
        }
        //this feald eq to obj fielads
        Coder other = (Coder) obj;
        return (getName() != null) || !other.getName().equals(this.getName())
                && this.getAge() == other.getAge() && this.getSalary() == other.getSalary();
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
