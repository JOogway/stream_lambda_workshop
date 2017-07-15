package com.kulikowski.playground.cases;

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.List;
import java.util.Map;

/**
 * Created by Kasper on 15.07.2017.
 */

/**
 * CASE NO 5
 */
public class Mapping extends BaseCase {
    public static void main(String[] args){
        List<Dog> dogs = DogCreator.returnListOfNamedDogs();

        Map<String, Boolean> ownersAndGoodBoys = DogCreator.generateMapOwnerDog();

        List<String> dogNames = retrieveDogNames(dogs);
        dogNames.stream().forEach(System.out::println);

        printOwners(ownersAndGoodBoys);
    }

    private static List<String> retrieveDogNames(List<Dog> dogs) {
        //TODO Use stream!
        return null;
    }

    private static void printOwners(Map<String, Boolean> ownersAndGoodBoys) {
        //TODO Use stream!
    }
}
