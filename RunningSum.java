// leetcode 1480
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int prefix = 0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            ans[i] = prefix;
        }
        return ans;
    }
}
