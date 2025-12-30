// Armstrong Numbers
// Example:
// Input  : 371
// Output : It's an Armstrong Number
// Reason : 371 = 3^3 + 7^3 + 1^3

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int copy_num = num;

        // Find number of digits in the number
        int len_of_num = String.valueOf(num).length();

        // Variable to store sum of powers of digits
        int sum = 0;

        // Loop runs once for each digit
        for (int i = 1; i <= len_of_num; i++) {

            // Extract last digit of the number
            int digit = num % 10;

            // Remove last digit from the number
            num = num / 10;

            // Add digit raised to power of number length
            // Math.pow() is used because Java has no ** operator
            sum = (int) (sum + Math.pow(digit, len_of_num));
        }

        if (copy_num == sum) {
            System.out.println(copy_num + " is an Armstrong number");
        } else {
            System.out.println(copy_num + " is not an Armstrong number");
        }
    }
}
