package methods;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;
        int num3 = 35;
        int largeNum;
        if (num1 > num2){
            if (num1 > num3){
                largeNum = num1;
            } else {
                largeNum = num3;
            }
        } else {
            if(num2 > num3){
                largeNum = num2;
            } else {
                largeNum = num3;
            }
        }
        System.out.println(largeNum);
    }
}
