
/**
 * pr135SumOfArrayElementsUsingRecursion
 */
import java.util.*;

public class pr135SumOfArrayElementsUsingRecursion {
    public static int sumOfArray(int arr[], int idx) {
        if (idx == 0) {
            return arr[0];
        }
        return sumOfArray(arr, idx - 1) + arr[idx];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfArray(arr, n - 1));
    }

}