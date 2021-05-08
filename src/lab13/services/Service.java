package lab13.services;


import lab13.comparators.EnrolleeRatingComparator;
import lab13.comparators.EnrolleeSurnameComparator;
import lab13.models.Enrollee;
import lab13.models.Student;
import lab13.models.University;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service implements IService {

    @Override
    public void task1(List<Enrollee> enrollees, int paidPlaces) {
        enrollees.stream()
                .sorted(new EnrolleeRatingComparator().reversed())
                .limit(paidPlaces)
                .sorted(new EnrolleeSurnameComparator())
                .forEach(System.out::println);
    }

    @Override
    public void task2(University university) {

        int numOfStudents = university.getFaculties().stream()
                .mapToInt(faculty -> faculty.getStudents().size())
                .reduce(0, Integer::sum);

        double sumOfAllRatings = university.getFaculties().stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .mapToDouble(Student::getRating)
                .reduce(0, Double::sum);

        double avgRating = sumOfAllRatings / numOfStudents;

        System.out.println("Average rating is " + avgRating);
        university.getFaculties().stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .filter(student -> student.getRating() > avgRating)
                .forEach(System.out::println);
    }

    @Override
    public List<Enrollee> task3(List<Enrollee> enrollees) {
        return enrollees.stream()
                .filter(enrollee -> enrollee.getRating() < 60)
                .collect(Collectors.toList());
    }

}
