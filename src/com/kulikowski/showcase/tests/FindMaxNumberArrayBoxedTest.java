package com.kulikowski.showcase.tests;

import com.kulikowski.showcase.framework.annotations.PerformanceTest;
import com.kulikowski.showcase.utils.BaseTest;
import com.kulikowski.showcase.utils.TestMethods;

import java.util.Arrays;

/**
 * Created by Kasper on 13.07.2017.
 */
public class FindMaxNumberArrayBoxedTest extends BaseTest implements TestMethods {
    @Override
    @PerformanceTest
    public void stream() {
        int max = Arrays.stream(arrayBoxed).mapToInt(Integer::intValue).max().getAsInt();
    }

    @Override
    @PerformanceTest
    public void forLoop() {
        Integer max = 0;

        for(int i = 0; i < arrayBoxed.length; i++){
            if(arrayBoxed[i] > max){
                max = arrayBoxed[i];
            }
        }
    }

    @Override
    @PerformanceTest
    public void forEach() {
        Integer max = 0;

        for(int integer : arrayBoxed){
            if(integer > max){
                max = integer;
            }
        }
    }
    @Override
    public void iterator() {
        //Ignore for array test
    }
}
