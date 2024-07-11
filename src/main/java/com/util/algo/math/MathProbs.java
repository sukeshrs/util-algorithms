package com.util.algo.math;

public class MathProbs {
    public int factorial(int n) {
        int fact = 1;

        for(int i=1;i<n;i++){
            fact = fact * (i+1);
        }
        return fact;
    }
}
