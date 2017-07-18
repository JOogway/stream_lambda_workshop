package com.kulikowski.showcase.bonus.performance.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Kasper on 13.07.2017.
 */
public class DataProvider {
    public static List<Integer> createListOfIntegers(int size){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(ThreadLocalRandom.current().nextInt(0, 10000));
        }
        return list;
    }

    public static Integer[] createArrayOfIntsBoxed(int size){
        Integer[] array = new Integer[size];

        for (int i = 0; i < size; i++){
            array[i] = new Integer(ThreadLocalRandom.current().nextInt(0, 10000));
        }
        return array;
    }

    public static int[] createArrayOfIntsUnboxed(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = new Integer(ThreadLocalRandom.current().nextInt(0, 10000));
        }
        return array;
    }
}
