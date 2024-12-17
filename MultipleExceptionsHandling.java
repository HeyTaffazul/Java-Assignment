import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();//Read the input

            //Check if the input is a negative number
            if (userInput < 0) {
                System.out.println("Error: Please enter a non-negative integer.");
            } else {
            //Attempt to divide 100 by the entered value
                int result = 100 / userInput;
                System.out.println("Result: " + result);
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
