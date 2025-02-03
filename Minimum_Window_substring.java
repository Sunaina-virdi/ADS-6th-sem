// leetcode 76
import java.util.*;
public class Minimum_Window_substring {
    public static String minWindow(String s,String t){  
        if(s == null || t == null|| s.length() < t.length())
            return "";
        HashMap<Character,Integer> charFreq = new HashMap<>();
        for(char c:t.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c, 0)+1);
        }
        HashMap<Character,Integer> windowCount  = new HashMap<>();
        int start = 0,matched = 0,minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for(int end = 0;end < s.length();end++){
            char endChar = s.charAt(end);
            windowCount.put(endChar,windowCount.getOrDefault(endChar, 0)+1);
                 
            if(charFreq.containsKey(endChar) && windowCount.get(endChar).equals(charFreq.get(endChar))){
                matched++;
            }
            while(matched == charFreq.size()){
                if(end-start+1 < minLen){
                    minLen = end - start  + 1;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                windowCount.put(startChar,windowCount.get(startChar) - 1);
                if(charFreq.containsKey(startChar) && windowCount.get(startChar) < charFreq.get(startChar)){
                    matched--;
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(minStart, minStart+minLen);
    }   
    public static void main(String[] args) {
        // Step 1 : Create map to store the frequency of each character in s2
        // Step 2 : Create windowCoun to store the frequency of characters in current window of s1
        // Step 3 : use two pointers start and end to denote the current window
        // Step 4 : Expand the window by moving the end pointer until all character in s2 are covered
        // Step 5 : Once a valid window is found,shrink it from the left by moving the
 
        String s = "DOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s,t));
    }
}
