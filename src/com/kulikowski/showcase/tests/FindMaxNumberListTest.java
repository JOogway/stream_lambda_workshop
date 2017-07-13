package com.kulikowski.showcase.tests;

import com.kulikowski.showcase.framework.annotations.PerformanceTest;
import com.kulikowski.showcase.utils.BaseTest;
import com.kulikowski.showcase.utils.TestMethods;

import java.util.ListIterator;

/**
 * Created by Kasper on 13.07.2017.
 */

public class FindMaxNumberListTest extends BaseTest implements TestMethods {
    @Override
    @PerformanceTest
    public void stream(){
        Integer max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

    @Override
    @PerformanceTest
    public void forLoop(){
        Integer max = -1;
        for(int i = 0; i < list.size(); i++){
            Integer current = list.get(i);
            if(current > max){
                max = current;
            }
        }
    }

    @Override
    @PerformanceTest
    public void forEach(){
        Integer max = -1;
        for(Integer integer : list){
            if(integer > max){
                max = integer;
            }
        }
    }

    @Override
    @PerformanceTest
    public void iterator() {
        Integer max = -1;
        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next > max){
                max = next;
            }
        }
    }
}
