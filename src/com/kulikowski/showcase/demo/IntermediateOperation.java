package com.kulikowski.showcase.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Kasper on 16.07.2017.
 */
public class IntermediateOperation {
    public static void main(String[] args){
        List<Object> list = new ArrayList<Object>(){{
            add(new Object());
            add(new Object());
            add(new Object());
            add(new Object());
            add(new Object());
        }};

        Stream<Object> stream = list.stream().filter(new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                System.out.println("I am saying something...");
                return true;
            }
        });
    }
}
