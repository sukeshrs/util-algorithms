package com.util.algo.dynamic;

import java.util.Arrays;

public class Fibonacci {
    public int findFibonacciRecursively(int i) {
        long start = System.currentTimeMillis();
        int[] array = new int[i+1];
        int num = fibonacci(i, array);
        //System.out.println(array);
        //Arrays.stream(array).forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return fibonacci(i, array);
    }


    private int fibonacci(int i, int[] array) {
        if(array[i] !=0){
            return array[i];
        }
        if(i ==1){
            array[i] = 0;
            return 0;
        }
        if(i == 2){
            array[i] = 1;
            return 1;
        }
        int fibo = fibonacci(i -1, array) + fibonacci(i -2, array);
        array[i] = fibo;
        return fibo;
    }

    /**
     * Fibonacci without recursion.
     * The first 4 numbers are immediately returned with out running through the loop
     *
     * @param i
     * @return
     */
    public int findFibonacci(int i) {
        if(i == 0){
            return 0;
        }
        if(i == 1 || i == 2){
            return 1;
        }
        int a = 1;
        int b = 2;

        for(int j=4 ; j< i;j++  ){
            int temp;
            temp = b;
            b = a + b;
            a = temp;

        }
        return b;
    }
}
