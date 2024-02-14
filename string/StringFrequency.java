package string;
import java.util.*;
public class StringFrequency {
    public static HashMap<Character, Integer> findCharacterFrequency(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String inputString = "example";
        HashMap<Character, Integer> frequencyMap = findCharacterFrequency(inputString);
        System.out.println("Character frequencies: " + frequencyMap);
    }
}
