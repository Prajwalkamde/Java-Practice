import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i < num ; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Factors of " + num + " is : "+ factors);
    }
}
