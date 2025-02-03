class Valid_Split{
    public static void main(String[] args) {
        int arr[] = {10,4,-8,7};
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
        }
        int count = 0;
        int prefix = 0;
        for(int i=0;i<arr.length-1;i++){
            prefix += arr[i];
            totalsum -= arr[i];
            if(prefix >= totalsum){
                count++;
            }
        }
        System.out.print(count);
    }
}  