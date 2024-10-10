package Lab4.Models;

import Lab4.Interfaces.IStudentGroup;

public class StudentGroup implements IStudentGroup {

    private String specialty;
    private int course;
    private int group;
    private int numberOfStudents;

    public StudentGroup(String specialty,
                        int course,
                        int group,
                        int numberOfStudents){
        setSpecialty(specialty);
        setCourse(course);
        setNumberOfGroup(group);
        setCountStudents(numberOfStudents);
    }

    @Override
    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public int getCourse() {
        return course;
    }

    @Override
    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int getNumberOfGroup() {
        return group;
    }

    @Override
    public void setNumberOfGroup(int group) {
        this.group = group;
    }

    @Override
    public int getCountStudents() {
        return numberOfStudents;
    }

    @Override
    public void setCountStudents(int countStudents) {
        this.numberOfStudents = countStudents;
    }

    @Override
    public String toString() {

        String stringBuilder = "Student Group:" +
                "\n" +
                "Specialty: " +
                this.specialty +
                "\n" +
                "Course: " +
                this.course +
                "\n" +
                "Group: " +
                this.group +
                "\n" +
                "Number of students: " +
                this.numberOfStudents +
                "\n";

        return stringBuilder;
    }
}
