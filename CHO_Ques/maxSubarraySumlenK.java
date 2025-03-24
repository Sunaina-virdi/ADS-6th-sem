package CHO_Ques;
// gfg - Max Sum Subarray of size K
public class maxSubarraySumlenK {
    public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int l = 0,sum = 0,maxSum = 0;
        for(int r = 0; r < arr.length; r++){
            sum += arr[r];
            if(r - l + 1 == k){
                maxSum = Math.max(maxSum,sum);
                sum -= arr[l];
                l++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int k = 2;
        System.out.println(maximumSumSubarray(arr, k));
    }
}
