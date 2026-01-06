public class SmallestElementOfArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 9, 7};
        int min = arr[0];

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
