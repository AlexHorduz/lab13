package lab13;

import lab13.models.Enrollee;
import lab13.models.Faculty;
import lab13.models.Student;
import lab13.models.University;
import lab13.services.IService;
import lab13.services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IService service = new Service();

        List<Enrollee> enrolless = new ArrayList<>();
        enrolless.add(new Enrollee("Vovk", 80.0));
        enrolless.add(new Enrollee("Horduz", 75.0));
        enrolless.add(new Enrollee("Sachko1", 90.0));
        enrolless.add(new Enrollee("Sachko2", 82.0));
        enrolless.add(new Enrollee("Chaban", 76.0));
        enrolless.add(new Enrollee("Bukasov", 83.0));
        enrolless.add(new Enrollee("Korol", 95.0));
        enrolless.add(new Enrollee("SomeLooser1", 59.0));
        enrolless.add(new Enrollee("SomeLooser2", 24.0));

        System.out.println("Task1 (printing all enrollees that shouldn't pay for the university:");
        service.task1(enrolless, 3);
        System.out.println('\n');


        University kpi = new University("KPI");
        Faculty FAM = new Faculty("FAM");
        FAM.addStudent(new Student("Mykhailo", "Semenkov", "1", 95.00));
        FAM.addStudent(new Student("Artem", "Chernenkyy", "2", 89.30));
        FAM.addStudent(new Student("Maria", "Moskovko", "3", 88.21));
        FAM.addStudent(new Student("Vladyslav", "Shkilnuk", "4", 87.94));
        FAM.addStudent(new Student("Illia", "Ustymenko", "5", 87.13));
        FAM.addStudent(new Student("Andriy", "Dunets", "6", 86.99));
        Faculty FICT = new Faculty("FICT");
        FICT.addStudent(new Student("Danylo", "Sachko", "7", 94.00 ));
        FICT.addStudent(new Student("Vladyslav", "Kuksiuk", "8", 99.17 ));
        FICT.addStudent(new Student("Oleksandr", "Horduz", "9", 99.33 ));
        FICT.addStudent(new Student("Dmytro", "Sachko", "10", 95.17 ));
        FICT.addStudent(new Student("Oleksandr", "Dudchenko", "11", 97.0 ));
        FICT.addStudent(new Student("Ksenia", "Ivanchenko", "12", 96.67 ));
        FICT.addStudent(new Student("Dmytro", "Ochkas", "13", 96.0 ));
        kpi.addFaculty(FAM);
        kpi.addFaculty(FICT);

        System.out.println("Task2 (printing all students rating of which is higher than the average one:");
        service.task2(kpi);
        System.out.println('\n');


        System.out.println("Task3 (getting all enrollees rating of which is lower than 60 points:");
        service.task3(enrolless)
                .forEach(System.out::println);
    }
}
