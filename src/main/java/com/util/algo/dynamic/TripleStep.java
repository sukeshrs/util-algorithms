package com.util.algo.dynamic;

public class TripleStep {
    public int findNumberOfWays(int i) {
        if(i<0){
            return 0;
        }
        if(i==0){
            return 1;
        }
        if(i==1){
            return 1;
        }

        if (i==2){
            return 2;
        }

        int a = 1;
        int b = 1;
        int c = 2;

        for(int j=3;j<=i;j++){
            int temp = c;
            c = a + b + c;
            a = b;
            b = temp;
        }
        return c;
    }
}
