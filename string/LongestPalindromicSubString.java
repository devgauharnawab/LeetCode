package string;

public class LongestPalindromicSubString {
    public String longestPalindrome(String s){
        int start = 0;
        int end = 0;
        // string ke length tak chalenge
        for (int i = 0; i < s.length(); i++){
            int length1 = expandAroundCenter(s,i,i+1); // edge cases b a a b
            int length2 = expandAroundCenter(s,i,i); // edge cases b a b
            int maxLength = Math.max(length1,length2);
            //update karenge start or end index ko
            if (end - start < maxLength){
                start = i - (maxLength - 1) / 2;
                end = i + maxLength/2;
            }
        }
        return s.substring(start,end+1);
    }
    int expandAroundCenter(String s , int i , int j){
//        System.out.println("Expanding around center " + i + ", " + j); // for debug
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
//            System.out.println("Checking characters " + s.charAt(i) + " and " + s.charAt(j)); for debung
            i--;
            j++;
        }
//        System.out.println("Found palindrome starting at " + i + ", ending at " + j); for debug
        return j - i - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubString ll = new LongestPalindromicSubString();
        String s = "baab";

        // Call the correct method 'longestPalindrome' to find the longest palindrome
        String longestPalindrome = ll.longestPalindrome(s);
        System.out.println("Longest palindrome substring: " + longestPalindrome);
    }
}
