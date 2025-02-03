// leetcode 217
import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public static void main(String[] args) {
        int []nums = {1,2,3,1};
        if(duplicate(nums)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean duplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(mp.get(i) == 2){
                return true;
            }
        }
        return false;
    }
}
