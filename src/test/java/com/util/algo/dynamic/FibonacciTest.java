package com.util.algo.dynamic;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    Fibonacci uut = new Fibonacci();

    @Test
    public void findFibonacci(){
        //0,1,1,2,3,5,8
        int fibo = uut.findFibonacci(38);
       // System.out.println(fibo);
    }

}
