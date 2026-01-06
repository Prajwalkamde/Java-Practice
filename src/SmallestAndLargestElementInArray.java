import java.util.Arrays;

public class SmallestAndLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0};
        int max = 0;
        int min = arr[0];

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest element of array : " + max);
        System.out.println("Smallest element of array : " + min);
    }
}
