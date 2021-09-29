package com.Info5100.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class StringCheck {
    /**
     * Question:
     * Letter followed by Digit: Given a string str write a function which will check if the string no
     * letter followed by another letter, and no digit followed by another digit
     *
     * @param str input
     * @return true if no letter is followed by another letter, and no digit is followed by another digit, false otherwise
     */
    public static boolean checkDigitAndString(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            char currentCharacter = str.charAt(i);
            char nextCharacter = str.charAt(i + 1);
            if (Character.isDigit(currentCharacter) && Character.isDigit(nextCharacter)) {
                return false;
            }
            if (Character.isAlphabetic(currentCharacter) && Character.isAlphabetic(nextCharacter)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> testCases = new ArrayList<>();
        testCases.add("1A3d4s5t");
        testCases.add("A2bb2d4");
        testCases.add("");
        testCases.add(null);

        for (String testCase : testCases) {
            System.out.println(String.format("Input: %s, Output: %s",
                    testCase,
                    checkDigitAndString(testCase)));
        }
    }
}
