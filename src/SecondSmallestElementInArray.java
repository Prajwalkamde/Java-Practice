import java.util.Arrays;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {34,45,59,67,82,91};
        int second_smallest = arr[1];
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] < second_smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println(second_smallest);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}
