package week2.homework;

/**
 * Created by Ihor Samanchuk on 03.10.2015.
 */
public class Student {
    private String studentsName;
    private String address;
    private Subject[] subjects = new Subject[30];
    private int subjectCounter = 0;

    public Student(String studentsName, String address) {
        this.studentsName = studentsName;
        this.address = address;
    }

    public String stidentStudy() {
        return "Student " + this.studentsName + "Is study";
    }

    public void addSubject(Subject subjectName) {
        subjects[subjectCounter] = subjectName;
        subjectCounter++;
    }

    public void removeLastSubject(){
        subjects[subjectCounter]=null;
    }

}
