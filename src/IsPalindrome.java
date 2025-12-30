import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while (num > 0){
            int digit = num % 10;

            // num = 1221
            // Iteration 1: reverse = (0 * 10) + 1  = 1
            // Iteration 2: reverse = (1 * 10) + 2  = 12
            // Iteration 3: reverse = (12 * 10) + 2 = 122
            // Iteration 4: reverse = (122 * 10) + 1 = 1221
            reverse = (reverse * 10) + digit;

            num = num / 10;
        }
        if (temp == reverse){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
