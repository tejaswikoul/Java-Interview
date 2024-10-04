package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinUsingStreams {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(20,11,9,2,36,98,65,73,46,55);

        Integer max = numList.stream()
                .max(Comparator.naturalOrder())
                .get();

        Integer min = numList.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
