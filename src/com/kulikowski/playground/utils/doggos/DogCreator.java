package com.kulikowski.playground.utils.doggos;

import com.kulikowski.playground.utils.CoinFlip;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.kulikowski.playground.utils.doggos.DogType.*;

/**
 * Created by Kasper on 15.07.2017.
 */
public class DogCreator {
    private DogCreator(){}

    private static ArrayList<String> owners = new ArrayList<String>() {{
        add("Jack");
        add("Adam");
        add("Harold");
        add("Caroline");
        add("Billy");
        add("Elizabeth");
        add("Ernest");
    }};

    public static Map<String, Boolean> generateMapOwnerDog(){
        return owners.stream()
                .map(owner -> new Dog(owner, isGoodBoy()))
                .collect(Collectors.toList()).stream()
                .collect(Collectors.toMap(Dog::getOwner, Dog::isGoodBoy));
    }

    public static List<Dog> returnListOfNamedDogs(){
        return new ArrayList<Dog>(){{
            add(new Dog("Rex"));
            add(new Dog("Flex"));
            add(new Dog("Bex"));
            add(new Dog("Wex"));
            add(new Dog("Gex"));
            add(new Dog("Hex"));
            add(new Dog("Lex"));
        }};
    }

    public static Dog[] generateGoodBoysArray(int numberOfDogs){
        return Stream.generate(() -> createGoodOrBadBoy()).limit(numberOfDogs).toArray(Dog[]::new);
    }

    public static List<Dog> generateGoodBoysList(int numberOfDogs){
        return IntStream
                .rangeClosed(1, numberOfDogs)
                .mapToObj(i -> createGoodOrBadBoy())
                .collect(Collectors.toList());
    }

    private static Dog createGoodOrBadBoy(){
        return new Dog(isGoodBoy());
    }

    private static boolean isGoodBoy(){
        return new CoinFlip<Boolean>()
                .flip(true, false);
    }

    public static List<Dog> generateByType(int numberOfDogs){
        return IntStream
                .rangeClosed(1, numberOfDogs)
                .mapToObj(i -> new Dog(
                        new CoinFlip<DogType>()
                        .flip(MONGREL, GOLDEN_RETRIEVER, PITBULL))
                ).collect(Collectors.toList());
    }


}
