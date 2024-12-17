import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();//Reading the age input from the user

            //Validate the age
            if (age < 0 || age > 150) {
            //Throw custom exception if age is invalid
                throw new InvalidAgeException("Error: Age must be between 0 and 150.");
            }

            System.out.println("Your age is: " + age);//Valid age input

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());//Display the error message for invalid age
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());// Handle unexpected errors
        } finally {
            scanner.close();//Close the scanner
        }
    }
}
