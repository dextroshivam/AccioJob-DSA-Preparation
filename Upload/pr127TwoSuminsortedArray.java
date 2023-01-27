
/**
 * pr127TwoSuminsortedArray
 */
import java.util.*;

public class pr127TwoSuminsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == target && i < j) {
                    System.out.println(i + 1 + " " + (j + 1));
                    return;
                }
            }
        }
    }
}
// 4 9
// 2 7 5 11
// import java.util.*;
// public class pr127TwoSuminsortedArray {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// }

// }