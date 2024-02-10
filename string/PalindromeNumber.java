package string;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //convert int to String
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber pl = new PalindromeNumber();
        int x = 121;
        boolean res = pl.isPalindrome(x);
        System.out.println(res);
    }
}
