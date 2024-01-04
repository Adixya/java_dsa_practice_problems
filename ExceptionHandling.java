import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int quotient(int num, int den) throws ArithmeticException {
        return num / den;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResu1t: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException ime) {
                System.err.printf("%nException: %s%n", ime);
                scanner.nextLine();
                System.out.println("You must enter integers only!");
            } catch (ArithmeticException ae) {
                System.err.printf("%nException: %s%n", ae);
                System.out.println("Zero invalid denominator!");

            }
        } while (continueLoop);
        scanner.close();
    }
}
