import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int k) {
        k = k % arr.length; // In case k is greater than array length
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        System.out.println("Rotated Array: " + Arrays.toString(arr)); // Output: [4, 5, 1, 2, 3]
    }
}
