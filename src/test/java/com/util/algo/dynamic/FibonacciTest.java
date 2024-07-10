package com.util.algo.dynamic;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    Fibonacci uut = new Fibonacci();

    @Test
    public void findFibonacci(){
        //0,1,1,2,3,5,8
        long start = System.currentTimeMillis();
        int fibo = uut.findFibonacciRecursively(38);
        long end = System.currentTimeMillis();

       System.out.println(end - start);
    }

    @Test
    public void findFibonacciWithOutRecursion(){
        //0,1,1,2,3,5,8,13,21
        long start = System.currentTimeMillis();
        int fibo = uut.findFibonacci(39);
        long end = System.currentTimeMillis();
        System.out.println(fibo);
        System.out.println(end - start);
    }

}
