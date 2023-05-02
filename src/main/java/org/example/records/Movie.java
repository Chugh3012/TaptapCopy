package org.example.records;

import org.example.enums.MovieType;

/**
 * Movie contains title & priceCode as objects;
 * There are 3 movie types right now, extend into new one, basically move to enum;
 * Fix: Movie class is a data class, for now makes sense to use record, but later on if number of parameters increase,
 * we can use lombok generation to have a builder class which will also help avoid boilerplate;
 * Changing priceCode to movieType because movie type can be used to determine not only price but something else in the future;
 *
 * @param title
 * @param movieType
 */
public record Movie(String title, MovieType movieType) {

}
