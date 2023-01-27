
// import java.lang.reflect.Array;
import java.util.*;

public class pr19RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int larr[] = new int[k];
        int rarr[] = new int[n - k];

        larr = Arrays.copyOfRange(arr, 0, k);
        rarr = Arrays.copyOfRange(arr, k, n);
        int res[] = new int[n];

        for (int i = 0; i < n - k; i++) {
            res[i] = rarr[i];
        }
        for (int i = 0; i < k; i++) {
            res[n - k + i] = larr[i];
        }
        // System.out.println(Arrays.toString(res));
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
