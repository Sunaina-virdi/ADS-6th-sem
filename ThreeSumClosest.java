// leetcode 16

// Find the Closest Pair to Target (Medium)
// Given a sorted array, find two numbers whose sum is closest to but less than the target  

// Example:
// Input: arr = [1, 3, 5, 8, 10], target = 14
// Output: [5, 8] (because 5 + 8 = 13, which is the closest sum less than 14)  

import java.util.*;
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int[] result = Sum3Closest(nums, target);
        System.out.println("Closest Sum Triplet: " + Arrays.toString(result));
    }
    public static int[] Sum3Closest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[3]; // To store the three numbers forming the closest sum
    
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
    
            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
    
                if (Math.abs(target - currSum) < Math.abs(target - closestSum)) {
                    closestSum = currSum;
                    result[0] = nums[i];
                    result[1] = nums[left];
                    result[2] = nums[right];
                }
    
                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--;
                } else {
                    result[0] = nums[i];
                    result[1] = nums[left];
                    result[2] = nums[right];
                    return result; 
                }
            }
        }
        return result;
    }
    
}
