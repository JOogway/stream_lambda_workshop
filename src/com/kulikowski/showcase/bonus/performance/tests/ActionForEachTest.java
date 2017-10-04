package com.kulikowski.showcase.bonus.performance.tests;

import com.kulikowski.showcase.bonus.performance.framework.annotations.PerformanceTest;
import com.kulikowski.showcase.bonus.performance.utils.BaseTest;
import com.kulikowski.showcase.bonus.performance.utils.TestMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Kasper on 13.07.2017.
 */

public class ActionForEachTest extends BaseTest implements TestMethods {

    @Override
    @PerformanceTest
    public void stream() {
        List<Integer> result = new ArrayList<>();
        list.stream().forEach(integer -> result.add(integer+100));
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
        int i = 0;
        for(Integer integer : list){
            list.set(i, integer + 100);
            i++;
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
