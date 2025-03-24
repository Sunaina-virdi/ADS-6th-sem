package CHO_Ques;
// leetcode 442
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Duplicate {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(int i : mp.keySet()){
            if(mp.get(i) > 1){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
