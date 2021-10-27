package question3solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

        public static int lengthOfLongestSubstring(String s) {
            if (s == null || s.equals("")) {
                return 0;
            }
            char[] charArray = s.toCharArray();
            HashSet<Character> seenCharacters = new HashSet<>();
            int frontIndex = 0;
            int backIndex = 0;
            int maxCount = 0;

            while (frontIndex < charArray.length) {
                if (!seenCharacters.contains(charArray[frontIndex])) {
                    seenCharacters.add(charArray[frontIndex]);
                    maxCount = Math.max(maxCount, seenCharacters.size());
                    frontIndex++;
                } else {
                    seenCharacters.remove(charArray[backIndex]);
                    backIndex++;
                }
            }
            return maxCount;
        }

        public static void main(String[] args) {
            List<String> testcases = new ArrayList<>();
            testcases.add("abcabcbb");
            testcases.add("aaabcddef");
            testcases.add("");

            for (String testacse : testcases) {
                System.out.printf("Input = %s and Output = %s%n", testacse, lengthOfLongestSubstring(testacse));
            }
        }
    }


