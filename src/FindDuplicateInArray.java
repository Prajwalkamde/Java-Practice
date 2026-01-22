import java.util.ArrayList;
import java.util.List;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,8,9,66,44,5,7};
        List<Integer> duplicates = new ArrayList<>();
        for (int i : arr){
            if (count(arr, i) > 1 && !duplicates.contains(i)){
                duplicates.add(i);
            }
        }
        System.out.println(duplicates);
    }

    static int count(int[] arr, int value){
        int cnt = 0;
        for (int i : arr){
            if (i == value){
                cnt ++;
            }
        }
        return cnt;
    }
}
