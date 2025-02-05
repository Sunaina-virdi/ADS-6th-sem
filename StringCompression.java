// String compression (443)

public class StringCompression {
    public static String compress(String s) {
        if(s == null || s.length() == 0) return "";
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                ans.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        ans.append(s.charAt(s.length()-1)).append(count);
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbc";
        System.out.println(compress(s));
    }
}
