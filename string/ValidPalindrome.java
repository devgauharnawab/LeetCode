package string;

public class ValidPalindrome {
    public static boolean isValidPalindrome(String s){
        //convert to lower case
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }else{
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] testCases = {
                "A man, a plan, a canal, Panama!",
                "racecar",
                "hello",
                "12321",
                "A Toyota's a Toyota",
                "race a car",
                "Nawab",
                "Was it a car or a cat I saw?"
        };

        for (String testCase : testCases) {
            System.out.println(testCase + " is palindrome: " + isValidPalindrome(testCase));
        }
    }
}
