package com.util.algo.dynamic;

import org.junit.jupiter.api.Test;

public class TripleStepTest {

    TripleStep step = new TripleStep();

    @Test
    public void tripleStep(){

        int n = step.findNumberOfWays(9);
        System.out.println(n);

    }
}
