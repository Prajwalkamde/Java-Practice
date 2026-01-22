public class CountDigits {
    public static void main(String[] args) {
        int number = 5478954;
        int count = 0;

        while (number > 0){
            int digit = number % 10;
            count ++;
            number = number / 10;
        }
        System.out.println(count);
    }
}
