public class RecursionIntro {
    //Types of Recursion 
    // direct
    // indirect
    // tail
    // head
    public static int binary(int[]arr,int target,int left,int right){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return binary(arr,target,left,mid-1);
        }
        else{
            return binary(arr,target,mid+1,right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {11,15,18,20,21,22};
        int target = 18;

        int index = binary(arr,target,0,arr.length-1);
        System.out.println(index);
    }
}
