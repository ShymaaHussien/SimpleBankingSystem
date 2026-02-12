package exception;

/**
 * Custom exception for insufficient balance cases.
 */
public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
