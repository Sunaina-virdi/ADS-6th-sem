// leetcode 125
public class ValidPalindrome {
    public boolean alphanumeric(char ch){
        if(ch >= 'a' && ch <='z' || ch >= '0' && ch <= '9'){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int n = s.length();
        int start = 0;
        int end = n-1;
        boolean flag = false;
        while(start <= end){
            if(alphanumeric(s.charAt(start)) && alphanumeric(s.charAt(end)) ){
                if(s.charAt(start) == s.charAt(end)){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
            else if(!alphanumeric(s.charAt(start)) && !alphanumeric(s.charAt(end))){
                start++;
                end--;
            }
            else if(!alphanumeric(s.charAt(start))){
                start++;
            }
            else{
                end--;
            }
        }
        return true;
    }
}
