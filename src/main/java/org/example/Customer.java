package org.example;

import lombok.RequiredArgsConstructor;
import org.example.records.Rental;
import org.example.records.CustomerBill;
import org.example.utils.BillUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer class stores the name of a customer and all the rentals they have in an array;
 */
@RequiredArgsConstructor
public class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = rentals.size();

        StringBuilder result = new StringBuilder("Rental record for " + name + "\n");

        for (Rental rental : rentals) {
            CustomerBill customerBill = BillUtils.calculateCustomerBill(rental.movie().movieType(), rental.daysRented());
            totalAmount += customerBill.amount();
            frequentRenterPoints += customerBill.frequentRenterPoints();
        }

        result.append("Amount owed is " + totalAmount + "\n");
        result.append("You earned " + frequentRenterPoints + " frequent renter points\n");

        return result.toString();
    }
}
