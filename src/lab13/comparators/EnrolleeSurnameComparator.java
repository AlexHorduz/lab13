package lab13.comparators;

import lab13.models.Enrollee;

import java.util.Comparator;

public class EnrolleeSurnameComparator implements Comparator<Enrollee> {
    @Override
    public int compare(Enrollee o1, Enrollee o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
