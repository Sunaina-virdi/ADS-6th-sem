public class TowerOfHanoi {
    // You are given a three rods and n dics stacked in one rod in an increasing order of size from top to bottom
    // only one disc can be moved at a time
    // a larger disc cannot be placed on a smaller disc
    // you can use three rods
    // Recursive formula = T (N) -> 2T(N-1)+1
    // T(1) = 1
    // TIME COMPLEXITY = O(2^n)
    // SPACE COMPLEXITY = O(n)

    // ALGORITHM:

    // Move N - 1 disks from source to auxiliry()
    // Move the Nth disk directly from source to destination
    // Move N-1 disks from auxiliry to Destination (source helper)
    public static void sh(int n,char s,char aux,char d){
        if(n == 1){
            System.out.println("move disk 1 from "+s+" to "+d);
            return;
        }
        sh(n - 1, s, d, aux);
        System.out.println("Move disk"+n+" from "+s+" to "+d);
        sh(n - 1, aux, s, d);
    }
    public static void main(String[] args) {
        int n = 3;
        sh(n,'A','B','C');
    }
}
