package string;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s){
        //make stack to store opening brackets
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else if (s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            } else if (s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            } else if (s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis vv = new ValidParanthesis();
        String s1 = "()"; // Valid
        String s2 = "()[]{}"; // Valid
        String s3 = "(]"; // Invalid
        String s4 = "([)]"; // Invalid
        String s5 = "{[]}"; // Valid

        System.out.println("Is \"" + s1 + "\" valid? " + vv.isValid(s1)); // true
        System.out.println("Is \"" + s2 + "\" valid? " + vv.isValid(s2)); // true
        System.out.println("Is \"" + s3 + "\" valid? " + vv.isValid(s3)); // false
        System.out.println("Is \"" + s4 + "\" valid? " + vv.isValid(s4)); // false
        System.out.println("Is \"" + s5 + "\" valid? " + vv.isValid(s5)); // true
    }
}
