import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String reversed = "";

        int n = str.length() - 1;
        for (int i = n; i >=0 ; i--) {
            reversed = reversed + str.charAt(i);

        }
        System.out.println(reversed);
        sc.close();
    }
}
