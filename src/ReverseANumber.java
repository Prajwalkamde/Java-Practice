public class ReverseANumber {
    public static void main(String[] args) {
        int num = 5874652;

        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            System.out.print(digit);

        }
    }
}
