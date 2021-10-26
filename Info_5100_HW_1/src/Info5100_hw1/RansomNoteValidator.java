package Info5100_hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */

public class RansomNoteValidator {

    /**
     * Question:
     * Given two stings ransomNote and magazine, return true if ransomNote can be constructed
     * from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     * @param input object containing Magazine and RansomNote
     * @return If ransomNote can be created from Magazine or not.
     * NOTE: If ransomNote is null or Empty (no magazine character is needed, it will return true)
     */
    public static boolean validateRansomNote(RansomMagazineInput input) {
        if(input == null) {
            return false;
        }
        String magazine = input.getMagazine();
        String ransomNote = input.getRansomNote();
        if (ransomNote == null || ransomNote.equals("")) {
            // No note needs to be created, so returning true
            return true;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char magazineCharacter = magazine.charAt(i);
            if (hashMap.containsKey(magazineCharacter)) {
                hashMap.put(magazineCharacter, hashMap.get(magazineCharacter) + 1);
            } else {
                hashMap.put(magazineCharacter, 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char validateCharacter = ransomNote.charAt(i);
            if(hashMap.containsKey(validateCharacter)) {
                hashMap.put(validateCharacter, hashMap.get(validateCharacter)-1);
                if(hashMap.get(validateCharacter) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<RansomMagazineInput> testCases = new ArrayList<>();
        testCases.add(new RansomMagazineInput("a", "b"));
        testCases.add(new RansomMagazineInput("aa", "ab"));
        testCases.add(new RansomMagazineInput("aa", "aab"));
        testCases.add(new RansomMagazineInput("aabc", "aabbbcc")); // true
        testCases.add(new RansomMagazineInput("baaa", "aabbbcc")); // false (not enough a's)
        testCases.add(new RansomMagazineInput("aabc", ""));
        testCases.add(new RansomMagazineInput("", "aabc"));
        testCases.add(new RansomMagazineInput("", ""));
        testCases.add(new RansomMagazineInput(null, null));

        for (RansomMagazineInput testCase : testCases) {
            System.out.println(String.format("RansomNode: %s, Magzine: %s, Output: %s",
                    testCase.getRansomNote(),
                    testCase.getMagazine(),
                    validateRansomNote(testCase)));
        }

    }
}


