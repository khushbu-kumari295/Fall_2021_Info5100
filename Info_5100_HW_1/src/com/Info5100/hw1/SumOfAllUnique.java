package com.Info5100.hw1;

import java.util.*;

/**
 * Author: Khushbu Kumari
 */
public class SumOfAllUnique {

    /**
     * Question:
     * You are given an integer array nums. The unique elements of an array are the elements that
     * appear exactly once in the array.
     * Return the sum of all the unique elements of nums.
     *
     * @param num input array with possibly duplicate elements
     * @return sum of unique element
     */
    public static int sumOfAllUnique(int[] num) {
        if (num == null) {
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int element : num) {
            if (!hashMap.containsKey(element)) {
                hashMap.put(element, 1);
            } else {
                hashMap.put(element, 0);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> itr = hashMap.entrySet().iterator();
        int sum = 0;
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entryOfHashMap = itr.next();
            if (entryOfHashMap.getValue() == 1) {
                sum += entryOfHashMap.getKey();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Running the main method...\n");

        List<int[]> testCases = new ArrayList<>();

        testCases.add(new int[]{1, 2, 3, 2});
        testCases.add(new int[]{1, 1, 1, 1, 1});
        testCases.add(new int[]{1, 2, 3, 4, 5});
        testCases.add(new int[]{});
        testCases.add(null);

        for (int[] input: testCases) {
            System.out.println(String.format("Sum of Unique elements in array: %s is %s",
                    Arrays.toString(input),
                    SumOfAllUnique.sumOfAllUnique(input)
            ));
        }
    }
}
