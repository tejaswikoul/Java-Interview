package collections;

import java.util.*;

public class DuplicatesInList {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Tony","Peter","Dan","Alex","Tony","Dan","Happy","Parker","Peter");
        Set<String> noDuplicates = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name: namesList){
            if (!noDuplicates.add(name)){
                duplicates.add(name);
            }
        }
        System.out.println("Duplicate Elements: " + duplicates);

    }
}
