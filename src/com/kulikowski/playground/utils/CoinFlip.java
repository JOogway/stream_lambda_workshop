package com.kulikowski.playground.utils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Kasper on 15.07.2017.
 */
public class CoinFlip<T> {
    private int result;

    public T flip(T valueIfHeads, T valueIfTails){
        result = ThreadLocalRandom.current().nextInt(2);
        if(result == 0){
            return valueIfHeads;
        }else{
            return valueIfTails;
        }
    }

    public T flip(T firstValue, T secondValue, T thirdValue){
        result = ThreadLocalRandom.current().nextInt(3);
        if(result == 0){
            return firstValue;
        }else if(result == 1){
            return secondValue;
        } else {
            return thirdValue;
        }
    }
}

