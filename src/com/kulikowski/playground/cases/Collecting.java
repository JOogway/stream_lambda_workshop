package com.kulikowski.playground.cases;

import com.kulikowski.playground.utils.doggos.Dog;
import com.kulikowski.playground.utils.doggos.DogCreator;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kasper on 15.07.2017.
 */

/**
 * CASE NO 2
 */
public class Collecting extends BaseCase {
    public static void main(String[] args) {
        Dog[] dogArray = DogCreator.generateGoodBoysArray(NUMBER_OF_DOGS);

    }

    private static List<Dog> dogArrayToList(Dog[] dogs) {
        //TODO Use stream!
        //NOTE: Forbidden: Arrays.asList(dogs), new ArrayList<>(dogs), etc. ONLY STREAM API!
        //TIP: Arrays.stream(arr)

       // return null;
        return Arrays.asList(dogs);
    }
}