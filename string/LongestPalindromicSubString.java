package string;
import java.util.*;
public class LongestPalindromicSubString {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                // If the current character is already in the map, move the start pointer to the right of the previous occurrence
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            // Update the index of the current character in the map
            charIndexMap.put(currentChar, end);
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }



//    public String longestPalindrome(String s){
//        int start = 0;
//        int end = 0;
//        // string ke length tak chalenge
//        for (int i = 0; i < s.length(); i++){
//            int length1 = expandAroundCenter(s,i,i+1); // edge cases b a a b
//            int length2 = expandAroundCenter(s,i,i); // edge cases b a b
//            int maxLength = Math.max(length1,length2);
//            //update karenge start or end index ko
//            if (end - start < maxLength){
//                start = i - (maxLength - 1) / 2;
//                end = i + maxLength/2;
//            }
//        }
//        return s.substring(start,end+1);
//    }
//    int expandAroundCenter(String s , int i , int j){
////        System.out.println("Expanding around center " + i + ", " + j); // for debug
//        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
////            System.out.println("Checking characters " + s.charAt(i) + " and " + s.charAt(j)); for debug
//            i--;
//            j++;
//        }
////        System.out.println("Found palindrome starting at " + i + ", ending at " + j); for debug
//        return j - i - 1;
//    }

    public static void main(String[] args) {
        LongestPalindromicSubString ll = new LongestPalindromicSubString();
        String s = "baab";

        int  longestPalindrome = ll.lengthOfLongestSubstring(s);

        System.out.println("Longest palindrome substring: " + longestPalindrome);
    }
}

//Certainly! Let's walk through the provided example:
//
//        Input: s = "abcabcbb"
//
//        Output: 3
//
//        We'll use the sliding window technique to find the length of the longest substring without repeating characters.
//
//        1. Initialize necessary variables:
//        - `start`: Starting index of the current substring (initialized to 0)
//        - `end`: Ending index of the current substring (initialized to 0)
//        - `maxLength`: Length of the longest substring without repeating characters (initialized to 0)
//        - `charIndexMap`: A HashMap to store the index of each character in the current substring
//
//        2. Iterate through the input string:
//        - At each step, we expand the window by moving the `end` pointer to the right.
//        - Check if the current character (`s.charAt(end)`) is already present in the `charIndexMap`.
//        - If it is, we move the `start` pointer to the right of the previous occurrence of the character (`charIndexMap.get(currentChar) + 1`).
//        - Update the index of the current character in the `charIndexMap`.
//        - Update the maximum length of the substring (`maxLength`) if needed.
//
//        Let's debug the example step by step:
//
//        1. Iteration 1: "a"
//        - `start`: 0, `end`: 0, `maxLength`: 0
//        - Current window: "a"
//        - Update `charIndexMap`: {'a': 0}
//        - Update `maxLength` to 1
//
//        2. Iteration 2: "ab"
//        - `start`: 0, `end`: 1, `maxLength`: 1
//        - Current window: "ab"
//        - Update `charIndexMap`: {'a': 0, 'b': 1}
//        - Update `maxLength` to 2
//
//        3. Iteration 3: "abc"
//        - `start`: 0, `end`: 2, `maxLength`: 2
//        - Current window: "abc"
//        - Update `charIndexMap`: {'a': 0, 'b': 1, 'c': 2}
//        - Update `maxLength` to 3
//
//        4. Iteration 4: "abca"
//        - `start`: 1, `end`: 3, `maxLength`: 3
//        - Current window: "bca"
//        - Update `charIndexMap`: {'a': 3, 'b': 1, 'c': 2}
//        - No update to `maxLength`
//
//        5. Iteration 5: "abcab"
//        - `start`: 1, `end`: 4, `maxLength`: 3
//        - Current window: "bcab"
//        - Update `charIndexMap`: {'a': 3, 'b': 4, 'c': 2}
//        - No update to `maxLength`
//
//        6. Iteration 6: "abcabc"
//        - `start`: 1, `end`: 5, `maxLength`: 3
//        - Current window: "bcabc"
//        - Update `charIndexMap`: {'a': 3, 'b': 5, 'c': 4}
//        - No update to `maxLength`
//
//        7. Iteration 7: "abcabcb"
//        - `start`: 2, `end`: 6, `maxLength`: 3
//        - Current window: "cabcb"
//        - Update `charIndexMap`: {'a': 3, 'b': 6, 'c': 4}
//        - No update to `maxLength`
//
//        The final result is `maxLength = 3`, which is the length of the longest substring without repeating characters ("abc").