import java.util.Scanner;

import static java.lang.Math.min;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num1 : ");
        int num2 = sc.nextInt();

        int hcf = 1;
        for (int i = 1; i <= min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
}
