package com.util.algo.array;

import java.util.*;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] input) {

        List<Integer> list = new LinkedList<>();
        Set<Integer> allNumbersSet =  new HashSet<>();

        for(int i=0 ;i< input.length ; i++){
            if(allNumbersSet.contains(input[i])){
                list.add(input[i]);
            }
            allNumbersSet.add(input[i]);
        }
        return list;
    }
}
