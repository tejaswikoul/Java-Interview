package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringMatcher {
    public static void main(String[] args) {
        List<String> nameList = List.of("Tony","Cherry","Peter","Happy","Morgan","Gary","Rhys");
        Set<String> stringSet = Set.of("Tony","Cherry","Peter","Happy","Morgan","Gary","Rhys");
        boolean s = nameList.stream()
                .map(String::toLowerCase)
                .anyMatch(c -> c.matches("tony"));
        if (s){
            System.out.println("Match Found");
        } else {
            System.out.println("Not Found.");
        }

        if (stringSet.contains("Gary")) {
            System.out.println("The Set Contains the element");
        } else {
            System.out.println("Element Not Found.");
        }

        Set<String> limitSet = nameList.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(limitSet);
    }
}
