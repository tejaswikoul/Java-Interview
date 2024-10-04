package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInAnArray {
    public static void main(String[] args) {
        String[] names = {"Tony","Pepper","Peter","Tony","Hogan","Wong","Peter"};
        int count = 0;

        Map<String, Integer> namesMap = new HashMap<>();

        for (String name:names){
            namesMap.put(name,namesMap.getOrDefault(name,count)+1);
        }

        for (Map.Entry<String,Integer> entry : namesMap.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}