package org.example.records;

/**
 * CustomerBill record stores information relevant to customer billing like amount & frequentRenterPoints.
 * In the future, if we expand to more billing information we can use format of Builder class (ex: Lombok @Data)
 *
 * @param amount
 * @param frequentRenterPoints
 */
public record CustomerBill(double amount, int frequentRenterPoints) {

}
