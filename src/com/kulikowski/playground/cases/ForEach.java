package com.kulikowski.playground.cases;

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.List;
import java.util.Map;

/**
 * Created by Kasper on 13.07.2017.
 */

/**
 * CASE NO 1
 */
public class ForEach extends BaseCase {
    public static void main(String[] args){
        List<Dog> dogs = DogCreator.generateGoodBoysList(NUMBER_OF_DOGS);
        Map<String, Boolean> ownersAndGoodBoys = DogCreator.generateMapOwnerDog();

        printAllDogs(dogs);
        printOwnersWithGoodBoys(ownersAndGoodBoys);
    }

    private static void printAllDogs(List<Dog> dogs){
        //TODO Use stream!
    }

    private static void printOwnersWithGoodBoys(Map<String, Boolean> ownersAndGoodBoys) {
        //TODO Use stream!
    }
}
