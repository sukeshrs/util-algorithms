package com.util.algo;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class CollectionTiming {


    /**
     * Sample result when running the code
     * Linkedlist insert time : 2081
     * Hashmap insert time : 1045
     * ArrayList insert time : 399
     * Linked HashSet insert time :1013
     * HashSet insert time :817
     * @param args
     */
    public static void main(String[] args)  {
        List<Long> longList = new LinkedList<>();
        long maxValue = 10000000;
        Instant startTime = Instant.now();
        for (long l = 0; l < maxValue; l++) {
            longList.add(l);
        }
        Instant endTime = Instant.now();
        System.out.println("Linkedlist insert time : " + Duration.between(startTime, endTime).toMillis());

        Map<Long, Long> test = new HashMap<>();
        Instant startTimeMap = Instant.now();
        for (long l = 0; l < maxValue; l++) {
            test.put( l, l);
        }
        Instant endTimeMap = Instant.now();
        System.out.println("Hashmap insert time : " + Duration.between(startTimeMap, endTimeMap).toMillis());


        List<Long> longArrayList = new ArrayList<Long>();
        Instant startTimeList = Instant.now();
        for (long l = 0; l < maxValue; l++) {
            longArrayList.add(l);
        }
        Instant endTimeList = Instant.now();
        System.out.println("ArrayList insert time : " + Duration.between(startTimeList, endTimeList).toMillis());

        Set<Long> longSet = new LinkedHashSet<>();

        Instant startTimeLinkedHashSet = Instant.now();
        for (long l = 0; l < maxValue; l++) {
            longSet.add(l);
        }
        Instant endTimeLinkedHashSet = Instant.now();
        System.out.println("Linked HashSet insert time :" + Duration.between(startTimeLinkedHashSet, endTimeLinkedHashSet).toMillis());

        Set<Long> hashSet = new HashSet<>();
        Instant startTimeHashSet = Instant.now();
        for (long l = 0; l < maxValue; l++) {
            hashSet.add(l);
        }
        Instant endTimeHashSet = Instant.now();
        System.out.println("HashSet insert time :" + Duration.between(startTimeHashSet, endTimeHashSet).toMillis());
    }
}
