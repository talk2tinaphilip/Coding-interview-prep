/*
Given an array of integers, find two numbers such that they add up to a specific target
number.
Using Hashmap -> O(n) - runtime, O(n) - space
 */
package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHmap {
        public static int[] twoSum(int[] numbers, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < numbers.length; i++) {
                int x = numbers[i];
                if (map.containsKey(target - x)) {
                    return new int[] { map.get(target - x) + 1, i + 1 };
                }
                map.put(x, i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    public static void main(String args[]){
        int intArray[] = {2,5,3,8,9};
        int sum = 5;
        int[] index = twoSum(intArray, sum);
        for(int i = 0; i< index.length; i++)
            System.out.println(index[i]);
    }
}
