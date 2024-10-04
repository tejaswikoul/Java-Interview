package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompareDifferentMaps {
    public static void main(String[] args) {
        Map<Integer,String> departmentMap = new HashMap<>();
        Map<Integer,String> departmentLinkedHashMap = new LinkedHashMap<>();

        departmentMap.put(101,"Sales");
        departmentMap.put(102,"Trading");
        departmentMap.put(103,"Finance");
        departmentMap.put(104,"Medical");

        departmentLinkedHashMap.put(101,"Sales");
        departmentLinkedHashMap.put(102,"Trading");
        departmentLinkedHashMap.put(103,"Finance");
        departmentLinkedHashMap.put(104,"Medical");

        System.out.println(departmentMap);
        System.out.println(departmentLinkedHashMap);
    }
}
