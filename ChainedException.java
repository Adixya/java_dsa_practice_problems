public class ChainedException {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performOperation() throws Exception {
        try {
            // Simulate an exception by dividing by zero
            int result = divide(10, 0);
        } catch (ArithmeticException innerException) {
            // Create a new exception and chain it to the inner exception
            Exception outerException = new Exception("An error occurred during the operation.");
            outerException.initCause(innerException);
            throw outerException;
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }

}
