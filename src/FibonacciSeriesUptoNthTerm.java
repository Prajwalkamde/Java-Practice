import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeriesUptoNthTerm {
    static ArrayList<Integer> fibonacci =   new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term : ");
        int num = sc.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);

        Fibonacci(num);
        System.out.println(fibonacci);
    }
    static void Fibonacci(int n){
        if (n <= 2){
            return;
        }
        for (int i = 2; i < n; i++) {
            fibonacci.add(fibonacci.get(i -1) + fibonacci.get(i - 2));
            
        }
    }

}
