package lab13.models;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public Faculty(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }
}
