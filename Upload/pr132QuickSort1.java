
/**
 * pr132QuickSort1
 */
import java.util.*;

public class pr132QuickSort1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans[] = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        int pivot = arr[0];

        for (int i : arr) {
            if (i < pivot)
                ans.add(i);
        }
        for (int i : arr) {
            if (i == pivot)
                ans.add(i);
        }
        for (int i : arr) {
            if (i > pivot)
                ans.add(i);
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}