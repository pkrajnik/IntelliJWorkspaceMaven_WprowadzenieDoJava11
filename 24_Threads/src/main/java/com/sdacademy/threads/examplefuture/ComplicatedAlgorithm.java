package com.sdacademy.threads.examplefuture;

import java.util.concurrent.Callable;

public class ComplicatedAlgorithm implements Callable<Integer> {

    private Integer number;

    public ComplicatedAlgorithm(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return calculate();
    }

    private int calculate() {
        return number;
    }
}
