package gfg.array_50_questions;

public class ReverseWord {
    public static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Geeks";
        String ans = reverseWord(s);
        System.out.println(ans);
    }
}
