package CHO_Ques;

public class TwoSum {
    public static int[] solve(int nums[],int target){
        int s = 0, e = nums.length - 1;
        while(s < e){
            if(nums[s] + nums[e] == target){
                return new int[]{nums[s] , nums[e]};
            }
            else if(nums[s] + nums[e] > target){
                e--;
            }
            else{
                s++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int target = 9;
        int ans[] = solve(nums,target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
