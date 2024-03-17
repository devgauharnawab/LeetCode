package string;
import java.util.*;

public class ReverseArrayOfString {
    static void reverseArrayString(String[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String[] ArrayOfString = {"nawab","gauhar"};

        // Reverse the array
        reverseArrayString(ArrayOfString);

        // Print the reversed array
        System.out.println(Arrays.toString(ArrayOfString));
    }
}
