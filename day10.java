import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted word as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array, sort it, then back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add word into the correct group
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Return all groups as a list
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        // Print result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}



Problem : Group Anagrams
You are given an array of strings strs[]. Your task is to group all the strings that are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
The goal is to return the grouped anagrams as a list of lists, where each sublist contains words that are anagrams of each other.

Input :
An array of strings strs[] consisting of lowercase English letters.
Input: strs[] = ["eat", "tea", "tan", "ate", "nat", "bat"]

Output :
A list of lists, where each sublist contains strings that are anagrams of each other. The order of the output groups does not matter.
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
