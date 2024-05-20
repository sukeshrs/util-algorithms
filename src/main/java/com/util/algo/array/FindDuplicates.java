package com.util.algo.array;

import java.util.*;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] input) {

        List<Integer> list = new LinkedList<>();
        Set<Integer> allNumbersSet = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            if (allNumbersSet.contains(input[i])) {
                list.add(input[i]);
            }
            allNumbersSet.add(input[i]);
        }
        return list;
    }

    public List<Integer> findDuplicatesConstantSpace(int[] input) {
        List<Integer> list = new ArrayList<>();

        for (int num : input) {
            //Find the index for the number. The index is 0 based and numbers are from 1-n so need to subtract 1
            //The array could contain negative values, so Math.abs is needed to convert to positive number.
            System.out.println(num);
            int index = Math.abs(num) - 1;

            if (input[index] < 0) {
                list.add(num);
            } else {
                input[index] = -input[index];
            }
        }
        return list;
    }
}
