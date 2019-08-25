package by.etc.module6.task3.entity;

public class Student extends Person {

    private String faculty;

    public Student(String name, String surname, Sex sex, Address address, String faculty) {
        super(name, surname, sex, address);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + faculty.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", faculty: " + getFaculty();
    }
}