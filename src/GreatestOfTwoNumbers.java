public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        int n1 = 630;
        int n2= 10;

        if (n1 == n2){
            System.out.println("Both numbers are equal");
        }
        else if (n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }

        else {
            System.out.println(n2 + " is greater than " + n1);
        }

    }
}
