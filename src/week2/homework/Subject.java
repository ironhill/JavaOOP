package week2.homework;

/**
 * Created by Ihor Samanchuk on 03.10.2015.
 */
public class Subject {
    private String subjectName;
    private int hoursAmount = 0;
    private int studentsMark = 0;

    public Subject() {
    }

    public Subject(String subjectName, int hoursAmount, int studentsMark) {
        this.subjectName = subjectName;
        this.hoursAmount = hoursAmount;
        this.studentsMark = studentsMark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getHoursAmount() {
        return hoursAmount;
    }

    public void setHoursAmount(int hoursAmount) {
        this.hoursAmount = hoursAmount;
    }

    public int getStudentsMark() {
        return studentsMark;
    }

    public void setStudentsMark(int studentsMark) {
        this.studentsMark = studentsMark;
    }

    public boolean passExam() {
        if (this.studentsMark >= 3)
            return true;
        else {
            return false;
        }
    }
}
