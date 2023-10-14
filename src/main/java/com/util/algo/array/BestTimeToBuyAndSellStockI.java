package com.util.algo.array;

public class BestTimeToBuyAndSellStockI {
    public int getTheLargestProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int largestDifference = 0;

        //{7,1,5,3,6,4}

        for(int i=0 ; i < prices.length ;i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            }else {
                largestDifference = Math.max(largestDifference, prices[i] - minValue);
            }
        }
        return largestDifference;
    }
}
