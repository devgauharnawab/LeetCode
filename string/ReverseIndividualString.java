package string;

public class ReverseIndividualString {
    static void reverseEachString(String[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = reverseString(arr[i]);
        }
    }
    static String reverseString(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end){
            //swap character
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String[] ArrayOfString = {"bawan", "rahuag", "rimaa", "devan"};

        // Reverse each string in the array
        reverseEachString(ArrayOfString);

        // Print the modified array
        for (String str : ArrayOfString) {
            System.out.print(str + " ");
        }
    }
}
