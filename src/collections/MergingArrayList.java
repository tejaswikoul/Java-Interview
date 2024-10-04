package collections;

import java.util.*;

public class MergingArrayList {
    public static void main(String[] args) {
        ArrayList<String> departmentList1 = new ArrayList<>(List.of("HR","Sales","Finance","Organizer"));
        ArrayList<String> departmentList2 = new ArrayList<>(List.of("Accounts","SEZ","Finance","HR"));
        departmentList1.addAll(departmentList2);
        Set<String> uniqueSet = new HashSet<>(departmentList1);
        System.out.println(uniqueSet);
    }
}
