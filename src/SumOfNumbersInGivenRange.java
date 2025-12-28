import java.util.Scanner;

public class SumOfNumbersInGivenRange {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter n1 : ");
        int n1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter n2 : ");
        int n2 = sc2.nextInt();

        int sum = 0;

        for (int i = n1; i <= n2; i++){
            sum += i;

        }
        System.out.println("The sum between numbers " + n1 + " and " + n2 + " is " + sum);
    }
}
