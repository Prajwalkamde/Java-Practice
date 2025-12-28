public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 15421;
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);

        //Using recursion
        System.out.println(getSum(num, sum));
    }

//    Using recursion
    static int getSum(int num, int sum){
        if (num == 0){
            return sum;
        }
        sum += num % 10;
        num /= 10;

        return getSum(num, sum);
    }
}
