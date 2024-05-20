package com.util.algo.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    @Test
    public void itTestFindDuplicateWithConstantSpace(){
        int[] input = {3,5,6,3,7,8,1,2};
        List<Integer> dups = findDuplicates.findDuplicatesConstantSpace(input);
        Assertions.assertTrue(dups.contains(3));
    }

    @Test
    public void itTestFindDuplicateWithConstantSpace_One_element(){
        int[] input = {1};
        List<Integer> dups = findDuplicates.findDuplicatesConstantSpace(input);
        Assertions.assertFalse(dups.contains(1));
    }


}
