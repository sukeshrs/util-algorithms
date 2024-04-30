package com.util.algo.array;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FindDuplicatesTest {

    FindDuplicates findDuplicates = new FindDuplicates();
    @Test
    public void itTestsFindDuplicateMethod(){
        int[] input = {3,5,6,3,7,8,9,2};
        List<Integer> duplicates = findDuplicates.findDuplicates(input);
        System.out.println(duplicates);
    }

    @Test
    public void itTestsFindDuplicateMethodWhenAllAreSame(){
        int[] input = {8,8,8,8,8,8,};
        List<Integer> duplicates = findDuplicates.findDuplicates(input);
        System.out.println(duplicates);
    }


}
