import java.util.*;

public class findMaximumOfArrayRecursively {
    public static int findMax(int arr[], int idx) {
        if (idx == arr.length - 1)
            return arr[idx];

        return Math.max(arr[idx], findMax(arr, idx + 1));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 2, 5, 555 };
        System.out.println(findMax(arr, 0));
    }
}
