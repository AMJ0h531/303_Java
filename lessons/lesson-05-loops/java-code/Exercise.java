// EXERCISE: Reverse a Number
// Given an integer like 12345, produce 54321
// Use the SAME while/modulus pattern, but build a reversed number.
//
// Hint: reversed = reversed * 10 + digit

public class Exercise {
    public static void main(String[] args) {

        int num = 54321;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.println("digit:" + num + " running sum: " + sum);
            num /= 10;
            System.out.println("Sum of digits: " + sum);
        }
    }
}