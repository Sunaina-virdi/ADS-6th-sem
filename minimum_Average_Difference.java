// leetcode 2256
public class minimum_Average_Difference {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        long[] suffix = new long[n];
        suffix[n-1] = nums[n-1];
        for(int i = nums.length - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] + nums[i];
        }

        long mini = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < n; i++){
            long left = prefix[i] / (i+1);
            long right = (i == n - 1) ? 0 : suffix[i+1] / (n-i-1);
            long sum = Math.abs( left - right);

            if(sum < mini){
                mini = sum;
                index = i;
            }
        }
        return index;
    }
}
