package com.Info5100.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class FirstNonRepeatedInteger {

    /**
     * Question:
     * first non-repeated integer in an array.
     *
     * @param nums = input array
     * @return first non-repeated integer or -1 if input is invalid (Either all integers are repeated or inputArray is null)
     */
    public static int firstNonRepeatedInteger(int[] nums) {
        if (nums == null) {      //invalid input
            return -1;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int element : nums) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
            } else {
                hashMap.put(element, 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<int[]> testCases = new ArrayList<>();

        testCases.add(new int[]{2, 3, 4, 2, 2, 3, 5, 7});
        testCases.add(new int[]{3, 3, 4, 2, 4, 5, 5, 7});
        testCases.add(new int[]{2, 2, 2, 2}); // this returns -1
        testCases.add(new int[]{}); // this return -1
        testCases.add(null); // returns -1

        testCases.forEach(testCase -> {
            int result = firstNonRepeatedInteger(testCase);
            System.out.println(String.format("First non-repeated integer for the input %s is %s",
                    Arrays.toString(testCase),
                    (result)));
        });
    }
}


