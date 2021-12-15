package question3solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySumEquals {

        public static int subarraySumSolution(int[] nums, int k) {
            int[] sumTillIndex = new int[nums.length +1];
            int sum = 0;
            sumTillIndex[0] = 0;
            for(int i = 0; i < nums.length; i++) {
                sum += nums[i];
                sumTillIndex[i + 1] = sum;
            }

            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length + 1; j++) {
                    if ((sumTillIndex[j] - sumTillIndex[i]) == k){
                        count++;
                    }
                }
            }
            return count;
        }

        public static void main(String[] args) {
            List<SubArrayInput> testcases = new ArrayList<>();
            testcases.add(new SubArrayInput(new int[]{1,1,1}, 2));
            testcases.add(new SubArrayInput(new int[]{1,2,3}, 3));

            for(SubArrayInput testcase : testcases) {
                System.out.printf("Input: nums=%s, k=%s%n and Output = %s%n", Arrays.toString(testcase.nums) ,testcase.k,
                        subarraySumSolution(testcase.nums, testcase.k));
            }

        }
    }


