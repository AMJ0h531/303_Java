import java.util.Scanner;

// EXERCISE: Calculator
// Read two numbers from the user.
// Print their sum, difference, product, quotient, and REMAINDER.

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO: Read two integers from the user
        System.out.print("Enter first number: ");
        int numl =sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 =sc.nextInt();

        // TODO: Print the results
         System.out.println("Sum: " + (numl + num2));
         System.out.println("Difference: " + (numl - num2));
         System.out.println("Product: " + (numl * num2));
         System.out.println("Quotient: " + (num2 / numl));
         System.out.println("Remainder: " + (num2 % numl));

        // BONUS: What happens if num2 is 0?
        // BONUS: Use printf to format the output nicely

        sc.close();
    }
}
