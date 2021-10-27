package question3solution;

import java.util.*;

public class SumOfNumOfRepeated {

    public static int sumOfRepeatedNum(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i] + 1));
            }

        }
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(hashMap.get(nums[i]) > 1) {
                int result = hashMap.get(nums[i]);
                sum+= result;
            }
        }

        return sum;
    }


    public static void main(String[] args) {
	// write your code here
        List<int[]> testcases = new ArrayList<>();
        testcases.add(new int[] {1,3,-1,3,4,-1});
        testcases.add(new int[] {2,2,1,3,4});

        for(int[] testcase : testcases) {
            System.out.printf("Input nums = %s, Output = %s", Arrays.toString(testcase), sumOfRepeatedNum(testcase));
        }
    }
}
