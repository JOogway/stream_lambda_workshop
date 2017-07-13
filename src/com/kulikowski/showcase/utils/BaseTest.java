package com.kulikowski.showcase.utils;

import java.util.List;

/**
 * Created by Kasper on 13.07.2017.
 */
public class BaseTest {
    protected static final int NUMBER_OF_ELEMENTS = 1000000;

    protected static List<Integer> list;
    protected static Integer[] arrayBoxed;
    protected static int[] arrayUnboxed;

    public static void initialize(TestType type){
        list = null;
        arrayBoxed = null;
        arrayUnboxed = null;

        switch(type){
            case LIST:
                list = DataProvider.createListOfIntegers(NUMBER_OF_ELEMENTS);
                break;
            case ARRAY_BOXED:
                arrayBoxed = DataProvider.createArrayOfIntsBoxed(NUMBER_OF_ELEMENTS);
                break;
            case ARRAY_UNBOXED:
                arrayUnboxed = DataProvider.createArrayOfIntsUnboxed(NUMBER_OF_ELEMENTS);
                break;
        }
    }
}
