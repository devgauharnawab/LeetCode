package april_code_leetcode;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch){
        //find character index
        int indx = word.indexOf(ch);
        //if character is not exist return nothing
        if(indx == -1)
            return word;
        StringBuilder sb = new StringBuilder(word.substring(0,indx+1)).reverse();
        //then we have to append
        if(indx+1 < word.length()){
            sb.append(word.substring(indx+1));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String word = "abcdefd";
        char ch = 'd';
        String res = reversePrefix(word,ch);
        System.out.println(res);
    }
}