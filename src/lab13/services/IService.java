package lab13.services;

import lab13.models.Enrollee;
import lab13.models.University;

import java.util.List;

//tasks 1.1 + 2.2 + 3.1
public interface IService {
    void task1(List<Enrollee> enrollees, int paidPlaces);
    void task2(University university);
    List<Enrollee> task3(List<Enrollee> enrollees);
}
