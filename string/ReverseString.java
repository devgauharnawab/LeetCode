package string;

public class ReverseString {
    static void reversedString(char[] s){
        int start = 0;
        int end = s.length-1;
        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        ReverseString rr = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        reversedString(s);
        System.out.println(s);

    }
}
