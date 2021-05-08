package lab13.models;

public class Student {
    private String name;
    private String surname;
    private String gradeBookId;
    private Double rating;

    public Student(String name, String surname, String gradeBookId, Double rating) {
        this.name = name;
        this.surname = surname;
        this.gradeBookId = gradeBookId;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGradeBookId() {
        return gradeBookId;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gradeBookId='" + gradeBookId + '\'' +
                ", rating=" + rating +
                '}';
    }
}
