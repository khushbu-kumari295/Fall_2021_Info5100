package com.Info5100.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class ArrayOfTheSquares {

    /**
     * Question:
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
     * number sorted in non-decreasing order
     *
     * Approach:
     * 1. Separate out positive and negative numbers in 2 different array
     * 2. Reverse the negative Array and make all its element positive
     * 3. Merge both array using the method similar to what we use in mergeSort
     * 4. Square each element in merged array which will give the desired (non-descending) output.
     *
     * TimeComplexity: O(n)
     * @param nums = inputarray
     * @return square of nums in non-decreasing order.
     */
    public static int[] arrayOfSquares(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        int[] negativeArray = Arrays.stream(nums).filter(n -> n < 0).toArray();
        int[] positiveArray = Arrays.stream(nums).filter(n -> n >= 0).toArray();

        negativeArray = reverseOfArray(negativeArray);
        negativeArray = makeNegativeToPositiveArray(negativeArray);

        int[] resultArray = mergeArray(negativeArray, positiveArray);
        resultArray = Arrays.stream(resultArray).map(n -> n * n).toArray();
        return resultArray;
    }

    private static int[] reverseOfArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    private static int[] makeNegativeToPositiveArray(int[] arr) {
        return Arrays.stream(arr).map(i -> -1 * i).toArray();
    }

    private static int[] mergeArray(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int[] mergedArray = new int[length];
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int mergedArrayIndex = 0;
        while (firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length) {
            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
                mergedArray[mergedArrayIndex] = firstArray[firstArrayIndex];
                firstArrayIndex++;
            } else {
                mergedArray[mergedArrayIndex] = secondArray[secondArrayIndex];
                secondArrayIndex++;
            }
            mergedArrayIndex++;
        }

        for (; firstArrayIndex < firstArray.length; firstArrayIndex++, mergedArrayIndex++) {
            mergedArray[mergedArrayIndex] = firstArray[firstArrayIndex];
        }

        for (; secondArrayIndex < secondArray.length; secondArrayIndex++, mergedArrayIndex++) {
            mergedArray[mergedArrayIndex] = secondArray[secondArrayIndex];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        List<int[]> testCases = new ArrayList<>();

        testCases.add(new int[]{-4, -1, 0, 3, 10});
        testCases.add(new int[]{-7, -3, 2, 3, 11});
        testCases.add(new int[]{-6, -5, -5, -4}); // All negatives
        testCases.add(new int[]{1, 2, 3, 11}); // all positives

        testCases.add(new int[]{}); // empty
        testCases.add(null); // null

        testCases.forEach(testCase -> {
            int resultArray[] = arrayOfSquares(testCase);
            System.out.println(String.format("Sum of Square for input %s in sorted non-decreasing order is %s",
                    Arrays.toString(testCase),
                    Arrays.toString(resultArray)));
        });
    }
}
