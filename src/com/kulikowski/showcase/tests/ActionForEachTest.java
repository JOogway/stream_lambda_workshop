package com.kulikowski.showcase.tests;

import com.kulikowski.showcase.framework.annotations.PerformanceTest;
import com.kulikowski.showcase.utils.BaseTest;
import com.kulikowski.showcase.utils.TestMethods;

import java.util.ListIterator;

/**
 * Created by Kasper on 13.07.2017.
 */

public class ActionForEachTest extends BaseTest implements TestMethods {

    @Override
    @PerformanceTest
    public void stream() {
        list.stream().forEach(integer -> integer += 100);
    }

    @Override
    @PerformanceTest
    public void forLoop() {
        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) + 100);
        }
    }

    @Override
    @PerformanceTest
    public void forEach() {
        for(Integer integer : list){
            integer+=100;
        }
    }

    @Override
    @PerformanceTest
    public void iterator() {
        for (final ListIterator<Integer> i = list.listIterator(); i.hasNext();) {
            final Integer element = i.next();
            i.set(element + 100);
        }
    }
}
