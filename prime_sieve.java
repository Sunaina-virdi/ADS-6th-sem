public class prime_sieve {
    public static void main(String[] args) {
        int n = 100;
        sieve(n);
    }
    public static void sieve(int n) {
        boolean[] isprime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            isprime[i] = true;
        }
        isprime[0] = isprime[1] = false;
        for(int p = 2; p*p <= n; p++){
            if(isprime[p]){
                for(int i = p*p; i <= n; i += p){
                    isprime[i] = false;
                }       
            }
        }
        System.out.println("Prime numbers upto: "+n+" :");
        for(int i = 2;i <= n; i++){
            if(isprime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
