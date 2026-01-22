import java.util.ArrayList;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9};
        ArrayList<Integer> reversed_arr = new ArrayList<>();

        for (int i = arr.length-1; i >= 0; i--) {
            reversed_arr.add(arr[i]);
        }
        System.out.println(reversed_arr);
    }
}
