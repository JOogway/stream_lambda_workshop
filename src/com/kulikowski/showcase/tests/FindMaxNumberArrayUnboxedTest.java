package com.kulikowski.showcase.tests;

import com.kulikowski.showcase.framework.annotations.PerformanceTest;
import com.kulikowski.showcase.utils.BaseTest;
import com.kulikowski.showcase.utils.TestMethods;

import java.util.Arrays;

/**
 * Created by Kasper on 13.07.2017.
 */
public class FindMaxNumberArrayUnboxedTest extends BaseTest implements TestMethods {
    @Override
    @PerformanceTest
    public void stream() {
        int max = Arrays.stream(arrayUnboxed).max().getAsInt();
    }

    @Override
    @PerformanceTest
    public void forLoop() {
        int max = 0;

        for(int i = 0; i < arrayUnboxed.length; i++){
            if(arrayUnboxed[i] > max){
                max = arrayUnboxed[i];
            }
        }
    }

    @Override
    @PerformanceTest
    public void forEach() {
        int max = 0;

        for(int integer : arrayUnboxed){
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
