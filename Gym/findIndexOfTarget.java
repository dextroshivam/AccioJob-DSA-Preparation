import java.util.*;

public class findIndexOfTarget {
    public static int findIdx(int arr[], int idx, int target) {
        if (idx >= 0) {
            if (arr[idx] == target) {
                return idx;
            } else {
                return findIdx(arr, idx - 1, target);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 4, 2 };
        System.out.println(findIdx(arr, arr.length - 1, 9));
    }
}
