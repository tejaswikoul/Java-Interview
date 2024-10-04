package examples;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 13;
        if (number <= 1){
            System.out.println(number + " is not a prime.");
        } else {
            for (int i = 2; i <= number/2 ; i++) {
                if (number % i == 0){
                    System.out.println(number + " is not a prime.");
                    break;
                } else {
                    System.out.println(number + " is prime.");
                    break;
                }
            }
        }
    }
}
