package CHO_Ques;
import java.util.Arrays;

public class Smallest_Largest{
    public static int[] solve(int[] arr,int k){
        Arrays.sort(arr);
        return new int[]{arr[k-1],arr[arr.length - k]};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,9,6,4};
        int k = 4;
        int ans[] = solve(arr,k);
        for(int i : ans){
            System.out.println(i);
        }
    }
}