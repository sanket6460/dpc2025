import java.util.*;

public class CountKDistinctSubstrings {
    
    // Function to count substrings with at most K distinct characters
    public static int atMostKDistinct(String s, int k) {
        int n = s.length();
        int left = 0, count = 0;
        Map<Character, Integer> freq = new HashMap<>();
        
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            
            count += (right - left + 1);
        }
        return count;
    }
    
    // Function to count substrings with exactly K distinct characters
    public static int exactlyKDistinct(String s, int k) {
        return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
    }
    
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println("Output: " + exactlyKDistinct(s, k)); // Output: 7
    }
}




Problem : Count Substrings with Exactly K Distinct Characters
You are given a string s of lowercase English alphabets and an integer k. Your task is to count all possible substrings of s that contain exactly k distinct characters.

Input :
* A string s consisting of lowercase English letters.
* An integer k, where 1 ≤ 𝑘 ≤ 26
* The length of the string satisfies 1 ≤ 𝑛 ≤ 104
* Example - s = "pqpqs", k = 2

Output :
Return an integer that represents the number of substrings of s that contain exactly k distinct characters.
Output: 7
