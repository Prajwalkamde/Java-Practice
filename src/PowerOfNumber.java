import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Enter power of a number : ");
        int power = sc.nextInt();

        int result = (int) Math.pow(num, power);
        System.out.println(num + " to the power " + power + " is "+  result);


//        Using for loop
        int base=5;
        int pow=5;
        int res=1;

        for(int i = 1; i <= pow; i++){
            res = res * base;
        }
        System.out.println(res);

    }
}
