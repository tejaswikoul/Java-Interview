package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
        String[] names = {"Joe","Beck","Rhys","Will","Adam","Zack","Doug","James"};
        List<String> nameList = Arrays.asList(names);
        Collections.sort(nameList);
        System.out.println(nameList);
    }
}
