package examples;

public class CountOfEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int evenCount = 0;
        int oddCount = 0;
        for (int num: nums){
            if (num%2==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
