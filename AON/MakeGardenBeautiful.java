package AON;
public class MakeGardenBeautiful {
    public static int solve(int[]arr){
        int n = arr.length - 1;
        int first = arr[0];
        int second = arr[n];
        if(arr.length == 2){
            return first+second;
        }
        int large = first > second ? first : second;
        // System.out.println(large);
        int small = first > second ? second : first;
        // System.out.println(small);
        for(int i=1;i<n;i++){
            if(arr[i] > small){
                small = arr[i];
            }
        }
        return large + small;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,3,1};
        System.out.println(solve(arr));
    }
}