// leetcode 1413
public class Minimum_Value {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int val = 1;

        while(sum <= 0){
            sum += val;
            for(int i=0;i<nums.length;i++){
                sum += nums[i];
                if(sum <= 0){
                    sum = 0;
                    val++;
                    break;
                }
            }
        }
        return val;
    }
}
