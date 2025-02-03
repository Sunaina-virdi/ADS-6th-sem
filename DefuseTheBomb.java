// leetcode 1652
public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int k = 3;
        int[] res = decrypt(code, k);

        // Print the result to verify
        for (int val : res) {
            System.out.print(val + " ");
        }
        
    }
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int []res = new int[n];
        if(k == 0){
            return res;
        }
        int start, end ,step;
        if(k > 0){
            start = 1;
            end = k;
            step = 1;
        }
        else{
            start = -1;
            end = k;
            step = -1;
            k = -k;
        }
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j = 1;j <= k; j++){
                int index = (i + ( j * step) + n) % n;
                sum += code[index];
            }
            res[i] = sum;
        }
        return res;
    }
}
