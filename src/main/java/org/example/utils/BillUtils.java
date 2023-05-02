package org.example.utils;

import lombok.experimental.UtilityClass;
import org.example.enums.MovieType;
import org.example.records.CustomerBill;

/**
 * BillUtils is a utility class which stores static information such as rules for bill & frequent point calculation;
 */
@UtilityClass
public class BillUtils {

    public CustomerBill calculateCustomerBill(MovieType movieType, int daysRented) {
        double amount = calculateRent(movieType, daysRented);
        int frequentRenterPoints = calculateFrequentRenterPoints(movieType, daysRented);
        return new CustomerBill(amount, frequentRenterPoints);
    }

    private int calculateFrequentRenterPoints(MovieType movieType, int daysRented) {
        return switch (movieType) {
            case NEW_RELEASE -> (daysRented > 1 ? 1 : 0);
            case REGULAR, CHILDREN, CLASSIC -> 0;
        };
    }

    private double calculateRent(MovieType movieType, int daysRented) {
        return switch (movieType) {
            case REGULAR -> calculateRegularAmount(daysRented);
            case NEW_RELEASE -> calculateNewReleaseAmount(daysRented);
            case CHILDREN -> calculateChildrenAmount(daysRented);
            case CLASSIC -> calculateClassicAmount(daysRented);
        };
    }

    private double calculateRegularAmount(int daysRented) {
        return 2 + (daysRented > 2 ? (daysRented - 2) * 1.5 : 0);
    }

    private double calculateNewReleaseAmount(int daysRented) {
        return daysRented * 3;
    }

    private double calculateChildrenAmount(int daysRented) {
        return 1.5 + (daysRented > 3 ? (daysRented - 3) * 1.5 : 0);
    }

    private double calculateClassicAmount(int daysRented) {
        return daysRented;
    }
}
