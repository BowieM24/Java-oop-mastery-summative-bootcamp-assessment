package oopmastery;

import java.util.List;
import java.util.ArrayList;


public class Question04_Course {

    private String courseName;
    private List<Question04_Student> students;

    public Question04_Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enroll(Question04_Student student) {
        students.add(student);
    }

    public int studentCount() {
        return students.size();
    }

    public String getCourseName() {
        return this.courseName;
    }
}