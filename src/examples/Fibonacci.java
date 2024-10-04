package examples;

public class Fibonacci {
    public static void main(String[] args) {
        int length = 10;
        int prev = 0,next = 1;

        System.out.print(prev + " " + next);
        for (int i=2;i<=length;i++){
            int nextNum = prev + next;
            System.out.print(" "+ nextNum);
            prev = next;
            next = nextNum;
        }
    }
}
