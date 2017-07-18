package com.kulikowski.playground.cases;

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;
import com.kulikowski.playground.utils.doggos.DogType;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        dogs.stream().collect(Collectors.groupingBy(Dog::getType, Collectors.counting())).forEach((key, value) -> System.out.println(key+" "+value));
    }

    private static void printDogsGroupsByTypeSortedByOccurences(List<Dog> dogs) {
        //TODO Use stream!
        //TIP: Map.Entry.<DogType, Long>comparingByValue()
    }
}
