package com.util.algo.math;

import org.junit.jupiter.api.Test;

public class MathProbsTest {
    MathProbs probs = new MathProbs();

    @Test
    public void factorialTest(){
        int fact = probs.factorial(5);
        System.out.println(fact);
    }
}
