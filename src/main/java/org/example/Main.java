package org.example;

import org.example.enums.MovieType;
import org.example.records.Movie;
import org.example.records.Rental;

public class Main {

    public static void main(String[] args) {
        Movie fievelGoesWest = new Movie("Fievel Goes West", MovieType.CHILDREN);
        Customer wylie = new Customer("Wylie Burp");
        wylie.addRental(new Rental(fievelGoesWest, 2));
        System.out.print(wylie.statement());
    }
}
