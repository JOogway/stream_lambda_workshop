package com.kulikowski.playground.cases;

/**
 * Created by Kasper on 16.07.2017.
 */

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * CASE NO 6
 */
public class FlatMapping extends BaseCase {
    public static void main(String[] args) {
        List<Dog> dogs = DogCreator.generateByType(NUMBER_OF_DOGS);

        List<List<Dog>> dogsInNeighbourhood = new ArrayList<>();

        dogsInNeighbourhood.add(DogCreator.generateByType(3));
        dogsInNeighbourhood.add(DogCreator.returnListOfNamedDogs());

        printDogs(dogsInNeighbourhood);
    }

    private static void printDogs(List<List<Dog>> dogs) {
        //TODO Use stream!
    }
}
