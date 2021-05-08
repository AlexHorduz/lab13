package lab13.models;

public class Enrollee {
    private String surname;
    private Double rating;


    public Enrollee(String surname, Double rating) {
        this.surname = surname;
        this.rating = rating;
    }


    public String getSurname() {
        return surname;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Enrollee{" +
                "surname='" + surname + '\'' +
                ", rating=" + rating +
                '}';
    }
}
