package question2solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

        public static List<List<String>> groupAnagramsSolution(String[] strs) {
            if(strs==null) {
                return new ArrayList<>();
            }
            HashMap<String, List<String>> anagramsGroup = new HashMap();
            for(String str : strs) {
                char[] result = str.toCharArray();
                Arrays.sort(result);

                String strKey = String.valueOf(result);
                if(anagramsGroup.containsKey(strKey)) {
                    List<String> existingValues = anagramsGroup.get(strKey);
                    existingValues.add(str);
                    anagramsGroup.put(strKey, existingValues);
                } else {
                    List<String> newValues = new ArrayList<String>();
                    newValues.add(str);
                    anagramsGroup.put(strKey, newValues);
                }
            }
            List<List<String>> finalResults = new ArrayList();
            for (String key : anagramsGroup.keySet()) {
                List<String> values = anagramsGroup.get(key);
                finalResults.add(values);
            }
            return finalResults;
        }

        public static void main(String[] args) {
            List<String[]> testcases = new ArrayList<>();
            testcases.add(new String[]{"eat","tea","tan","ate","nat","bat"});
            testcases.add(new String[]{""});
            testcases.add(new String[]{"a"});
            testcases.add(null);

            for (String[] testcase : testcases) {
                System.out.printf("Input strs= %s and  Output = %s%n", Arrays.toString(testcase), groupAnagramsSolution(testcase));
            }
        }
    }


