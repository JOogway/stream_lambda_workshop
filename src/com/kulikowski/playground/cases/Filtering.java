package com.kulikowski.playground.cases;

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.List;

/**
 * Created by Kasper on 13.07.2017.
 */

/**
 * CASE NO 3
 */
public class Filtering extends BaseCase {
    public static void main(String[] args){
        List<Dog> dogs = DogCreator.generateGoodBoysList(NUMBER_OF_DOGS);

        System.out.println("Number of good dogs: " + howManyGoodDogs(dogs) + "/" + NUMBER_OF_DOGS);
    }

    private static long howManyGoodDogs(List<Dog> dogs){
        //TODO Use stream!
        return 0;
    }
}
