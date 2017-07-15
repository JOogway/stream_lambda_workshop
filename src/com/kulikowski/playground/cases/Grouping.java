package com.kulikowski.playground.cases;

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.List;

/**
 * Created by Kasper on 13.07.2017.
 */

/**
 * CASE NO 4
 */
public class Grouping extends BaseCase {
    public static void main(String[] args) {
        List<Dog> dogs = DogCreator.generateByType(NUMBER_OF_DOGS);

        printDogsGroupsByType(dogs);
        printDogsGroupsByTypeSortedByOccurences(dogs);
    }

    private static void printDogsGroupsByType(List<Dog> dogs) {
        //TODO Use stream!
    }

    private static void printDogsGroupsByTypeSortedByOccurences(List<Dog> dogs) {
        //TODO Use stream!
        //TIP: Map.Entry.<DogType, Long>comparingByValue()
    }
}
