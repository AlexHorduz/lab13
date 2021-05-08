package lab13.models;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public University(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public boolean removeFaculty(Faculty faculty) {
        return faculties.remove(faculty);
    }
}
