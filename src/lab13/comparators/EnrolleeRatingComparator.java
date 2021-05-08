package lab13.comparators;

import lab13.models.Enrollee;

import java.util.Comparator;

public class EnrolleeRatingComparator implements Comparator<Enrollee> {
    @Override
    public int compare(Enrollee e1, Enrollee e2) {
        return Double.compare(e1.getRating(), e2.getRating());
    }
}
