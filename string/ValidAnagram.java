package string;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        //there are three steps to solve it
        //first we convert into charArray
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        //then we sort into Alphabetical order
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //then we check if equals we return true otherwise false
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args){
        //test cases
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        if (result) {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are valid anagrams.");
        } else {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are not valid anagrams.");
        }
    }
}
