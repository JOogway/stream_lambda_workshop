package com.kulikowski.showcase.bonus.performance.framework;

/**
 * Created by Kasper on 13.07.2017.
 */
public class Measures {
    long totalTime;
    long totalMemoryUsed;

    public Measures(long totalTime, long totalMemoryUsed) {
        this.totalTime = totalTime;
        this.totalMemoryUsed = totalMemoryUsed;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public long getTotalMemoryUsed() {
        return totalMemoryUsed;
    }

    public void addToTotalTime(long amount){
        this.totalTime +=amount;
    }

    public void addToTotalMemoryUsed(long amount){
        this.totalMemoryUsed +=amount;
    }
}
