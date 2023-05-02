package org.example.records;

/**
 * This data class stores information about rental of a movie and for how many days it is stored;
 * Fix: Reduced boilerplate by changing to record type - immutable objects
 *
 * @param movie
 * @param daysRented
 */
public record Rental(Movie movie, int daysRented) {

}
