import java.util.Scanner;

public class SumofFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int summ = 0;

        for (int i = 0; i <= num; i++) {
            summ += i;
        }
        System.out.println(summ);

//        using formula
        System.out.println(num * (num+1) / 2);
    }
}
