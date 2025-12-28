import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range : ");
        int start = sc.nextInt();

        System.out.println("Enter end range : ");
        int end = sc.nextInt();


        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int num = start; num <= end; num++){
            if (num <= 1){
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < num; i++){

                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(num);
            }
        }
        System.out.println("Prime Numbers between "+ start + " and " + end + " is : " + primeNumbers);

    }
}
