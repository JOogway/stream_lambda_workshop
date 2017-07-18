package com.kulikowski.showcase.bonus.performance.tests;

import com.kulikowski.showcase.bonus.performance.framework.annotations.PerformanceTest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import static java.lang.Math.sqrt;
import static java.util.stream.IntStream.range;
import static java.util.stream.LongStream.rangeClosed;

/**
 * Created by Kasper on 18.07.2017.
 */
public class ParallelStreamTest {

    @PerformanceTest
    public void testParallelStreamCustomForkJoinPool() {
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        ForkJoinTask task = forkJoinPool.submit(() -> System.out.format("\nThere are %d primes in specified range\n", range(1, 1_000_000).parallel().filter(ParallelStreamTest::isPrime).count()));
        task.join();
    }

    @PerformanceTest
    public void testStream() {
        System.out.format("\nThere are %d primes in specified range\n", range(1, 1_000_000).filter(ParallelStreamTest::isPrime).count());
    }

    @PerformanceTest
    public void testParallelStreamCommonForkJoinPool() {
        System.out.format("\nThere are %d primes in specified range\n", range(1, 1_000_000).parallel().filter(ParallelStreamTest::isPrime).count());
    }

    public static Boolean isPrime(long n) {
        return n > 1 && rangeClosed(2, (long) sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }
}
