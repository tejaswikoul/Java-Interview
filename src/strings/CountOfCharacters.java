package strings;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacters {
    public static void main(String[] args) {
        String original = "Joe Goldberg";
        String name = original.toLowerCase().replaceAll(" ", "");
        Map<Character,Integer> characterMap = new HashMap<>();
        for (int i=0;i<name.length();i++){
            char c = name.charAt(i);
            characterMap.put(c,characterMap.getOrDefault(c,0)+1);
        }
        System.out.println(characterMap);
    }
}
