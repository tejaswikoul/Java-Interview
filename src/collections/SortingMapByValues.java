package collections;

import java.util.Arrays;
import java.util.Map;

public class SortingMapByValues {
    public static void main(String[] args) {
        Map<String,Integer> employeeMap = Map.of(
                "David",20,
                "John",19,
                "Alex",33,
                "Tony",55,
                "Peter",17
        );

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

//        employeeMap.entrySet().stream()
//                .sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
//                .forEach(System.out::println);
    }
}
