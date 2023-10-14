package com.util.algo.array;

import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;

public class BestTimeToBuyAndSellStockITest {

    BestTimeToBuyAndSellStockI uut = new BestTimeToBuyAndSellStockI();

    @Test
    public void itReturnsTheLargestProfit(){
        int array[] = {7,1,5,3,6,4};
        int profit = uut.getTheLargestProfit(array);
        assertEquals(5, profit);
    }

    @Test
    public void itReturnsTheLargestProfitSecond(){
        int array[] = {1,2,3,4};
        int profit = uut.getTheLargestProfit(array);
        assertEquals(3, profit);
    }


    @Test
    public void itReturnsTheLargestProfitAsOne(){
        int array[] = {1,1,1,1,2,1};
        int profit = uut.getTheLargestProfit(array);
        assertEquals(1, profit);
    }
}
