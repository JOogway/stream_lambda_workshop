package com.kulikowski.playground.cases;

/**
 * Created by Kasper on 16.07.2017.
 */

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * CASE NO 7
 */
public class Reducing extends BaseCase {
    public static void main(String[] args) {
        List<Dog> dogs = DogCreator.generateByType(NUMBER_OF_DOGS);

        List<List<Dog>> dogsInNeighbourhood = new ArrayList<>();

        dogsInNeighbourhood.add(DogCreator.generateByType(3));
        dogsInNeighbourhood.add(DogCreator.returnListOfNamedDogs());

        System.out.println(getDogsSeparatedByComma(dogsInNeighbourhood));
        System.out.println(sumArrayUsingReduce(new Integer[]{25, 31, 17, 8, 1, 13, 2}));
    }

    private static String getDogsSeparatedByComma(List<List<Dog>> dogs) {
        //TODO Use stream!
        return null;
    }

    private static Integer sumArrayUsingReduce(Integer[] array) {
        //TODO Use stream!
        return null;
    }
}
