public class LargestElementOfArray {
    public static void main(String[] args) {
        int [] arr = {5, 60, 8, 9, 0, 3};
        int max = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
