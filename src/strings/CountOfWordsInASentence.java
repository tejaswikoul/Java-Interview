package strings;

import java.util.HashMap;
import java.util.Map;

public class CountOfWordsInASentence {
    public static void main(String[] args) {
        String sentence = "The sun rises early in the morning and sets in the evening";
        String[] tokens = sentence.toLowerCase().split(" ");
        Map<String, Integer> stringMap = new HashMap<>();
        for (String token: tokens){
            stringMap.put(token, stringMap.getOrDefault(token,0)+1);
        }
        System.out.println(stringMap);
    }
}
