package com.kulikowski.showcase.framework;

import com.kulikowski.showcase.framework.annotations.PerformanceTest;
import com.kulikowski.showcase.tests.ActionForEachTest;
import com.kulikowski.showcase.utils.BaseTest;
import com.kulikowski.showcase.utils.TestType;
import com.kulikowski.showcase.tests.FindMaxNumberArrayBoxedTest;
import com.kulikowski.showcase.tests.FindMaxNumberListTest;
import com.kulikowski.showcase.tests.FindMaxNumberArrayUnboxedTest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kasper on 13.07.2017.
 */
public class RunPerformanceTest {
    private static final int NUMBER_OF_REPEATS = 20;

    public static Map<String, Measures> results;

    public static void main(String[] args) throws Exception {
        runPerformanceTestForClass(FindMaxNumberListTest.class, TestType.LIST);
        runPerformanceTestForClass(ActionForEachTest.class, TestType.LIST);
        runPerformanceTestForClass(FindMaxNumberArrayUnboxedTest.class, TestType.ARRAY_UNBOXED);
        runPerformanceTestForClass(FindMaxNumberArrayBoxedTest.class, TestType.ARRAY_BOXED);
    }

    private static void runPerformanceTestForClass(Class testClass, TestType type) {
        results = new HashMap<>();
        System.out.println("-----------------------------------------------------");
        Class<?> obj = testClass;

        System.out.println(testClass.getSimpleName());
        for (int i = 0; i < NUMBER_OF_REPEATS; i++) {
            /**
             * Common for all tests in this iteration
             */
            BaseTest.initialize(type);

            for (Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(PerformanceTest.class)) {

                    Runtime runtime = Runtime.getRuntime();
                    try {
                        long startTime = System.nanoTime();
                        method.invoke(obj.newInstance());
                        long endTime = System.nanoTime();
                        runtime.gc();

                        long executionTime = endTime - startTime;
                        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();

                        Measures methodMeasure = results.get(method.getName());
                        if (methodMeasure == null) {
                            results.put(method.getName(), new Measures(executionTime, memoryUsed));
                        } else {
                            methodMeasure.addToTotalTime(executionTime);
                            methodMeasure.addToTotalMemoryUsed(memoryUsed);
                        }

                    } catch (Throwable ex) {
                        //Ignore
                    }
                }

            }
            System.out.print(".");
        }
        System.out.println();

        for (Map.Entry<String, Measures> entry : results.entrySet()) {
            System.out.format("METHOD: %s | AVG-TIME: %s [millis] | AVG-MEMORY: %s [MB] \n", entry.getKey(), entry.getValue().getTotalTime() / 1000000.0 / NUMBER_OF_REPEATS, entry.getValue().getTotalMemoryUsed()/1024/1024/NUMBER_OF_REPEATS);
        }
    }
}
