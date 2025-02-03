// leetcode 724
public class Pivot {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            leftsum += nums[i];
        }
        int rightsum = 0;
        for(int i = 0;i<nums.length;i++){
            if(rightsum == leftsum - rightsum- nums[i]){
                return i;
            }
            rightsum += nums[i];
        }
        return -1;
    }
}
