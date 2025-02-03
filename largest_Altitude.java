// leetcode 1732
public class largest_Altitude {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum = 0;
        int maxi = 0;

        for(int i=0;i<n;i++){
            sum += gain[i];
            maxi = Math.max(maxi,sum);
        }

        return maxi;
    }
}
