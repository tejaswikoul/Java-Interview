package exception;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException() {
        System.out.println("Insufficient Funds. Please Check Your Balance and Try Again.");
    }
}
